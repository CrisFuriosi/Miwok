package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Link this Java file with activity_numbers XML file
        setContentView(R.layout.activity_colors);

        //Create an ArrayList of colors in English language (String ArrayList)
        ArrayList<String> colorsInEnglish = new ArrayList<>();

        //Add Strings in colorsInEnglish ArrayList
        colorsInEnglish.add("red, weṭeṭṭi");
        colorsInEnglish.add("green, chokokki");
        colorsInEnglish.add("brown, ṭakaakki");
        colorsInEnglish.add("gray, ṭopoppi");
        colorsInEnglish.add("black, kululli");
        colorsInEnglish.add("white, kelelli");
        colorsInEnglish.add("dusty yellow, ṭopiisә");
        colorsInEnglish.add("mustard yellow, chiwiiṭә");
        
        // Create an {@link ArrayAdapter}, whose data source is a list of Strings.
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, colorsInEnglish);
        GridView gridView = findViewById(R.id.colors_list);
        gridView.setAdapter(itemsAdapter);



    }
}
