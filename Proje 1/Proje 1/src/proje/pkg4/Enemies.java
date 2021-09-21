package proje.pkg4;
public class Enemies extends Characters{
    String DusmanID;
    String DusmanAd;
    String DusmanTür;
    
    public Enemies() {
    }

    public Enemies(String Id, String Ad, String Tür, String ikonYolu) {
        super(Id, Ad, Tür, ikonYolu);
    }

    public Enemies(String DusmanID, String DusmanAd, String DusmanTür) {
        this.DusmanID = DusmanID;
        this.DusmanAd = DusmanAd;
        this.DusmanTür = DusmanTür;
    }

    public String getDusmanID() {
        return DusmanID;
    }

    public void setDusmanID(String DusmanID) {
        this.DusmanID = DusmanID;
    }

    public String getDusmanAd() {
        return DusmanAd;
    }

    public void setDusmanAd(String DusmanAd) {
        this.DusmanAd = DusmanAd;
    }

    public String getDusmanTür() {
        return DusmanTür;
    }

    public void setDusmanTür(String DusmanTür) {
        this.DusmanTür = DusmanTür;
    }
    
}
class Gargamel extends Enemies{
        int x;
        int y;
        String door;
        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public Gargamel() {
        }
            public Gargamel (String Id, String Ad, String Tür, String ikonYolu) {
        super(Id, Ad, Tür, ikonYolu);
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

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }
        
    }
    
    class Azman extends Enemies{
        int x;
        int y;
        String door;
        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public Azman() {
        }

    public Azman(String Id, String Ad, String Tür, String ikonYolu) {
        super(Id, Ad, Tür, ikonYolu);
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

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }
        
        
    }

