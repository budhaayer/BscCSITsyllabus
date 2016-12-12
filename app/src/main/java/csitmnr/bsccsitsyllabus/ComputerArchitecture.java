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
public class ComputerArchitecture extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Computer Architecture\n\n" +
                "Course no: CSC-201\t\t Full Marks: 90+10\n\n" +
                "Credit hours: 3 \t\tPass Marks: 36+4\n\n" +
                "Nature of course: Theory (3 Hrs.)\n\n" +
                "Course Synopsis: This course gives the fundamental knowledge concern with the way the hardware components are connected together to form a computer system and how they interact to provide the processing needs of the user.\n\n" +
                "Goals:\n\n" +
                "\uF0B7 Introduces the fundamental concepts behind the design working and organization of a computer system.\n\n" +
                "\uF0B7 Instruction set architecture, memory hierarchies and interconnection.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1. Data Representation 5 Hrs.\n\n" +
                "Complements, Fixed point representation, Floating-Point Representation, Gray Code, Error Detection Codes\n\n" +
                "Unit 2. Microoperations 5 Hrs.\n\n" +
                "Arithmetic Microoperations, Logic Microoperations, Shift Microoperations, Arithmetic Logic Shift Unit\n\n" +
                "Unit 3. Fundamental of Computer Organization and Design 7 Hrs.\n\n" +
                "Computer Register, Computer Instructions, Instruction Cycle, Input and Output and Interrupt, Basic computer Design and Accumulator Logic\n\n" +
                "Unit 4. Control Unit 5 Hrs.\n\n" +
                "Control Memory, Hardwired control, Microprogrammed Control\n\n" +
                "Unit 5. Central Processing Unit 6 Hrs.\n\n" +
                "Register Organization, Register Stack an memory Stack, One address and two address instruction, Addressing Modes, Data transfer and Manipulation, Introduction to RISC and CISC\n\n" +
                "Unit 6. Fixed point Computer Arithmetic 5 Hrs.\n\n" +
                "Addition and Subtraction, Multiplication, Division Algorithm,\n\n" +
                "Unit 7. Input and Output Organization 6 Hrs.\n\n" +
                "Introduction to Peripheral Devices, I/O interface, Direct Memory Access ( DMA), I/O Processor, Data communication processor\n\n" +
                "Unit 8. Memory Organization 6 Hrs.\n\n" +
                "Hierarchy of Memory System, Primary and Secondary Memory, Virtual Memory, Memory Management hardware\n\n" +
                "Text Books: M. Morris Mano, Computer System Architecture\n\n" +
                "References:\n\n" +
                "M. Morris Mano “Digital Design”, Pearson Education, Third Edition\n\n" +
                "M. Morris Mano “Logic and Computer Design Fundamentals, Pearson Education, 2nd Edition Updated.");


        ArrayAdapter<String> ad = new ArrayAdapter<String>(this, R.layout.list_item1, ls);
        lv.setAdapter(ad);
        }
    }
