package csitmnr.bsccsitsyllabus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manoj Budha Ayer on 12/12/2016.
 */
public class IntrotoManagement extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Introduction to Management\n\n" +
                "Course no: CSC-205 \t\tFull Marks: 90+10\n" +
                "Credit hours: 3 \t\tPass Marks: 36+4\n" +
                "Nature of course: Theory (3 Hrs.)\n\n" +
                "Course Synopsis: Evolution of management and management theories related with planning, organizing, and controlling business activity.\n\n" +
                "Goal: This course presents a systematic coverage of management theory and practice. Therefore it focuses on the basic roles, skills and functions of management, with special attention to managerial responsibility for effective and efficient achievement of goals.\n\n" +
                "Unit 1. Introduction 3 Hrs.\n\n" +
                "Definition of management, Characteristics of management, Principles of management, Functions of management\n\n" +
                "Unit 2. Evolution of Management Theory 6 Hrs.\n\n" +
                "Scientific management theory, Administrative management theory, Behavior science theories, the management science theory, the system approach, the contingency approach\n\n" +
                "Unit 3. The Environment of Management 6 Hrs.\n\n" +
                "Concept of business environment, Internal and external environment, Components of political, economic, socio-cultural and technological environment, Social responsibility, Management ethics\n\n" +
                "Unit 4. Planning and Decision Making 8 Hrs.\n\n" +
                "Definition and importance of planning, Types of planning – Corporate, tactical and operational plans; Single use and standing plans; Specific and flexible plans, Hierarchy of planning, Methods, steps and process of planning, MBO, Meaning of decision-making, Types of decision making – Programmed and non-programmed; Strategic, tactical and operational and Individual and group decision-making\n\n" +
                "Unit 5. Organization and Human Resource Management 6 Hrs.\n\n" +
                "Definition and characteristics of organization, Types of organization – Line, Line and staff, functional and matrix type of organization, Centralization Vs. decentralization, Meaning of HRM, Components of HRM – Acquisition, development, utilization and maintenance\n\n" +
                "Unit 6. Motivation, Leadership and Conflict 8 Hrs.\n\n" +
                "Meaning of motivation, Motivation theories - Hierarchy of needs theory; Motivation –hygiene theory; and Theory X - Theory Y, Meaning of leadership, Leadership styles – Autocratic, democratic and free rein and Managerial grid theory, Meaning and sources of conflict, Conflict resolution – Avoidance, defusion, containment and confrontation\n\n" +
                "Unit 7. Communication and Controlling 8 Hrs.\n\n" +
                "Meaning and process of communication, Types of communication – Formal and informal communication and Interpersonal and non-verbal communication, Barriers to effective communication, Techniques for improving communication, Meaning of controlling, Types of control system - Pre-control; concurrent control and post-control, Characteristics of effective control system, Introduction to MIS\n\n" +
                "Textbooks: Agrawal, Govind Ram, Principles of Management, M. K. Publishers & Distributors, Kathmandu.\n\n" +
                "Kreitner, Robert, Management, 1999\n\n" +
                "References: Robbins, Stephen P., and Coulter, Mary, Management, Prentice-Hall of India, New Delhi, 2002\n\n" +
                "Griffin, Ricky, Management, Houghton-Miffin, USA, 1998\n\n" +
                "Homework\n\n" +
                "Assignments: Home works shall be given to the students with emphasis on small cases");


        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, R.layout.list_item1, ls);
        lv.setAdapter(ad);
    }
}
