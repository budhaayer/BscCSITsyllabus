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
public class PhysicsI extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Course Title: Physics I\n\n" +
                "Course no: PHY-105 \t\tFull Marks: 70+10+20\n\n" +
                "Credit hours: 3 \t\tPass Marks: 28+4+8\n\n" +
                "Nature of course: Theory (3 Hrs.) + Lab (3 Hrs.)\n\n" +
                "Course Synopsis: The course deals with related topics in Mechanics and Electrodynamics. Mechanics: Non Relativistic Particle dynamics, conservation laws, harmonic Oscillator, dynamics of rigid body, strength of materials, hydrodynamics. Electrodynamics: Electrostatics, dielectrics, Electrostatic and magnetic energy, Maxwell's equation, propagation of electromagnetic wave. Laboratory works are designed to complement and supplement the theory course.\n\n" +
                "Goal: The course aims at introducing the concepts and methods of physics needed for application in various branch of modern science and technology.\n\n" +
                "Course Content:\n\n" +
                "Mechanics\n\n" +
                "Unit 1. Newton's Law of Motion and Galilean Invariance 4 Hrs.\n\n" +
                "1.1 Newton's laws of motion\n\n" +
                "1.2 Reference frame, Galilean transformation, Galilean Invariance\n\n" +
                "1.3 Transformation equations\n\n" +
                "1.4 Non inertial frames of reference fictious forces\n" +
                "- Centrifugal and coriolis forces\n\n" +
                "Unit 2. Non Relativistic Particle Dynamics 4 Hrs.\n\n" +
                "2.1 Equation of motion of uncharged and charged particles, Charged particles in constant and alternating electric field\n\n" +
                "2.2 Charged particles in a fields, magnetic field- cyclotron, magnetic focusing\n\n" +
                "2.3 Charge particles in combined electric and magnetic field\n\n" +
                "Unit 3. Conservation Laws 7 Hrs.\n\n" +
                "3.1 Laws of conservation of momentum and energy.\n\n" +
                "3.2 Conservative forces, potential energy,\n\n" +
                "3.3 Potential energy in electric and gravitational fields.\n\n" +
                "3.4 Non conservative forces, General laws of conservation of energy.\n\n" +
                "3.5 Collision in three dimensions, lab and cm. frames of reference, final velocities after collision, scattering angle,\n\n" +
                "3.6 Law of conservation of angular momentum - rotational invariance of potential energy\n\n" +
                "3.7 Example - motion of a planet, Kepler's laws\n\n" +
                "Unit 4. Harmonic Oscillator 6 Hrs.\n\n" +
                "4.1 Harmonic oscillator, energy, example: diatomic molecule.\n\n" +
                "4.2 An harmonic oscillator - pendulum with large oscillation\n\n" +
                "4.3 Damped oscillations, power factor, Q - factor\n\n" +
                "4.4 Driven oscillations, resonance, phase and half width\n\n" +
                "4.5 LCR and parallel resonance circuits.\n\n" +
                "Unit 5. Viscosity 2 Hrs.\n\n" +
                "5.1 Viscosity, Newton's law of viscous force, analogy between current flow and viscous flow\n\n" +
                "5.2 Motion of a body in a viscous medium.\n\n" +
                "Electrodynamics\n\n" +
                "Unit 6. Electrostatics 7 Hrs.\n\n" +
                "6.1 Electric field and electric potential\n\n" +
                "6.2 Divergence of E and Gauss's law, applications\n\n" +
                "6.3 Solution of electrostatic problems, Poisson's and Lap lace's equations\n\n" +
                "6.4 Solution of Lap laces equations in spherical cylindrical coordinates and rectangular coordinates\n\n" +
                "6.5 Examples conducting sphere in a uniform E field, method of images, point charge and a conducting sphere, line charge and line images, systems of conductors.\n\n" +
                "6.6 Solution of Poisson's equation\n\n" +
                "Unit 7. Dielectrics 4 Hrs.\n\n" +
                "7.1 Electric field in a dielectric media\n\n" +
                "- Polarization, field inside and outside a dielectric gauss's law in a dielectric medium-displacement vector, electric susceptibility and dielectric constant\n\n" +
                "- Boundary conditions on field vectors, boundary value problems in a dielectric medium, dielectric sphere in a uniform el. field.\n\n" +
                "7.2 Molecular theory of dielectrics, induced dipoles\n\n" +
                "Unit 8. Electrostatic Energy 1 Hr.\n\n" +
                "8.1 Potential energy of a group of charges and charge distributions, energy density.\n\n" +
                "8.2 energy of a system of charged conductors\n\n" +
                "Unit 9. Magnetic Field Energy 1 Hr.\n\n" +
                "9.1 Vector potential, and magnetic field\n\n" +
                "9.2 Energy density in the magnetic field, magnetic energy of coupled circuits.\n\n" +
                "Unit 10. Slowly Varying Current 3 Hrs.\n\n" +
                "10.1 Transient and steady state behavior\n\n" +
                "10.2 Series and parallel connection of impedances\n\n" +
                "10.3 Power, power factor, Resonance.\n\n" +
                "Unit 11. Maxwell's Equation 6 Hrs.\n\n" +
                "11.1 Maxwell's equations - displacement current\n\n" +
                "11.2 Electromagnetic energy\n\n" +
                "11.3 Wave equations without and with source, boundary conditions\n\n" +
                "Laboratory Works:\n\n" +
                "\uF0B7 To draw I-V characteristics of Ohmic and non Ohmic resisters and find voltage current ration.\n\n" +
                "\uF0B7 To study the junction diode and LED characteristics.\n\n" +
                "\uF0B7 To study the temperature dependence of resistance of a given semiconductors\n\n" +
                "\uF0B7 To determine the moment of inertia of a fly wheel.\n\n" +
                "\uF0B7 To determine the modulus of rigidity for the material of a rod by using the horizontal pattern of the twisting apparatus.\n\n" +
                "\uF0B7 To determine the terminal velocity and find coefficient of viscosity by Stoke's method.\n\n" +
                "\uF0B7 To determine the surface tension of work with a capillary tube.\n\n" +
                "\uF0B7 To determine the impedance of a given LCR circuit.\n\n" +
                "\uF0B7 To study characteristics of NPN transistor.\n\n" +
                "\uF0B7 To determine dielectric constant by using Lissagous pattern.\n\n" +
                "\uF0B7 To construct CE amplifier for the determination of the voltage gain of the amplifier.\n\n" +
                "\uF0B7 To study the characteristic of a Zener a diode (Switches) and use it to regulate power supply.\n\n" +
                "\uF0B7 To construct and study the working of NOT-AND-OR, NAND and NOR gates.\n\n" +
                "\uF0B7 To construct and study the working of OR, NAN and NOR gates.\n\n" +
                "Text books:\n\n" +
                "(1) D.S. Mathur, Mechanics, S. Chand and Company Ltd\n\n" +
                "(2) John R. Ritz, Frederick J. Milford and Robert W. Christy, Foundations of Electromagnetic Theory, Narosa Publishing House\n" +
                "References:\n\n" +
                "(1) David J Griffith, Introduction to Electrodynamics, 2nd Edition, Prentice Hall of India, 1994.\n\n" +
                "Prerequisite: Calculus based introductory physics\n\n" +
                "Note: Home work assignments: Several numerical problems to be given every week.");


        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item1,ls);
        lv.setAdapter(ad);

    }
}
