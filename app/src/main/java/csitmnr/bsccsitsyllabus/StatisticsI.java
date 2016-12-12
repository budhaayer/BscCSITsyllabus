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
public class StatisticsI extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Statistics I\n" +
                "Course no: STA-108\t\t Full Marks: 70+10+20\n\n" +
                "Credit hours: 3 \t\t Pass Marks: 28+4+8\n\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: Concept of Applied Statistical Techniques and its Applications\n\n" +
                "Goal: This course makes students able to understand Applied Statistical Techniques and their applications in the allied areas.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1: Sampling Techniques 10 Hrs.\n\n" +
                "Types of Sampling; Simple Random Sampling with and without Replacement; Stratified Random Sampling; Ratio and Regression Method of Estimation under Simple and Stratified Random Sampling; Systematic Sampling; Multistage Sampling; Estimation of population total and its Variance.\n\n" +
                "Unit 2: Non Parametric Test 16 Hrs.\n\n" +
                "Chi-square test: Test of goodness of fit; Test for independence (Categorical Data). Definition of Order Statistics; Run Test; Sign Test; Wilcoxon Matched Pairs Signed Ranks Test; Mann-Whitney U Test; Median Test; Kolmogorov Smirnov Test (One Sample Case); Cochran Q Test; Kruskl Wallis One way ANOVA Test; Friedman Two way ANOVA Test.\n\n" +
                "Unit 3: Correlation and Regression Analysis 19 Hrs.\n\n" +
                "Partial and Multiple Correlations; Multiple Linear Regressions: Assumptions; Coefficient Estimation, and Significance Test; Coefficient of Determination; Cobb-Dauglas Production Function; Growth Model; Logistic Regression; Autoregressive Model of order One, and Appraisal of Linear Models (Heteroscedasticity, Multicolinearity, Autocorrelation).\n\n" +
                "Note:\n\n" +
                "1. Theory and practice should go side by side.\n\n" +
                "2. It is recommended 45 hours for lectures and 15 additional hours for tutorial class for completion of the course in the semester.\n\n" +
                "3. SPSS Software should be used for data analysis.\n\n" +
                "4. Home works and assignments covering the lecture materials will be given throughout the semester.\n\n" +
                "Text Books:\n\n" +
                "\uF0B7 Draper, N. and H. Smith, Applied Regression Analysis, 2nd edition, New York: John Wiley & Sons, 1981.\n\n" +
                "\uF0B7 Hogg & Tanis, Probability & Statistical Inference, 6th edition, First Indian Reprint, 2002.\n\n" +
                "\uF0B7 Gujaratii, D. Basic Econometrics, International edition, 1995.\n\n" +
                "\uF0B7 Gibbons, J.D. Nonparametric Statistical Inference. International Student Edition.\n\n" +
                "\uF0B7 Siegel, S. Nonparametric Statistics for the Behavioural Sciences. McGraw-Hill, New York.\n\n" +
                "References:\n\n" +
                "\uF0B7 Hollander, M. & Wolfe, Nonparametric Statistical Methods. Johns Wiley & Sons, New York.");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
