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
public class Microprocessor extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Microprocessor\n\n" +
                "Course no: CSC-153 \t\tFull Marks: 70+10+20\n\n" +
                "Credit hours: 3 \t\tPass Marks: 28+4+8\n\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: This course contains of fundamental concepts of computer organization, basic I/O interfaces and Interrupt operations.\n\n" +
                "Goal: The course objective is to introduce the operation, programming, and application of microprocessor.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1. Introduction 3 Hrs.\n\n" +
                "Introduction to Microprocessors, Basic organization\n\n" +
                "Unit 2. Basic Computer Architecture 10 Hrs.\n\n" +
                "SAP Architectures, Instructions, Microprogram; 8-bit \"W\" bus, 4-bit program counter, 4-bit Memory Address Register (MAR), 16x8-bit memory, 8-bit instruction register (IR), 6-cycle controller with 12-bit micro-instruction word, 8-bit accumulator, 8-bit B register, 8-bit adder-subtractor, 8-bit output register, SAP-1 Instructions, Fetch & Execution, microprogram, fetch cycle, execution cycle, microprogram, controller implementation, SAP 2 Architecture, architectural differences with SAP-1, bi-directional registers, instruction set, flags.\n\n" +
                "Unit 3. Instruction Cycle 3 Hrs.\n\n" +
                "Fetch Operation and Timing Diagram, Execute Operation and Timing Diagram, Machine Cycle and States\n\n" +
                "Unit 4. Intel 8085\\8086\\8088 8 Hrs.\n\n" +
                "Functional Block Diagram and Pin configuration, Timing and Control Unit, Registers, Data and Address Bus, Instructions, Operation Code and Operands, Addressing Modes, Interrupts, Flags, Instructions and Data Flow\n\n" +
                "Unit 5. Assembly Language Programming 9 Hrs.\n\n" +
                "Assembly instruction format, Instruction Types, Mnemonics, Operands, Macro assemblers, Linking, Assembler directives, Simple sequence programs, Flags, Branch, Jumps, While-Do, Repeat-Until, If-Then-Else and Multiple If-then Programs, Debugging.\n\n" +
                "Unit 6. Basic I/O, Memory R/W and Interrupt Operations 6 Hrs.\n\n" +
                "Memory Read, Memory Write, I/O Read, I/O Write, Direct Memory Access, Interrupt, Types, Interrupt Masking, 8259 operation.\n\n" +
                "Unit 7. Input/ Output Interfaces 6 Hrs.\n\n" +
                "Parallel communication, Serial communication, Data transfer wait operation, 8255A working, 8255A Modes, RS-232 interface, Keyboard and display controller.\n\n" +
                "Laboratory works: Assembly language programming using 8085\\8086\\8088 trainer kit. The programming should include: Arithmetic operation, base conversion, conditional branching etc. Sample Lab work list may include:\n\n" +
                "1. Assembly language program using 8085 microprocessor kit.\n\n" +
                "2. Program should comprise the use of all types of instructions and addressing modes.\n" +
                "3. The programming should include the concept of Arrays and the concept of Multiplications and Division operations on Microprocessor.\n" +
                "4. Assembly language programming, using any type of Assembler, which should include the different functions of Int 10h, and Int 21h.\n\n" +
                "References:\n\n" +
                "1. Ramesh S. Gaonkar, Microprocessor Architecture, Programming, and Applications with 8085, Prentice Hall\n" +
                "2. A. P. Malvino and J, A. Brown, Digital Computer Electronics, 3rd Edition, Tata McGraw Hill\n" +
                "3. D. V. Hall, Microprocessors and Interfacing - Programming and Hardware, McGraw Hill\n" +
                "4. 0000 to 8085 Introduction to 8085 Microprocessor for Engineers and Scientists, A. K. Gosh, Prentice Hall");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
