package proje.pkg4;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collections;

public class Dijikstra {
      public static int [] dijikstraAlgoritmasi (Characters G, int s) {
         final int [] distance = new int [G.boyut()];
         final int [] pred = new int [G.boyut()];
         final boolean [] visited = new boolean [G.boyut()];
   
        for (int i=0; i<distance.length; i++) {
           distance[i] = Integer.MAX_VALUE;
        }
        distance[s] = 0;
  
        for (int i=0; i<distance.length; i++) {
           final int next = minAnglePoint (distance, visited);
           if(next<=distance.length){
           visited[next] = true;
  
          
  
           final int [] n = G.neighbors (next);
           for (int j=0; j<n.length; j++) {
              final int v = n[j];
              final int d = distance[next] + G.yolMaaliyeti(next,v);
              if (distance[v] > d) {
                 distance[v] = d;
                 pred[v] = next;
              }
           }}
        }
        return pred;
     }
  
     private static int minAnglePoint (int [] distance, boolean [] v) {
        int x = Integer.MAX_VALUE;
        int y = 0;
        for (int i=0; i<distance.length; i++) {
           if (!v[i] && distance[i]<x) {y=i; x=distance[i];}
        }
        return y;
     }
  
     public static ArrayList printPath (Characters G, int [] pred, int s, int e) {
        final java.util.ArrayList path = new java.util.ArrayList();
        int i=0;
        for(i=0;e!=s;i++) {
           path.add (G.getKomsu(e));
           e = pred[e];
        }
        path.add (G.getKomsu(s));
        Collections.reverse(path);
        return path;
     }
  
  }
    

