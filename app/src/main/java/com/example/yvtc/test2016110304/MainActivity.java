package com.example.yvtc.test2016110304;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    String cities[] = {"台北","台中","台南","高雄"};
    String codes[] = {"02","04","06","07"};
    ListView lv;
    ArrayList<Map<String,String>>mylist;
    SimpleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylist = new ArrayList<>();
        for (int i=0;i<=3;i++)
        {
            Map m = new HashMap();
            m.put("city",cities[i]);
            m.put("code",codes[i]);
            mylist.add(m);
        }
        adapter = new SimpleAdapter(MainActivity.this, mylist, R.layout.myitem,
                new String[] {"city", "code"}, new int[] {R.id.textView, R.id.textView2});
        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);
    }
}
