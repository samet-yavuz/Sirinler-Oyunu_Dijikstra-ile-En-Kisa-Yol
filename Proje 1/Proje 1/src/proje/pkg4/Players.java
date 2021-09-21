package proje.pkg4;

import java.lang.Object;

public class Players extends Characters{
    String OyuncuID;
    String OyuncuAd;
    String OyuncuTür;
    int OyuncuAdım;
    int skor=20;
    public Players() {
    }
    
    public Players(String Id, String Ad, String Tür, String ikonYolu) {
        super(Id, Ad, Tür, ikonYolu);
    }

    public Players(String OyuncuID, String OyuncuAd, String OyuncuTür, int OyuncuAdım) {
        this.OyuncuID = OyuncuID;
        this.OyuncuAd = OyuncuAd;
        this.OyuncuTür = OyuncuTür;
        this.OyuncuAdım = OyuncuAdım;
    }


    public int PuaniGoster() {
        return skor;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }
    
    
}
    class Gozluklu extends Players{
        int x;
        int y;

    public Gozluklu(String Id, String Ad, String Tür, String ikonYolu) {
        super(Id, Ad, Tür, ikonYolu);
    }

    public Gozluklu() {
    }

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
        
    }

    class Tembel extends Characters{
    
    int x;
    int y;
    
    public Tembel(String Id, String Ad, String Tür, String ikonYolu) {
        super(Id, Ad, Tür, ikonYolu);
    }

    public Tembel() {
    }

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

    }
    class Point extends Players{

    @Override
    public int PuaniGoster() {
        return super.PuaniGoster();
    }
    }
