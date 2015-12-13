package edu.uma.umasimplesequel;

/**
 * Created by Mike Hebert on 11/11/2015.
 */
public class Section extends Course {
    private String Sec_Dis;
    private int Sec_Num;
    public Section(){
        super();
        Sec_Dis="";
    }

    /**
     * Section constructor
     * @param sDes
     * @param sNum
     */
    public Section(String sDes, int sNum){
        super();
        Sec_Dis=sDes;
        Sec_Num=sNum;
    }


    /**
     * get Section description
     * @return
     */
    public String getSec_Dis() {
        return Sec_Dis;
    }

    /**
     * Set section Description
     * @param sec_Dis
     */
    public void setSec_Dis(String sec_Dis) {
        Sec_Dis = sec_Dis;
    }

    /**
     * Get Sec number
     * @return
     */

    public int getSec_Num() {
        return Sec_Num;
    }

    /**
     * Set section number
     * @param sec_Num
     */
    public void setSec_Num(int sec_Num) {
        Sec_Num = sec_Num;
    }
}

