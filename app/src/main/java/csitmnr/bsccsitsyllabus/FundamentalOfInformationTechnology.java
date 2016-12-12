package csitmnr.bsccsitsyllabus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manoj Budha Ayer on 12/10/2016.
 */
public class FundamentalOfInformationTechnology extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Introduction to Information Technology\n\n" +
                "Course no: CSC-101 \t\t Full Marks: 87+10+20\n" +
                "Credit hours: 3 \t\t Pass Marks: 28+4+8\n\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: Fundamental concept of Information technology. Computer systems, Computer software, DBMS, and application of computer science.\n\n" +
                "Goal: This course introduces fundamental concepts of Information Technology and computer science.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1. Introduction to Computer Systems \t 10 Hrs.\n\n" +
                "Introduction to computers, Classification of digital computer systems, Anatomy of a digital Computer, Computer Architecture, Memory system, Memory Units, Auxiliary Storage devices, Inputs devices, Output Devices.\n\n" +
                "Unit 2. Computer Software and Software Development 6 Hrs.\n\n" +
                "Introduction to Computer Software, Operating Systems, Programming Languages, General Software Features and Trends.\n\n" +
                "Unit 3. Database Management Systems 6 Hrs.\n\n" +
                "Data processing, Introduction to Database Management systems, Database design\n\n" +
                "Unit 4. Telecommunications 8 Hrs.\n\n" +
                "Introduction to Telecommunications, Computer Networks, Communication Systems, Distributed systems\n\n" +
                "Unit 5. Internet and New Technologies in Information Technology 10 Hrs.\n\n" +
                "Internet, Multimedia tools and system, Intranets, Electronic Commerce, Hypermedia, Data Warehouses and Data Marts, Data Mining, Geographical Information System\n\n" +
                "Unit 6. Applications of Information Technology 5 Hrs.\n\n" +
                "Computers in Business and Industry, Computers in education, training, Computers in Entertainment, science, medicine and Engineering\n\n" +
                "Laboratory works: The main objective is familiarizing students with operating system and desktop applications using current version of windows.\n\n" +
                "Text / Reference books: Alexis Leon, Mathews Leon, Fundamentals of Information Technology, Leon TechWorld");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
