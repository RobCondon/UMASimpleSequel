package edu.uma.umasimple;

/**
 * Created by Mike on 11/11/2015.
 */
public class Section {

    private String Sec_Des;
    private int Sec_Num;
    private String Sec_Location;

    public Section() {
        Sec_Des="";
        Sec_Num=0;
        Sec_Location="";
    }

    /**
     * This is the main constructor
     * @param sec_Des
     * @param sec_Num
     * @param sec_Location
     */


    public Section(String sec_Des, int sec_Num,String sec_Location) {
        Sec_Des = sec_Des;
        Sec_Num = sec_Num;
        Sec_Location=sec_Location;
    }

    /**
     * get Sec description
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

    /**
     * get it
     * @return
     */
    public String getSec_Location() {
        return Sec_Location;
    }

    /**
     * Set it
     * @param sec_Location
     */
    public void setSec_Location(String sec_Location) {
        Sec_Location = sec_Location;
    }
}
