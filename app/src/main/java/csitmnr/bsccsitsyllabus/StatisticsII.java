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
public class StatisticsII extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Statistics II\n\n" +
                "Course no: STA-152 \t\tFull Marks: 70+10+20\n\n" +
                "Credit hours: 3 \t\tPass Marks: 28+4+ 8\n\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: Concept of Sample Survey and Design, and their applications.\n\n" +
                "Goal: This course makes students able to understand the concept of Sample Survey and Design, and their applications in the area of Science and Technology.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1: Sample Survey 10 Hrs.\n\n" +
                "Concept of Population and Sample; Needs of Sampling; Censuses and Sample Survey; Basic Concept of Sampling; Organizational Aspect of Sample Survey; Questionnaire Design; Sample Selection and Determination of Sample Size; Sampling and Non Sampling Errors.\n\n" +
                "Unit 2: Sample Survey Methods 13 Hrs.\n\n" +
                "Types of Sampling; Simple Random Sampling with and without Replacement; Stratified Random Sampling; Ratio and Regression Method of Estimation under Simple and Stratified Random Sampling; Systematic Sampling; Cluster Sampling; Multistage Sampling; Probability Proportion to Size Sampling (PPS), Estimation of population total and its Variance\n\n" +
                "Unit 3: Design of Experiment 5 Hrs.\n\n" +
                "Concept of Analysis of Variance (ANOVA), F -Statistic and its Distribution, Linear Model in ANOVA, Analysis of One way, Two Way Classification (1 and m observations per cell) in Fixed Effect Model.\n\n" +
                "Unit 4: Simple Design 10 Hrs.\n\n" +
                "Need for Design of Experiment, Fundamental Principles of Design, Completely Randomized Design (CRD), Randomized Block Design (RBD), Latin Square Design (LSD) and their Analysis; Missing Plot Techniques for RBD and LSD (One Observation Missing Only).\n\n" +
                "Unit 5: Factorial Design 7 Hrs.\n\n" +
                "2^2, 2^3 and 3^2 Designs; Main Effects and Interaction Effects; Confounding in 23 Factorial Design\n\n" +
                "Text Books:\n\n" +
                "„h Mukhopadhyay P., Theory and Methods of Survey Sampling, Prentice Hall of India, New Delhi, 1998.\n" +
                "„h Montgomery Douglas C., Design and Analysis of Experiments, 5th edition, John Wiley & Sons Inc., 2001.\n" +
                "„h Cochran W.G., Sampling Techniques, 3rd edition, John Wiley and Sons, Inc. New York, 1977.\n\n" +
                "References:\n\n" +
                "„h Kempthorane, O., Design and Analysis of Experiments, Wiley Eastern, New York.\n" +
                "„h Desraj, Pramod Chandhok, Sample Survey Theory, Narosa Publishing House, 1998.\n\n" +
                "Note:\n\n" +
                "1. Theory and practice should go side by side.\n" +
                "2. It is recommended 45 hours for lectures and 15 additional hours for tutorial class for completion of the course in the semester.\n" +
                "3. SPSS Software should be used for data analysis.\n" +
                "4. Home works and assignments covering the lecture materials will be given throughout the semester.");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
