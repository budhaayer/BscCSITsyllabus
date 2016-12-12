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
public class Calculus extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Calculus and Analytical Geometry\n\n" +
                "Course no: MTH-104 \t\tFull Marks: 90+10\n" +
                "Credit hours: 3\t\t P.M: 36+4\n\n" +
                "Nature of Course: Theory\n\n" +
                "Course Synopsis: Preliminaries revision of differentiation and integration; Techniques of integration infinite series; Vectors and analytical geometry in space (differential geometry). Vector valued functions. Multivariable functions and partial derivatives. Multiple integrals and integration in vector fields. Partial derivatives; Equations of First Partial Derivatives.\n\n" +
                "Goal: This course aims at providing students with some advanced topics in undergraduate calculus and fundamental concepts of partial differentiation and P.D.E of second order. It is assured that a student who has done Certificate Level papers in mathematics will be able to study this course.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1. Topics in Differential Calculus and Integral Calculus 8 Hrs.\n\n" +
                "1.1 Functions and Graphs\n\n" +
                "1.2 Extreme values of functions; graphing of derivatives\n\n" +
                "1.3 Mean value integers\n\n" +
                "1.4 Definite integers, Properties and application, Mean value\n" +
                "theory for definite integers\n" +
                "1.5 Fundamental theory of Integral Calculus and application, Improper\n" +
                "integrals\n\n" +
                "Unit 2. Infinite Series 5 Hrs.\n\n" +
                "2.1 Infinite sequence and sequence of convergence and divergence\n\n" +
                "2.2 Integral test, comparison test, ratio and root test\n\n" +
                "2.3 Absolute and conditional convergence\n\n" +
                "1.4 Power series, Taylor and Maclaurin series, convergence of Taylor series\n\n" +
                "Unit 3. Conic Section 3 Hrs.\n\n" +
                "3.1 Classifying conic sections by eccentricity\n\n" +
                "3.2 Plane curves, parametric and polar equations, integration in polar coordinates\n\n" +
                "Unit 4. Vectors and Vectors Valued Functions 6 Hrs.\n\n" +
                "4.1 Vectors in the space\n\n" +
                "4.2 Lines and planes in space\n\n" +
                "4.3 Cylinders and Quadric surfaces\n\n" +
                "4.4 Cylindrical and Spherical Coordinates\n\n" +
                "4.5 Vector valued functions and space curves\n\n" +
                "4.6 Unit tangent vector, curvature and torsion and TNB system\n\n" +
                "Unit 5. Multiple Integrals 5 Hrs.\n\n" +
                "5.1 Double integrals in rectangular polar coordinates\n\n" +
                "5.2 Finding areas, moments and centre of mass\n\n" +
                "5.3 Triple integrals in rectangular coordinates and application\n\n" +
                "5.4 Substitutes in multiple integrals\n\n" +
                "Unit 6. Multivariate Calculus 9 Hrs.\n\n" +
                "6.1 Functions, limits and continuity of two or more variables\n\n" +
                "6.2 Partial derivatives\n\n" +
                "6.3 Differentiability, Differentials, Total Differential Coefficients\n\n" +
                "6.4 Directional derivatives and gradient vectors\n\n" +
                "6.5 Extreme values\n\n" +
                "6.6 Lagrange Multiplies\n\n" +
                "Unit 7. Partial Differential Equations 9 Hrs.\n\n" +
                "7.1 Review of Ordinary Differential Equations\n\n" +
                "7.2 Analysis of P.D.E of 1st and 2nd order\n\n" +
                "7.3 Linear equations of the 1st order and the general solutions\n\n" +
                "7.4 P.D.E of 2nd order, its derivation and basic concepts\n\n" +
                "7.5 Solution of general P.D.E with constant coefficients, complimentary solution and integral solution\n\n" +
                "7.6 Wave equations and heat equations and their solutions (Chapter II, Section 11.1, 11.2, 11.4, 11.5). Erwin and Kreyszig. 8th edition, John-Wiley Publications.\n\n" +
                "Text Books\n\n" +
                "Thomas and Fenns: Calculus and Analytical Geometry, 9th Edition, 2004. (Thomas, Jr. G. B., and Finney, Ross L. Publisher: Pearson Education Pvt. Ltd.\n\n" +
                "Kreyszig, Erwin, Advanced Engineering Mathematics, John- Wiley & Sons (1991). 5th Edition.\n\n" +
                "References\n\n" +
                "E.W. Swokowski, Calculus with Analytical Geometry, Second Alter Edition.\n\n" +
                "Sneddan Ian- Elements of Partial Differential Equations.");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
