package edu.uma.umasimple;

import java.util.ArrayList;

/**
 * Created by Mike on 11/11/2015.
 */
public class Course {
    private String Course_Name;
    private String Course_StartDate;
    private String Course_EndDate;
    private String Course_Room;
    private String Course_Instructor;
    private ArrayList<Section> Course_Section;

    /**
     * Empty Constructor
     */
    public Course(){
        Course_Name = "";
        Course_StartDate = "";
        Course_EndDate = "";
        Course_Room = "";
        Course_Instructor = "";
        Course_Section= new ArrayList<Section>();
    }

    /**
     * Main Constructor
     * @param course_Name
     * @param course_StartDate
     * @param course_EndDate
     * @param course_Room
     * @param course_Instructor
     * @param course_Section
     */
    public Course(String course_Name, String course_StartDate, String course_EndDate, String course_Room, String course_Instructor, ArrayList<Section> course_Section) {
        Course_Name = course_Name;
        Course_StartDate = course_StartDate;
        Course_EndDate = course_EndDate;
        Course_Room = course_Room;
        Course_Instructor = course_Instructor;
        Course_Section = course_Section;
    }

    /**
     * Get it
     * @return
     */
    public String getCourse_Name() {
        return Course_Name;
    }

    /**
     * Set it
     * @param course_Name
     */
    public void setCourse_Name(String course_Name) {
        Course_Name = course_Name;
    }

    /**
     * get it
     * @return
     */
    public String getCourse_StartDate() {
        return Course_StartDate;
    }

    /**
     * Set it
     * @param course_StartDate
     */
    public void setCourse_StartDate(String course_StartDate) {
        Course_StartDate = course_StartDate;
    }

    /**
     * Get it
     * @return
     */
    public String getCourse_EndDate() {
        return Course_EndDate;
    }

    /**
     * Set it
     * @param course_EndDate
     */
    public void setCourse_EndDate(String course_EndDate) {
        Course_EndDate = course_EndDate;
    }

    /**
     * Get it
     * @return
     */
    public String getCourse_Room() {
        return Course_Room;
    }

    /**
     * Set it
     * @param course_Room
     */
    public void setCourse_Room(String course_Room) {
        Course_Room = course_Room;
    }

    /**
     * Get it
     * @return
     */
    public String getCourse_Instructor() {
        return Course_Instructor;
    }

    /**
     * Set it
     * @param course_Instructor
     */
    public void setCourse_Instructor(String course_Instructor) {
        Course_Instructor = course_Instructor;
    }

    /**
     * Get it
     * @return
     */
    public ArrayList<Section> getCourse_Section() {
        return Course_Section;
    }

    /**
     * Set it
     * @param course_Section
     */
    public void setCourse_Section(ArrayList<Section> course_Section) {
        Course_Section = course_Section;
    }
}
