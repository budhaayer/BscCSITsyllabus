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
public class LinearAlgebra extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Linear Algebra\n\n" +
                "Course no: MTH-155 \t\tFull Marks: 90+10\n\n" +
                "Credit hours: 3 \t\tPass Marks: 36+4\n\n" +
                "Nature of course: Theory\n\n" +
                "Course Synopsis: Linear equations in linear algebra, Matrix algebra, Determinants, Vector spaces, Eigen values and Eigen vectors. Orthogonality and least squares. Symmetric matrices and Quadratic forms.\n\n" +
                "Goal: This course provides students with the knowledge of fundamental of linear algebra and the theory of matrices. On completion of this course the student will master the basic concepts and acquires skills in solving problems in linear algebra.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1: Linear equations in linear Algebra 10 Hrs.\n\n" +
                "1.1 Systems of linear equations\n" +
                "1.2 Row reduction and Echelon Forms\n" +
                "1.3 Vector equations\n" +
                "1.4 The matrix equations Ax = b\n" +
                "1.5 Solution sets of linear systems\n" +
                "1.6 Linear independence\n" +
                "1.7 Introduction Linear Transformations\n" +
                "1.8 The matrix of a Linear Transformations\n\n" +
                "Unit 2: Matrix Algebra 8 Hrs.\n\n" +
                "2.1 Matrix operations\n" +
                "2.2 The inverse of a matrix\n" +
                "2.3 Characterization of invertible matrices\n" +
                "2.4 Partitioned Matrices\n" +
                "2.5 The Leontief Input-output model\n" +
                "2.6 Application to Computer graphics\n\n" +
                "Unit 3: Determinants 4 Hrs.\n\n" +
                "3.1 Introduction to determinants\n" +
                "3.2 Properties of determinants\n" +
                "3.3 Cramer's rule value and linear transformations\n\n" +
                "Unit 4: Vector Spaces 8 Hrs.\n\n"+
                "4.1 Vector spaces and sub polar\n" +
                "4.2 Null spaces, Column spaces and linear transformations\n" +
                "4.3 Linearly Independent Sets; Bases\n" +
                "4.4 Coordinate systems\n" +
                "4.5 The dimension of a vector space\n" +
                "4.6 Rank\n" +
                "4.7 Change of basis\n\n" +
                "Unit 5: Eigen values and Eigen vectors 7 Hrs.\n\n" +
                "5.1 Eigen vectors and Eigen values\n" +
                "5.2 The characteristics equations\n" +
                "5.3 Diagonalization\n" +
                "5.4 Eigen vectors and Linear Transformations\n" +
                "5.5 Complex Eigen values\n" +
                "5.6 Discrete Dynamical System\n\n" +
                "Unit 6: Orthogonality and Least Squares 8 Hrs.\n\n" +
                "6.1 Linear product, length and Orthogonality\n" +
                "6.2 Orthogonal sets\n" +
                "6.3 Orthogonal Projections\n" +
                "6.4 The Gram- Schmidt process\n" +
                "6.5 Least square problems\n" +
                "6.6 Applications to Linear models\n\n" +
                "Text books: David C. lay: Linear Algebra and its applications, 3rd edition, Pearson Education.\n\n" +
                "References: 1. Kolman, Bernard; Introductory Linear Algebra with Application.7th edition. Pearson.\n\n" +
                "2. Gilbert Strang; Linear Algebra and its Application.3rd edition.\n" +
                "3. Kreszig, E. \" Advanced Engineering Mathematics.\" 5th edition. Wiley");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
