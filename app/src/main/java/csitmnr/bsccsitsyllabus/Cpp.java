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
public class Cpp extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Object Oriented Programming\n\n" +
                "Course no: CSC-202\t\t Full Marks: 70+10+20\n\n" +
                "Credit hours: 3 \t\t Pass Marks: 28+4+8\n\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: Study of basic programming skills, the concept of object oriented and its features, implementing the features.\n\n" +
                "Goal: To provide the object oriented programming approach to solve the problem.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1: 11 Hrs.\n\n" +
                "1.1 Introduction to Programming Concept: Overview of structural programming approach, Object oriented approach, Features of object oriented languages, Components of object oriented languages like object, class.\n\n" +
                "1.2 Elements of Object Oriented Languages: Introduction to inheritance, polymorphism, abstraction.\n\n" +
                "1.3 C++ basics: Introduction, Basic Program Construction like functions and program statements. Output using cout, Directives: Preprocessor Directives, Header Files, The using directives. Comments: Comment Syntax. Integer Variables: Definition, declaration, variables names, assignment statements, integers constants, output variable. Input with cin, Operators, library functions.\n\n" +
                "Unit 2: 15 Hrs.\n\n" +
                "2.1 Control Structures: Introduction, control statements, The if selection structure, The if/else selection structure, The while structure, The For structure, The switch structure, The do/while structure, The break and continue statement.\n\n" +
                "2.2 The Functions: Introduction, Math library functions, Definition/Prototypes, Header files, Storage classes, Scope rules, Recursion, Inline functions, Function Overloading, Function Templates.\n\n" +
                "2.3 Arrays: Introduction, Declaring arrays, Passing arrays to functions, Types of arrays.\n\n" +
                "2.4 Pointers: Introduction, Pointer variables declaration & initialization, Operators in pointers, Calling functions by reference, Relationship between pointers & arrays, arrays of pointers, Function pointers.\n\n" +
                "Unit 3: 19 Hrs.\n\n" +
                "3.1 Classes & Objects: Introduction, Features of class, Object and its features, Declaration of class, Using the class, Accessing members of class, Class scope, Initialization class objects: Constructor, Destructor. Object as function arguments: Overload constructor, Member functions defined outside the class, Objects as arguments.\n\n" +
                "3.2 Operator Overloading: Introduction, Fundamental of operator overloading, Restriction on operator overloading, Operator functions as a class members, Overloading stream-insertion and stream-extraction operators, Overloading unary and binary operators.\n\n" +
                "3.3 Inheritance: Introduction, Types of inheritance, Protected members, Casting base class pointers to derived – class pointers, Public, protected, and private inheritance. Constructor and Destructor in derived classes.\n\n" +
                "3.4 Virtual Functions & Polymorphisms: Introduction, Type fields & switch statements, Virtual functions, Abstract base classes & Concrete classes, Polymorphism and its roles.\n\n" +
                "3.5 Templates: Introduction, Function templates, overloading templates functions, class templates, templates & inheritance.\n\n" +
                "3.6 Exceptional Handling: Introduction, Use of exceptional handling, Try, throw and catch.\n\n" +
                "Laboratory works:\n\n" +
                "1. Write a C++ code to solve the quadratic equations.\n" +
                "2. Write a C++ code to find out the prime number between 2000 and 2050.\n" +
                "3. Write a C++ code to sort the given 10 numbers in ascending order.\n" +
                "4. Write a C++ code to create a class that calculates the interest of any number.\n" +
                "5. Write a C++ code to get the transpose of given matrix.\n" +
                "6. Write a C++ code that uses the polymorphism.\n" +
                "7. Write a C++ code that uses the inheritance.\n" +
                "8. Write a C++ code that uses exceptional handling facility.\n" +
                "9. Write a C++ code to reverse the given text.\n" +
                "10. Write a C++ code to get the list of leap year from 1900 to 2000.\n\n" +
                "Text Books: C++ How to Program; Deitel & Deitel, 3rd Edition, PEARSON\n\n" +
                "Reference: Object Oriented Programming in C++; Robert Lafore, Third\n" +
                "Edition, GALGOTIA\n\n" +
                "Homework\n\n" +
                "Assignment: Assignment should be given from the above units in throughout the semester.\n\n" +
                "Computer Usage: No specific\n\n" +
                "Prerequisite: C\n\n" +
                "Category Content: Science Aspect: 40%\n\n" +
                "Design Aspect: 60%");


        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, R.layout.list_item1, ls);
        lv.setAdapter(ad);
    }
}
