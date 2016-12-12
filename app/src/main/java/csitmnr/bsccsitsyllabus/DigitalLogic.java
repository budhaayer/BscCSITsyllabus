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
public class DigitalLogic extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Digital Logic\n\n" +
                "Course no: CSC-151 \t\tFull Marks: 70+10+20\n\n" +
                "Credit hours: 3 \t\tPass Marks: 28+4+8\n\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: General concepts to be used in the design and analysis of digital systems and introduces the principles of digital computer organization and design.\n\n" +
                "Goals:\n\n" +
                "„h Introduce fundamental digital logics and switching networks. Exposure of Boolean algebra and its application for circuit analysis.\n\n" +
                "„h Introduction to multilevel gates networks, flip-flops, counters and logic devices.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1. Binary Systems 7 Hrs.\n\n" +
                "Digital Systems, Binary Numbers, Number base conversion, Octal and hexadecimal numbers, Binary Systems, Integrated Circuits\n\n" +
                "Unit 2. Boolean algebra and Logic Gates 6 Hrs.\n\n" +
                "Basic definition of Boolean Algebra, Basic Theory of Boolean Algebra, Boolean Function, Logic operations, Logic Gates, IC Digital Logic Families\n\n" +
                "Unit 3. Simplification of Boolean Functions 6 Hrs.\n\n" +
                "K-map, Two and three Variable Maps, Four variable Maps, Product of Sums, sum of product simplification, NAND and NOR implementation\n\n" +
                "Unit 4. Combinational Logic 6 Hrs.\n\n" +
                "Design Procedure, Adders, Subtractors, Code Conversion, Analysis Procedure, NAND Circuits, NOR Circuits, Exclusive -OR Circuit\n\n" +
                "Unit 5. Combinational Logic with MSI and LSI 6 Hrs.\n\n" +
                "Binary Parallel Adder, Decimal Adder, Magnitude Comparator, Decoders, Multiplexers, Read- Only- Memory (ROM), Programmable Logic array (PLA)\n\n" +
                "Unit 6. Sequential Logic 8 Hrs.\n\n" +
                "Flip-flops, Triggering of flip-flops, Design procedure, Design with state equations and state reduction table.\n\n" +
                "Unit 7. Registers and Counters 6 Hrs.\n\n" +
                "Resisters, Shift registers, Ripple Counters, Synchronous Counters, Timing Sequences,\n" +
                "The Memory Unit\n\n" +
                "Laboratory works:\n\n" +
                "1. Familiarization with logic gates\n" +
                "2. Encodes and decodes\n" +
                "3. Multiplexer and de-multiplexer\n" +
                "4. Design of simple combination circuits\n" +
                "5. Design of adder/subtractor\n" +
                "6. Design f Flip-Flop\n" +
                "7. Clock driven sequential circuits\n" +
                "8. Conversion of parallel data into serial format\n" +
                "9. Generation of timing signal for sequential system\n\n" +
                "Text Book\n\n" +
                "M. Morris Mao, \"Logic & Computer Design Fundamentals\", Pearson Education.");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
