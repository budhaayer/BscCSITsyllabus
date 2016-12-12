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
public class DiscreteStructure extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Discrete Structure\n\n" +
                "Course no: CSC-152 \t\tFull Marks: 90+10\n\n" +
                "Credit hours: 3 \t\tPass Marks: 36+4\n\n" +
                "Nature of course: Theory (3 Hrs.)\n\n" +
                "Course Synopsis: This course contains the fundamental concepts of logic, reasoning and algorithms.\n\n" +
                "Goal: After completing this course, the target student will gain knowledge in discrete mathematics and finite state automata in an algorithmic approach. It helps the target student in gaining fundamental and conceptual clarity in the area of Logic, Reasoning, Algorithms, Recurrence Relation, and Graph Theory.\n\n" +
                "Course Contents:\n\n" +
                "Unit 1. Logic, Induction and Reasoning 12 Hrs.\n\n" +
                "Proposition and Truth function, Propositional Logic, Expressing statements in Logic Propositional Logic, The predicate Logic, Validity, Informal Deduction in Predicate Logic, Rules of Inference and Proofs, Informal Proofs and Formal Proofs, Elementary Induction, Complete Induction, Methods of Tableaux, Consistency and Completeness of the System.\n\n" +
                "Unit 2. Finite State Automata 10 Hrs.\n\n" +
                "Sequential Circuits and Finite state Machine, Finite State Automata, Language and Grammars, Non-deterministic Finite State Automata, Language and Automata, Regular Expression.\n\n" +
                "Unit 3. Recurrence Relations 8 Hrs.\n\n" +
                "Recursive Definition of Sequences, Solution of Linear recurrence relations, Solution to Nonlinear Recurrence Relations, Application to Algorithm Analysis. Combinatory, Partial Order relation.\n\n" +
                "Unit 4. Graph Theory 15 Hrs.\n\n" +
                "Undirected and Directed Graphs, Walk Paths, Circuits, Components, Connectedness Algorithm, Shortest Path Algorithm, Bipartite Graphs, Planar Graphs, Regular Graphs, Planarity Testing Algorithms, Eulerian Graph, Hamiltonian Graph, Tree as a Directed Graph, Binary Tree, Spanning Tree, Cutsets and Cutvertices, Network Flows, Maxflow and Mincut Theorem, Data Structures Representing Trees and Graphs in Computer, Network Application of Trees and Graphs, Concept of Graph Coloring.\n\n" +
                "Text / Reference books:\n\n" +
                "1. Kenth Rosen, Discrete Mathematical Structures with Applications to Computer Science, WCB/ McGraw Hill\n" +
                "2. G. Birkhoff, T.C. Bartee, Modern Applied Algebra, CBS Publishers.\n" +
                "3. R. Johnsonbaugh, Discrete Mathematics, Prentice Hall Inc.\n" +
                "4. G.Chartand, B.R.Oller Mann, Applied and Algorithmic Graph Theory, McGraw Hill\n" +
                "5. Joe L. Mott, Abrahan Kandel, and Theodore P. Baker, Discrete Mathematics for Computer Scientists and Mathematicians, Prentice-Hall of India");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
