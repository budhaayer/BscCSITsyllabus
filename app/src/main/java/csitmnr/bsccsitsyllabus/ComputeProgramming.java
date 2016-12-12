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
public class ComputeProgramming extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Fundamentals of Computer Programming\n\n" +
                "Course no: CSC-102 Full Marks: \t\t70+10+20\n" +
                "Credit hours: 3 \t\t Pass Marks: 28+4+8\n\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: This course contains the concepts of programming methodology using C.\n\n" +
                "Goal: This course is designed to familiarize students to the techniques of programming in C.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1. Problem Solving with Computer 2 Hrs.\n\n" +
                "Problem analysis, Algorithms and Flowchart, Coding, Compilation and Execution, History of C, Structure of C program, Debugging, Testing and Documentation\n\n" +
                "Unit 2. Elements of C 4 Hrs.\n\n" +
                "C Tokens, Escape sequence, Delimiters, Variables, Data types, Constants/ Literals, Expressions, Statements and Comments\n\n" +
                "Unit 3. Input and Output 2 Hrs.\n\n" +
                "Conversion specification, I/O operation, Formatted I/O\n\n" +
                "Unit 4. Operators and Expression 4 Hrs.\n\n" +
                "Arithmetic operator, Relational operator, Logical or Boolean operator, Assignment, Operator, Ternary operator, Bitwise operator, Increment or Decrement operator, Comma operator.\n\n" +
                "Unit 5. Control Statement 4 Hrs.\n\n" +
                "Branching, Looping, Conditional Statement, Exit function, Difference between break and exit\n\n" +
                "Unit 6. Arrays 6 Hrs.\n\n" +
                "Introduction, Declaration of array, Initialization of array, Sorting, Multidimensional array\n\n" +
                "Unit 7. Functions 5 Hrs.\n\n" +
                "Library Functions, User defined functions, Recursion, Function declaration, Local and global variables, Use of array in function, Passing by Value, Passing by Address\n\n" +
                "Source: www.csitnepal.com Page 4\n\n" +
                "Unit 8. Pointers 6 Hrs.\n\n" +
                "Introduction, The & and * operator, Declaration of pointer, Pointer to pointer, Pointer arithmetic, Array and Pointer, Pointer and array, Pointer with multidimensional array, Pointer and strings, Array of pointer with string, Dynamic memory allocation\n\n" +
                "Unit 9. Structure and Union 5 Hrs.\n\n" +
                "Introduction, Array of structure, Passing structure to function, Passing array of structure to function, Structure within structure ( Nested Structure), Union, Pointer to structure\n\n" +
                "Unit 10. Files and file handling in C 4 Hrs.\n\n" +
                "Concept of file, Opening and closing of file, Modes, Input/ output function, Random access in file, Printing a file\n\n" +
                "Unit 11. Introduction to Graphics 3 Hrs.\n\n" +
                "Modes, Initialization, Graphics Function\n\n" +
                "Laboratory works: This course requires a lot of programming practices. Each topic must be followed by a practical session. Some practical sessions include programming to:\n\n" +
                "\uF0B7 Create, compile and run simple C programs, handle different data types available in C, perform arithmetic operations in C, perform formatted input and out put operations, perform character input and output operations.\n\n" +
                "\uF0B7 Perform logical operations, create decision making programs, create loops to repeat task, sue different looping method.\n\n" +
                "\uF0B7 Create user-defined factions, create recursive functions, work with automatic, global and static variables, create manipulate arrays and matrices (single and multi-dimensional), work with pointes, dynamically allocate de-allocate storage space during runtime, manipulate strings (character arrays) using various string handling functions.\n\n" +
                "\uF0B7 create and use structures an files to keep record of students, employees etc\n\n" +
                "References:\n\n" +
                "\uF0B7 Deitel, C.: How to Program, 2/e (With CD), Pearson Education.\n\n" +
                "\uF0B7 Al Kelley, Ira Pohl: \"A Book on C\", Pearson Education.\n\n" +
                "\uF0B7 Brian W. Keringhan & Dennis M. Ritchie: \"The C programming Language\", PHI\n\n" +
                "\uF0B7 Bryons S. Gotterfried: \"Programming with C,\" TMH\n\n" +
                "\uF0B7 Stephen G. Kochan: \"Programming in C\", CBS publishers & distributors.\n\n" +
                "\uF0B7 Yashavant Kanetkar: \"Let us C\", BPB Publications");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
