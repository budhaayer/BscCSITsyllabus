package csitmnr.bsccsitsyllabus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manoj Budha Ayer on 12/9/2016.
 */
public class Content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    public void c_programming(){
        ListView l;
        setContentView(R.layout.content_firstsem);
        l= (ListView) findViewById(R.id.lv);
        List<String> ls = new ArrayList<String>();
        ls.add("Hello introduction to c proramming");
        ArrayAdapter ad= new ArrayAdapter(this,R.layout.list_item,ls);
        l.setAdapter(ad);
    }
}

