package proje.pkg4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Characters {
    String ID;
    String Ad;
    String Tür;
    String ikonYolu;
    ArrayList<Integer> yol;
    ArrayList<Integer> yol2;
    //public shortestPath();
    
    public Characters(String Id, String Ad, String Tür, String ikonYolu) {
        this.ID = ID;
        this.Ad = Ad;
        this.Tür = Tür;
        this.ikonYolu = ikonYolu;
    }

    public Characters() {
    }
    static int maze[][] = new int[11][13];
    private int[][] kenarlar;
    private Object[] komsular;

  

    public void rF() {

        try {
            File file = new File("C:\\Users\\yavuz\\Desktop\\NetBeansProjects\\Proje 4\\src\\proje\\pkg4\\harita.txt");
            Scanner reader = new Scanner(file);
            int i = 0;
            String p = reader.nextLine();
            String e1 = reader.nextLine();
            String e2 = reader.nextLine();
            for (int row = 0; row < 11; row++) {
                for (int col = 0; col < 13; col++) {
                    maze[row][col] = reader.nextInt();
                }

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Proje4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int boyut() {
        return komsular.length;
    }

    public void setKomsu(int anglePoint, Object tag) {
        komsular[anglePoint] = tag;
    }

    public Object getKomsu(int anglePoint) {
        return komsular[anglePoint];
    }

    public void kenarEkle(int start, int stop) {
        kenarlar[start][stop] = 1;
    }

    public boolean kenarmı(int start, int stop) {
        return kenarlar[start][stop] > 0;
    }

    public int yolMaaliyeti(int start, int stop) {
        return kenarlar[start][stop];
    }

    public int[] neighbors(int anglePoint) {
        int say = 0;
        for (int i = 0; i < kenarlar[anglePoint].length; i++) {
            if (kenarlar[anglePoint][i] > 0) {
                say++;
            }
        }
        final int[] yanıt = new int[say];
        say = 0;
        for (int i = 0; i < kenarlar[anglePoint].length; i++) {
            if (kenarlar[anglePoint][i] > 0) {
                yanıt[say++] = i;
            }
        }
        return yanıt;
    }


        public static Characters enKisaYol() {
        Characters asd = new Characters();
        asd.rF();
        int sayac = 0;

        final Characters t = new Characters(144);
        for (int i = 0; i < 143; i++) {
            t.setKomsu(i, i);
        }
        t.setKomsu(143, 143);
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 13; j++) {
                if ((j == 12) || (i == 10)) {

                } else {
                    if (maze[i][j] == 1) {
                        if (maze[i][j + 1] == 1) {
                            if(sayac==103){
                                t.kenarEkle(103,143);
                                t.kenarEkle(143,103);
                            }else{
                                t.kenarEkle(sayac, sayac + 1);
                                t.kenarEkle(sayac + 1, sayac);}
                            
                        }
                        if (maze[i + 1][j] == 1) {
                            if(sayac!=103){
                            t.kenarEkle(sayac, sayac + 13);
                            t.kenarEkle(sayac + 13, sayac);}
                        }
                    }
                }
                sayac++;
            }
        }
        return t;
    }
    public Characters(int n) {
    kenarlar = new int[n][n];
    komsular = new Object[n];
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getTür() {
        return Tür;
    }

    public void setTür(String Tür) {
        this.Tür = Tür;
    }

    public String getIkonYolu() {
        return ikonYolu;
    }

    public void setIkonYolu(String ikonYolu) {
        this.ikonYolu = ikonYolu;
    }

    public ArrayList<Integer> getYol() {
        return yol;
    }

    public void setYol(ArrayList<Integer> yol) {
        this.yol = yol;
    }

    public ArrayList<Integer> getYol2() {
        return yol2;
    }

    public void setYol2(ArrayList<Integer> yol2) {
        this.yol2 = yol2;
    }
    
}
