package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private EditText input;
    private Button button;
    private ListView listView;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> arrayAdapter;

   String items[] = new String [] {"10 Kg Farine","10 L Huile","4 kg Tomates","10 Leuvures","10 L Eau","1 Extrait Vanille","100 g poivre noire","200 g Olives noire"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();
        input = (EditText)findViewById(R.id.input);
        listView = (ListView) findViewById(R.id.ListView);
        button=(Button) findViewById(R.id.btn);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                arrayList.add(input.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

    }
}