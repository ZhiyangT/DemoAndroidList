package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvItem;
    ArrayList<AndroidVersion> itemList;
    ArrayAdapter aaItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvItem = findViewById(R.id.listViewItem);

        itemList = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie","9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo","8.0-8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat","7.0-7.1.2");


        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

//        aaItem = new ArrayAdapter(this, android.R.layout.simple_list_item_1, itemList);
        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, itemList);
        lvItem.setAdapter(adapter);





    }
}
