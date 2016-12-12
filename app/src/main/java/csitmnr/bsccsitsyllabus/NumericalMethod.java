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
public class NumericalMethod extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Numerical Method\n" +
                "Course no: CSC-204\t\t Full Marks: 70+10+20\n" +
                "Credit hours: 3 \t\t Pass Marks: 28+4+8\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: This course contains the concept of numerical techniques of solving the differential equations and algebraic equations.\n\n" +
                "Goal: To be familiar with the theory of numerical analysis for solving algebraic equations, solution of ordinary and partial differential equations related to engineering problems\n\n" +
                "Course Contents:\n\n" +
                "Unit 1. Solution of Nonlinear Equations: 10 Hrs.\n\n" +
                "Review of calculus and Taylor's theorem, Errors in numerical calculations, Trial and error method, Half- interval method, and convergence, Newton's method, secant method and their convergence, Fixed point iteration and its convergence, Newton's method for polynomials and Horner's method\n\n" +
                "Unit 2. Interpolation and Approximation: 8 Hrs.\n\n" +
                "Lagrang's polynomials, Newton's interpolation using difference and divided differences, Cubic spline interpolation, Least squares method for linear and nonlinear data\n\n" +
                "Unit 3. Numerical Differentiation and Integration: 5 Hrs.\n\n" +
                "Newton's differentiation formulas, Maxima and minima of tabulated function, Newton-Cote's quadrature formulas, Trapeziodal rule, Simpson's rule, 2D algorithm, Gaussian integration algorithm, Romberg integration formulas\n\n" +
                "Unit 4. Solution of Linear Algebraic Equations: 10 Hrs.\n\n" +
                "Review of the existence of solutions and properties of matrices, Gaussian elimination method , pivoting, ill-conditioning, Gauss-Jordan method, Inverse of matrix using Gauss elimination method, Method of factorization, Dolittle algorithm, Cholesky's factorization, Iterative solutions, Eigen values and eigen vectors problems, Solving eigen value problems using power method.\n\n" +
                "Unit 5. Solution of Ordinary Differential Equations: 7 Hrs.\n\n" +
                "Review of differential equations, Initial value problem, Taylor series method, Picard's method, Euler's method and its accuracy, Heun's method, Runge-Kutta methods, Solution of the higher order equations, Boundary value problems: Shooting method and its algorithm\n\n" +
                "Unit 6. Solution of Partial Differential Equations: 5 Hrs.\n\n" +
                "Review of partial differential equations, Deriving difference equations, Laplacian equation and Poisson's equation, engineering examples\n\n" +
                "Laboratory works: The laboratory experiments will consist of program development and testing of non-linear equations, interpolation, numerical integration and differentation, linear algebraic equations, ordinary and partial differential equations.\n\n" +
                "Text / Reference books:\n\n" +
                "1. W. Chency and D. Kincaid, \"Numerical Mathematics and Computing\", 2nd Edition, Brooks/Cole Publishing Co., 1985\n\n" +
                "2. C.F. Gerald and P.O. Wheatley, \"Applied Numerical Analysis\", 4th Edition, Addison Wesley Publishing Company, New York.\n\n" +
                "3. W.H. Press, B.P. Flannery et.al., \"Numerical Recipes in C\", 1st Edition, Cambridge Press, 1988.\n\n" +
                "4. S. Yakwitz and F. Szidarovszky, \"An Introduction to Numerical Computations\", 2nd Edition, Macmillan Publishing Co., New York.");


        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, R.layout.list_item1, ls);
        lv.setAdapter(ad);
    }
}
