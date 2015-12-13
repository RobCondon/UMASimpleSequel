package edu.uma.umasimplesequel;

import java.util.ArrayList;


/**
 * Created by Mike Hebert on 11/11/2015.
 */
public class Course {
    private String Course_Name;
    private String Course_Num;
    private String Course_Date_Start;
    private String Course_Date_End;
    private String Course_Room;
    private String Course_Instructor;
    private ArrayList<Section> Course_Section;

    /**
     * Course empty constructor
     */
    public Course(){
        String Course_Name="";
        String Course_Num="";
        String Course_Date_Start="";
        String Course_Date_End="";
        String Course_Room="";
        String Course_Instructor="";
        ArrayList Course_Section= new ArrayList<Section>();
    }

    /**
     * Course Constructor
     * @param cName
     * @param cNum
     * @param cStart
     * @param cEnd
     * @param cRoom
     * @param cInstructor
     * @param arySec
     */

    public Course(String cName,String cNum,String cStart,String cEnd,String cRoom,String cInstructor,ArrayList arySec){
        Course_Name=cName;
        Course_Num=cNum;
        Course_Date_Start=cStart;
        Course_Date_End=cEnd;
        Course_Room=cRoom;
        Course_Instructor=cInstructor;
        Course_Section=arySec;

    }

    /**
     * Get course name
     * @return
     */
    public String getCourse_Name() {
        return Course_Name;
    }

    /**
     * set course name
     * @param course_Name
     */
    public void setCourse_Name(String course_Name) {
        Course_Name = course_Name;
    }

    /**
     * Gets the Num
     * @return
     */

    public String getCourse_Num() {
        return Course_Num;
    }

    /**
     * Sets the Num
     * @param course_Num
     */
    public void setCourse_Num(String course_Num) {
        Course_Num = course_Num;
    }

    /**
     * get course start
     * @return
     */

    public String getCourse_Date_Start() {
        return Course_Date_Start;
    }

    /**
     * Set course start
     * @param course_Date_Start
     */

    public void setCourse_Date_Start(String course_Date_Start) {
        Course_Date_Start = course_Date_Start;
    }

    /**
     * get Course end
     * @return
     */

    public String getCourse_Date_End() {
        return Course_Date_End;
    }

    /**
     * Set course end
     * @param course_Date_End
     */
    public void setCourse_Date_End(String course_Date_End) {
        Course_Date_End = course_Date_End;
    }

    /**
     * Get course room
     * @return
     */
    public String getCourse_Room() {
        return Course_Room;
    }

    /**
     * Set course room
     * @param course_Room
     */
    public void setCourse_Room(String course_Room) {
        Course_Room = course_Room;
    }

    /**
     * Get course instructor
     * @return
     */
    public String getCourse_Instructor() {
        return Course_Instructor;
    }

    /**
     * Set instructor
     * @param course_Instructor
     */
    public void setCourse_Instructor(String course_Instructor) {
        Course_Instructor = course_Instructor;
    }

    /**
     * get Course section
     * @return
     */
    public ArrayList getCourse_Section() {
        return Course_Section;
    }

    /**
     * set course section
     * This arrlist is going to hold all the section objects associated with the course object.
     * @param course_Section
     */
    public void setCourse_Section(ArrayList course_Section) {
        Course_Section = course_Section;
    }

    public void addSec(Section sec) {
        Course_Section.add(sec);

    }

}
