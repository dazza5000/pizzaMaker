package com.whereisdarran.javatodoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<String> toppings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = findViewById(R.id.charles_list_view);


        final EditText editText = findViewById(R.id.input_edit_text);

        toppings.add("pepperoni");

        final ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, toppings);

        listView.setAdapter(itemsAdapter);

        toppings.add("mushrooms");

        woot();

        Button button = findViewById(R.id.save_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = editText.getText().toString();
                editText.setText("");
                toppings.add(inputText);
                itemsAdapter.notifyDataSetChanged();
            }
        });


    }

    @Override
    public void onClick(View view) {

    }

    private void woot() {
        //whatever
    }
}
