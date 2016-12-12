package csitmnr.bsccsitsyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    ScrollView sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.fsemester);
        b2 = (Button) findViewById(R.id.secondsemester);
        b3 = (Button) findViewById(R.id.thirdsemester);
        b4= (Button) findViewById(R.id.fourthsemester);
        b5= (Button) findViewById(R.id.fifthsemester);
        b6= (Button) findViewById(R.id.sixthsemester);
        b7= (Button) findViewById(R.id.seventhsemester);
        b8= (Button) findViewById(R.id.eighthsemester);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent("android.bsccsitsyllabus.FIRSTSEMESTER");
                startActivity(in);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent("android.csitmnr.bsccsitsyllabus.SECONDSEMESTER");
                startActivity(in);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent("android.csitmnr.bsccsitsyllabus.THIRDSEMESTER");
                startActivity(in);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
