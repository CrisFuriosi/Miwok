/*
  Copyright (C) 2016 The Android Open Source Project
  <p>
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
  <p>
  http://www.apache.org/licenses/LICENSE-2.0
  <p>
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Link this Java file with list_item XML file
        setContentView(R.layout.activity_numbers);

        //Create an ArrayList of numbers in default and Miwok translations (Word ArrayList)
        ArrayList<Word> numbers = new ArrayList<>();

        //Add Strings in numbers ArrayList
        numbers.add(new Word("one", "lutti"));
        numbers.add(new Word("two", "otiiko"));
        numbers.add(new Word("three", "tolookosu"));
        numbers.add(new Word("four", "oyyisa"));
        numbers.add(new Word("five", "massokka"));
        numbers.add(new Word("six", "temmokka"));
        numbers.add(new Word("seven", "kenekaku"));
        numbers.add(new Word("eight", "kawinta"));
        numbers.add(new Word("nine", "wo’e"));
        numbers.add(new Word("ten", "na’aacha"));

        // Create an {@link ArrayAdapter}.
        WordAdapter numbersAdapter = new WordAdapter(this, numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = findViewById(R.id.numbers_list);

        // Make the {@link ListView} use the {@link ArrayAdapter}.
        listView.setAdapter(numbersAdapter);
    }
}


