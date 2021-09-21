package proje.pkg4;

import java.util.Random;

public class Obj {

    Random r = new Random();
    int x;
    int y;


    public Obj() {
    }

    public int getX() {
        return r.nextInt(13)*75;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return r.nextInt(11)*75;
    }

    public void setY(int y) {
        this.y = y;
    }

 
}
class Gold extends Obj {
        
    int altin=0;

        public Gold() {
        }

        public int getAltin() {
            return altin;
        }

        public void setAltin(int altin) {
            this.altin = altin;
        }

    }

    class mushroom extends Obj {

        public mushroom() {
        }

    }
