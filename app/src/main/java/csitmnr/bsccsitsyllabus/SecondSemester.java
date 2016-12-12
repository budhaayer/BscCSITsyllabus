package csitmnr.bsccsitsyllabus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manoj Budha Ayer on 12/10/2016.
 */
public class SecondSemester extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Digital Logic");
        ls.add("Discrete Structure");
        ls.add("Microprocessor");
        ls.add("Data Structures and Algorithms");
        ls.add("Linear Algebra");
        ls.add("Statistics II");

        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item,ls);
        lv.setAdapter(ad);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent in= new Intent("android.csitmnr.bsccsitsyllabus.DIGITALLOGIC");
                    startActivity(in);
                }else if (i==1){
                    Intent in= new Intent("android.csitmnr.bsccsitsyllabus.DISCRETESTRUCTURE");
                    startActivity(in);
                }else if (i==2){
                    Intent in= new Intent("android.csitmnr.bsccsitsyllabus.MICROPROCESSOR");
                    startActivity(in);
                }else if (i==3){
                    Intent in= new Intent("android.csitmnr.bsccsitsyllabus.DATASTRUCTUREALGORITHM");
                    startActivity(in);
                }else if (i==4){
                    Intent in= new Intent("android.csitmnr.bsccsitsyllabus.LINEARALGEBRA");
                    startActivity(in);
                }else if (i==5){
                    Intent in= new Intent("android.csitmnr.bsccsitsyllabus.STATISTICSII");
                    startActivity(in);
                }
            }
        });

    }
}
