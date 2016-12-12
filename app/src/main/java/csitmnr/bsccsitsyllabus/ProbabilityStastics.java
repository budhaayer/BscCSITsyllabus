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
public class ProbabilityStastics extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Probability and Statistics\n" +
                "Course no: STA-103 \t\t Full Marks: 70+10+20\n" +
                "Credit hours: 3 \t\t Pass Marks: 28+4+8\n\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: Concept of descriptive statistics, probability, probability distributions, inferential statistics and their applications.\n\n" +
                "Goal: This course enhances the ability of students in computing and understanding summary statistics; understanding the concept of probability and probability distributions with their applications in statistics. Finally, students will develop their ability of using inferential statistics in decision-making processes.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1. Introduction 2 Hrs.\n\n" +
                "Scopes and limitations of statistics in empirical research; Role of probability theory in statistics; Role of computer technology in statistics\n\n" +
                "Unit 2. Descriptive Statistics 6 Hrs.\n\n" +
                "Measures of location: mean, median, mode, partition values and their properties; Measures of dispersion: absolute and relative measure of variation; range, quartile deviation, standard deviation; Other measures: Coefficient of variation; Measures of skewness and kurtosis.\n\n" +
                "Unit 3. Probability 5 Hrs.\n\n" +
                "Introduction of probability: Basic terminology in probability: sample space, events, random experiment, trial, mutually exclusive events, equally likely events, independent events; Definitions of probability: Classical, statistical, axiomatic definitions; Basic principles of counting; Laws of probability: Additive and multiplicative; Conditional probability; Bayes' Theorem.\n\n" +
                "Unit 4. Random Variable and Expectation 2 Hrs.\n\n" +
                "Random Variables: Discrete and continuous random Variables; Probability distribution of random variables; Expected value of discrete & continuous random Variable.\n\n" +
                "Unit 5. Jointly Distributed Random Variables and Probability Distributions 4 Hrs.\n\n" +
                "Joint Probability Distribution of two random variables: Joint probability mass functions and density functions; Marginal probability mass and density functions; Mean, variance, covariance and correlation of random variables; Independent random variables; Illustrative numerical problems.\n\n" +
                "Unit 6. Discrete Probability Distributions 5 Hrs.\n\n" +
                "Bernoulli and binomial random variable and their distributions and moments;\n" +
                "Computing binomial probabilities; Fitting of binomial distribution; Poisson random\n" +
                "variable and its distribution and moments; Computing Poisson probabilities; Fitting of\n" +
                "Poisson distribution.\n\n" +
                "Unit 7. Continuous Probability Distributions 6 Hrs.\n\n" +
                "Normal distribution and its moments; Standardization of normally distributed random\n" +
                "variable; Measurement of areas under the normal curve; Negative exponential\n" +
                "distribution and its moments; Concept of hazard rate function.\n\n" +
                "Unit 8. Chi-square, t and F Distribution 4 Hrs.\n\n" +
                "Characteristics function of normal random variable; Distribution of sum and mean of\n" +
                "n independent normal random variables; Canonical definitions of chi-square, t and F\n" +
                "random variables and their distributions; Joint distribution of X and S2 in case of\n" +
                "normal distribution.\n\n" +
                "Unit 9. Inferential Statistics 7 Hrs.\n\n" +
                "Simple random sampling method and random sample; Sampling distribution and\n" +
                "standard error; Distinction between descriptive and inferential statistics; General\n" +
                "concept of point and interval estimation; Criteria for good estimator; Maximum\n" +
                "likelihood method of estimation; Estimation of mean and variance in normal\n" +
                "distribution; Estimation of proportion in binomial distribution; Confidential interval\n" +
                "of mean in normal distribution; Concept of hypothesis testing; Level of significance\n" +
                "and power of a test; Tests concerning the mean of a normal distribution case – when\n" +
                "variance is known (Z-test) and unknown (t-test)\n\n" +
                "Unit 10. Correlation and Linear Regression 4 Hrs.\n\n" +
                "Simple Correlation: Scatter diagram; Karl Pearson's correlation coefficient and its\n" +
                "properties, Simple Linear Regression: Model and assumptions of simple linear\n" +
                "regression; Least square estimators of regression coefficients; Tests of significance of\n" +
                "regression coefficients; Coefficient of determination\n\n" +
                "Text Books: Sheldon M. Ross, Introduction to Probability and Statistics for\n" +
                "Engineers and Scientists, 3rd Edition, India: Academic Press, 2005.\n\n" +
                "References: • Richard A. Johnson, Miller and Freund's probability and\n" +
                "Statistics for Engineers, 6th Edition, Indian reprint: Pearson\n" +
                "Education, 2001.\n\n" +
                "• Ronald E. Walpole, R.H. Myers, S.L. Myers, and K. Ye, Probability and Statistics for Engineers and Scientists, 7th Edition, Indian reprint: Pearson Education, 2005.\n\n" +
                "Note:\n\n" +
                "1. Theory and practice should go side by side.\n" +
                "2. It is recommended 45 hours for lectures and 15 additional hours for tutorial class for completion of the course in the semester.\n" +
                "3. SPSS software should be used for data analysis.\n" +
                "4. Students should have intermediate knowledge of Mathematics.\n" +
                "5. Home works and assignments covering the lecture materials will be given throughout the semester.");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
