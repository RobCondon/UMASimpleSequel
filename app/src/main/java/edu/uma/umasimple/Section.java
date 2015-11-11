package edu.uma.umasimple;

/**
 * Created by Mike on 11/11/2015.
 */
public class Section {

    private String Sec_Des;
    private int Sec_Num;

    public Section() {
        Sec_Des="";
        Sec_Num=0;
    }

    /**
     * Section Constructor
     * @param sec_Des
     * @param sec_Num
     */
    public Section(String sec_Des, int sec_Num) {
        Sec_Des = sec_Des;
        Sec_Num = sec_Num;
    }

    /**
     * get Sec discription
     * @return
     */
    public String getSec_Des() {
        return Sec_Des;
    }

    /**
     * Set it
     * @param sec_Des
     */
    public void setSec_Des(String sec_Des) {
        Sec_Des = sec_Des;
    }

    /**
     * Get it
     * @return
     */
    public int getSec_Num() {
        return Sec_Num;
    }

    /**
     * Set it
     * @param sec_Num
     */
    public void setSec_Num(int sec_Num) {
        Sec_Num = sec_Num;
    }
}
