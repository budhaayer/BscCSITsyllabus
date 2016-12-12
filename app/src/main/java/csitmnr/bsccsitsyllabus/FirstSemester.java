package csitmnr.bsccsitsyllabus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manoj Budha Ayer on 12/9/2016.
 */
public class FirstSemester extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);
        lv = (ListView) findViewById(R.id.lv);

        List<String> ls = new ArrayList<>();

        ls.add("Introduction to Information Technology");
        ls.add("Fundamentals of Computer Programming");
        ls.add("Probability and Statistics");
        ls.add("Calculus and Analytical Geometry");
        ls.add("Physics I");
        ls.add("Biology I");
        ls.add("Geology I");
        ls.add("Statistics I");

        ArrayAdapter<String> ad= new ArrayAdapter<String>(this,R.layout.list_item,ls);
        lv.setAdapter(ad);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent in= new Intent("android.csitmnr.bsccsitsyllabus.FUNDAMENTALOFINFORMATIONTECHNOLOGY");
                    startActivity(in);
                }else if(i==1){
                    Intent in= new Intent("android.csitmnr.bsccsitsyllabus.COMPUTERPROGRAMMING");
                    startActivity(in);
                }else if (i==2){
                    Intent in= new Intent("android.csitmnr.bsccsitsyllabus.PROBABILITYSTATISTICS");
                    startActivity(in);
                }else if(i==3){
                    Intent in= new Intent("android.csitmnr.bsccsitsyllabus.CALCULUS");
                    startActivity(in);
                }else if(i==4){
                    Intent in= new Intent("android.csitmnr.bsccsitsyllabus.PHYSICSI");
                    startActivity(in);
                }else if(i==5){
                    Intent in= new Intent("android.csitmnr.bsccsitsyllabus.BIOLOGYI");
                    startActivity(in);
                }else if (i==6){
                    Intent in= new Intent("android.csitmnr.bsccsitsyllabus.GEOLOGYI");
                    startActivity(in);
                }else if (i==7){
                    Intent in=new Intent("android.csitmnr.bsccsitsyllabus.STATISTICSI");
                    startActivity(in);
                }
            }
        });

    }
}
