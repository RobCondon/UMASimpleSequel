package edu.uma.umasimple;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mike Hebert on 11/29/2015.
 */
public class DBHelper extends SQLiteOpenHelper {


    // Info for Database
    private static final String DATABASE_NAME = "CourseSearch";
    private static final int DATABASE_VERSION = 1;

    // To make it singleton
    private static DBHelper DB_INSTANCE;

    // Tables
    private static final String TABLE_COURSE = "COURSE";
    private static final String TABLE_SECTION = "SECTION";

    //Course Columns
    private static final String COURSE_NUM = "COURSE_NUM";
    private static final String COURSE_NAME = "COURSE_NAME";
    private static final String COURSE_DESC = "COURSE_DESC";
    private static final String COURSE_SEMESTER = "COURSE_SEMESTER";


    //Section Columns
    private static final String SECTION_NUM = "COURSE_NUM";
    private static final String SECTION_SEC_NUM = "SEC_NUM";
    private static final String SECTION_DAY = "DAY";
    private static final String SECTION_TIME = "TIME";
    private static final String SECTION_LOCATION = "LOCATION";
    private static final String SECTION_SEC_DESC = "SEC_DESC";
    private static final String SECTION_INSTRUCTOR = "INSTRUCTOR";


    /**
     * This is to stop memory leaks from happening (taken from android developer tutorial)
     * @param context
     * @return
     */
    public static synchronized DBHelper getInstance(Context context) {
        if (DB_INSTANCE == null) {
            DB_INSTANCE = new DBHelper(context.getApplicationContext());
        }

        return DB_INSTANCE;
    }

    /**
     * Basic constructor set to private so it can only be called once by the singleton method above
     * @param context
     */

    private DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * Creates the database if one is not present.  Ignored otherwise.
     * @param db
     */

    @Override
    public void onCreate(SQLiteDatabase db) {
            // creates the course table
            String CREATE_COURSE_TABLE = "CREATE TABLE " + TABLE_COURSE +
                    "(" + COURSE_NUM + "TEXT PRIMARY KEY," + COURSE_NAME + " TEXT," +
                    COURSE_DESC + " TEXT," + COURSE_SEMESTER + " TEXT" +
                    ")";

            // Creates the Section Table
            String CREATE_SECTION_TABLE = "CREATE TABLE " + TABLE_SECTION +
                    "(" + SECTION_NUM + " TEXT REFERENCES " + TABLE_COURSE + "," +
                    SECTION_SEC_NUM + " INT," + SECTION_DAY + " TEXT," + SECTION_TIME + " TEXT,"
                    + SECTION_LOCATION + " TEXT," + SECTION_SEC_DESC + " TEXT," + SECTION_INSTRUCTOR
                    + " TEXT" +
                    ")";

            //  Actually creates the tables
            db.execSQL(CREATE_COURSE_TABLE);
            db.execSQL(CREATE_SECTION_TABLE);
    db.execSQL("Insert into Course (123)");

    }// end onCreate() function

    /**
     * This will be useful when the Server is up and running
     * @param db
     * @param oldVersion
     * @param newVersion
     */

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //Checks the version
        if(oldVersion != newVersion) {

            db.execSQL("DROP TABLE IF EXISTS " + TABLE_COURSE);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_SECTION);
            onCreate(db);

        }
    }// end onUpgrade() function



    /**
     * This is how we load all the courses
     * @return
     */

    public List<Course> getAllCourses() {
        List<Course> Course =  new ArrayList<>();

        String COURSE_SELEC = "SELECT * FROM " + TABLE_COURSE;
        String SEC_SELEC = "SELECT * FROM " + TABLE_SECTION;

        SQLiteDatabase dbCourse = getReadableDatabase();
        Cursor curCourse = dbCourse.rawQuery(COURSE_SELEC, null);


        //Try to load all the courses properly
        try {
            if (curCourse.moveToFirst()) {
                do {
                    String cour_Num = curCourse.getString(curCourse.getColumnIndex(COURSE_NUM));  // Stores the course number
                    Course course = new Course(); // Makes the new course object
                    course.setCourse_Num(cour_Num);  // Sets the course name
                    Cursor curSec = dbCourse.rawQuery(SEC_SELEC, null);  // This opens the second cursor to hopefully iterate through all like sections

                    /* This is the process to loop through all sections with the same number as the course
                    *  This should make it so each section can be added to the arraylist associated with the course
                    */
                    try {
                        if(curSec.moveToFirst()){
                            do{
                                String sec_num = curSec.getString(curSec.getColumnIndex(SECTION_NUM));
                                String sec_desc = curSec.getString(curSec.getColumnIndex(SECTION_SEC_DESC));

                                if(sec_num.equals(cour_Num)){
                                    Section section = new Section();
                                    section.setSec_Num(Integer.parseInt(sec_num));
                                    section.setSec_Dis(sec_desc);
                                    course.addSec(section);
                                }

                            }while (curSec.moveToNext());


                        }

                    } catch ( Exception e) {
                        Log.d("","Error trying to get Sections! " + e);
                    } finally {
                        if(curSec != null && !curSec.isClosed()){
                            curSec.close();
                        }

                    }
                }while (curCourse.moveToNext());
            }

        } catch (Exception e) {
            Log.d("","Error trying to get Courses! " + e);
        } finally {
            if(curCourse != null && !curCourse.isClosed()) {
                curCourse.close();
            }

        }

        return Course;

    }// getAllCourses() function
}// End class
