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
public class GeologyI extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Geology I\n\n" +
                "Course no: GEO-107 \t\tFull Marks: 70+10+20\n\n" +
                "Credit hours: 3 \t\tPass Marks: 28+4+8\n\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: Fundamental concepts of contemporary earth and environmental science and engineering with increasing computer application.\n\n" +
                "Goal: This course aims at providing general understanding of Earth and environmental science and engineering\n\n" +
                "Course Contents:\n\n" +
                "Unit 1. 10 Hrs.\n\n" +
                "1.1 New Global Tectonic framework of the earth: Continental margins, earthquakes, volcanoes and mountain ranges.\n\n" +
                "1.2 Crystal, minerals and rocks: rock types and rock systematic\n\n" +
                "Unit 2. 10 Hrs.\n\n" +
                "2.1 Mineral deposits and mineral mining: technologies, reserves, economics and environment\n\n" +
                "2.2 Engineering geology: construction and stability of structures and natural and artificial face stability\n\n" +
                "Unit 3. 10 Hrs.\n\n" +
                "3.1 Climate changes and natural disasters: Landslides, Floods and Desertification.\n\n" +
                "3.2 Natural resources depletion: Hydrocarbons, metals and new sources of energy and materials.\n\n" +
                "Unit 4. 10 Hrs.\n\n" +
                "4.1 Geographic Information system (GIS): Vectors and raster and remote sensing database management.\n\n" +
                "4.2 Computer aided data management: remote sensing data acquisition, storage, processing and interpretation.\n\n" +
                "4.3 GIS and RS packages: ERDAS, ER Mapper, ArcView and other operating systems and capabilities\n\n" +
                "Laboratory works: Mineral / Rock identification, Soil types, Reserve calculation, Slope stability calculation, Rock Mass Ratings, ER Mapper, ArcView, ILWIS tour, RS data analysis, Digitization, practice and Geographic locking, GIS Layers shows and illustrations, GIS assignment with digital RS data.\n\n" +
                "Practical:\n\n" +
                "\uF0B7 To identify elements of symmetry of a cube.\n\n" +
                "\uF0B7 To identify 5 oxides and 5 sulphide minerals.\n\n" +
                "\uF0B7 To calculate reserve of a ore deposit.\n\n" +
                "\uF0B7 To calculate cost - benefit analysis of a mining enterprise\n\n" +
                "\uF0B7 To calculate the stability of natural slope\n\n" +
                "\uF0B7 To calculate and interpret precipitation data\n\n" +
                "\uF0B7 To calculate rock mass rating form data\n\n" +
                "\uF0B7 To perform digitization and geographic locking in computer\n\n" +
                "\uF0B7 GIS assignment with RS data.\n\n" +
                "Text Books: No specific text book covering all materials but a working manual could be easily prepared.\n\n" +
                "Reference:\n\n" +
                "Homework: Homework assignments covering lecture materials and primary numerical exercises.\n\n" +
                "Assignments: Given throughout the semester.\n\n" +
                "Computer Usage: MS-WINDOWS (WINDOWS 98/XP) base PC of workstation\n\n" +
                "Prerequisites: Basic IT literacy\n\n" +
                "Category contents: Science Aspect: 50%\n\n" +
                "Engineering Aspect: 50%");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
