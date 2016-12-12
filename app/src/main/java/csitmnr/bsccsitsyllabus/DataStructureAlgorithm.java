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
public class DataStructureAlgorithm extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Data Structures and Algorithms\n\n" +
                "Course no: CSC-154 \t\tFull Marks: 70+10+20\n\n" +
                "Credit hours: 3\t\t Pass Marks: 28+4+8\n\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: Study of basic data structure vocabulary, the concept of an algorithm.\n\n" +
                "Goal: To provide the concept of data structure and its implementation using programming techniques.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1: 14 Hrs.\n\n" +
                "1.1 Introduction to Data Structures: Information and its meaning, Array in C++: The array as an ADT, Using one dimensional array, Two dimensional array, Multi dimensional array, Structure , Union, Classes in C++.\n\n" +
                "1.2 The Stack: Introduction, definition, primitive operation, the stack as an abstract data type, implementing the POP operation, testing for exceptional condition, implementing the PUSH operation.\n\n" +
                "1.3 The Infix, Postfix & Prefix: Introduction, evaluating the postfix operation, program to evaluate the postfix operation, limitation of program, converting from one to another.\n\n" +
                "1.4 Recursion: Introduction, factorial functions, multiplication of natural numbers, Fibonacci sequence, binary search, the tower of Hanoi problem, translation from prefix to postfix using recursion.\n\n" +
                "Unit 2: 31 Hrs.\n\n" +
                "2.1 Queues: Introduction, the queue and its sequential representation: The queue as an abstract data type, implementation of queue, inserts operation, priority queue.\n\n" +
                "2.2 Linked Lists: Introduction, inserting and deleting the nodes from a list, linked implementation of stack, getnode and freenode operation, linked implementation of queue. Linked list as a data structure, circular lists, stack as a circular list, queue as a circular list.\n\n" +
                "2.3 Tree: Introduction, Binary Trees: operation on Binary Trees, application of Binary Trees. Binary Tree Representation: node representation of binary tree, internal and external nodes, implicit array representation of binary tree, binary tree traversal, threaded binary tree, heterogonous binary tree. The Huffman algorithm. Representing lists as binary trees. Trees and their application.\n\n" +
                "2.4 Sorting: Introduction, O notation, efficiency of sorting, exchange sort: bubble sort, quick sort.\n\n" +
                "2.5 Selection and Tree Sorting: Introduction, straight selection sort, binary tree sort, heapsort, insertion sort, merge and radix sort.\n\n" +
                "2.6 Searching: Introduction, sequential searching, binary search, interpolation search, tree search, general search tree, hashing.\n\n" +
                "2.7 Graphs: Introduction, linked representation of graphs.\n\n" +
                "2.8 Algorithm: Introduction, design of algorithm, algorithm validation, analysis of algorithm, algorithm testing. subalgorithm\n\n" +
                "Laboratory works:\n\n" +
                "1. Write a code to multiply two matrixes and get the transpose of the third one.\n" +
                "2. Write a code to implement the stack, that should check overflow and underflow also.\n" +
                "3. Write a code to convert any prefix number to postfix.\n" +
                "4. Write a code to convert any infix number to postfix.\n" +
                "5. Write a code to convert any post fix number to prefix.\n" +
                "6. Implement tower of Hanoi.\n" +
                "7. Write a code to implement different sorting techniques.\n" +
                "8. Write a code to demonstrate the binary search.\n" +
                "9. Write a code to implement the queue.\n" +
                "10. Write a code to convert stack operation to queue operation.\n\n" +
                "Text books: Data Structure Using C & C++, Langsam Yedidyah, Augenstein Moshe J., Tennenbaum Aaron M., PHI\n\n" +
                "Reference: The Design and Analysis of Algorithm, Nitin Upadhyay, SK Kataria & Sons.\n\n" +
                "Homework\n\n" +
                "Assignment: Assignment should be given from the above units in throughout the semester.\n\n" +
                "Computer usage: No specific\n\n" +
                "Prerequisite: C, C++\n\n" +
                "Category content: Science Aspect: 40%\n\n" +
                "Design Aspect: 60%");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
