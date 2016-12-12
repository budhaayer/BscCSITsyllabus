package csitmnr.bsccsitsyllabus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manoj Budha Ayer on 12/11/2016.
 */
public class OperatingSystem extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Operating Systems\n\n" +
                "Course no: CSC-203\t\t Full Marks: 70+10+20\n\n" +
                "Credit hours: 3 \t\tPass Marks: 28+4+8\n\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: Fundamental concepts of uniprocessor operating systems. Evolution process management, Memory management, File systems, I/O processing.\n\n" +
                "Goal: This course introduces fundamental concepts of contemporary uniprocessor operating systems.\n\n" +
                "Course contents:\n\n" +
                "Unit 1: 6 Hrs.\n\n" +
                "1.1. Historical background: Operating system evolution, hardware review, operating system structure. Overview of operating system: batch system, multiprogramming, time-sharing, real-time, mainframe operating systems, personal computer operating systems, system calls.\n\n" +
                "Unit 2: 14 Hrs.\n\n" +
                "2.1. Process management: Process creation, process termination, process states, attributes; thread creation, termination, process scheduling.\n\n" +
                "2.2. Interprocess communication and synchronization: race conditions, critical regions, mutual exclusion, busy waiting, sleep and wakeup, semaphores, monitors, message passing, classical IPC problems and deadlock.\n\n" +
                "Unit 3: 13 Hrs.\n\n" +
                "3.1. Memory management: Absolute and relocable partition, multiprogramming, swapping, overlays, virtual memory, paging, page replacements algorithms, segmentation, segmentation with paging.\n\n" +
                "3.2. File systems: file system interface, file system implementation.\n\n" +
                "Unit 4: 12 Hrs.\n\n" +
                "4.1. Device management: I/O hardware and software, software layers.\n\n" +
                "4.2. Disk management: Disk structure, Disk scheduling, error handling and formatting, RAID, stable storage management.\n\n" +
                "4.3. Case studies (Linux and Window 2000)\n\n" +
                "Laboratory works: Small programming assignments of process creation, termination, deletion, thread creation, terminations, signals handling, process\n\n" +
                "synchronization, process communication, classical IPC problems, file system and I/O handling.\n\n" +
                "Textbooks: Andrew S. Tanenbaum, Modern Operating Systems, 2nd Edition, Prentice-Hall.\n\n" +
                "References: Silberschatz, Galvin and Gagne, Operating System Concepts, 6th Edition, Addition Wesley.\n\n" +
                "Homework\n\n" +
                "Assignments: Homework assignments covering lecture materials will be given throughout the semester.\n\n" +
                "Computer Usage: Unix or Linux base PC or workstation.\n\n" +
                "Prerequisites: C, Data structures and Computer Organization.\n\n" +
                "Category Content: Science Aspect: 70%\n\n" +
                "Design Aspect: 30%");


        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, R.layout.list_item1, ls);
        lv.setAdapter(ad);
}
}
