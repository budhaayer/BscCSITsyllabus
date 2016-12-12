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
public class BiologyI extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Biology I\n\n" +
                "Course no: BIO-106 \t\tFull Marks: 70+10+20\n\n" +
                "Credit hours: 3 \t\tPass Marks: 28+4+8\n\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: Living System and their properties, major biological molecules, basic physiological processes, introduction of genetics, basic concepts of diversity and evolution.\n\n" +
                "Goal: The course is aimed at providing the introduction of biological system with respect to nature, behavior and functioning of the cell.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1. 5 Hrs.\n\n" +
                "1.1 Introduction: Brief introduction to all aspects of Biology\n\n" +
                "1.2 Bio-molecular: Carbohydrates, Lipids, Proteins and Nucleic acid\n\n" +
                "Unit 2. 19 Hrs.\n\n" +
                "2.1 Cell structure and functions: Cell theory, cell membrane, transport system across the membrane, organelles composed of membranes, nonmenbranous organelles, nuclear components and major cell types\n\n" +
                "2.2 Enzymes: Nomenclature, biocatalysis, action of enzymes, environmental factors, co-enzymes, enzyme activation and inhibition.\n\n" +
                "2.3 Biochemical Pathways: Introduction, cellular respiration, glycolysis, TCA Cycle, ETC, ATP calculation, fermentation, protein and fat metabolism, photosynthesis-C3 and C4 pathways, photorespiration, chemosynthesis, transpiration.\n\n" +
                "Unit 3. 7 Hrs.\n\n" +
                "3.1 Genetics: Laws of inheritance, linkage and crossing over\n\n" +
                "3.2 Diversity within species: Gene pool concept, genetic variety, role of natural selection in evolution, factors influencing natural selection, Hardy-Weinberg equilibrium concept and application\n\n" +
                "Unit 4. 6 Hrs.\n\n" +
                "4.1 Material exchange in the body: Basic principle, blood circulation, pulmonary and systemic, nature of blood and role of heart, gas exchange, respiratory anatomy, lung function, digestive system, kidney structure and function\n\n" +
                "Unit 5. 8 Hrs.\n\n" +
                "5.1 Body's control mechanism: Nerve impulse, synapse, CNS organization, endocrine system, sensory input and output coordination\n\n" +
                "5.2 Immune system: Defense mechanism, humeral and cell mediated immune responses, vaccines and monoclonal antibody.\n\n" +
                "Laboratory Works:\n\n" +
                "1. Identification of biomolecules: cellulose, Lignin, Lipid, Protein.\n\n" +
                "2. Analysis of amino acids in protein by paper chromatography and paper electrophoresis.\n\n" +
                "3. Separation of photo synthetic pigments by paper chromatography.\n\n" +
                "4. Determination of value of RQ of different respiratory substrates.\n\n" +
                "5. Study of different types of plant and anima cells in temporary preparation.\n\n" +
                "Text Books:\n\n" +
                "E.D. Enger & F.C. Ross, Concepts in Biology, 9th Edition, Tata McGraw Hill\n\n" +
                "Reference Book:\n\n" +
                "P.H. Reven et.al, Biology, 5th Ed. WBC McGraw Hill.");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
