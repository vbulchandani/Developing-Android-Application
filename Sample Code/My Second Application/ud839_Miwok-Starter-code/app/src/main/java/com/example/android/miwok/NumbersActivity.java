package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        //String words [] = new String [] {"one","two","three","four","five","six","seven","eight","nine","ten"};


        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        words.add("eleven");
        words.add("twelve");
        words.add("thirteen");
/*
        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        // Create a variable to keep track of the current index position
        int index = 0;
        // Keep looping until we've reached the end of the list (which means keep looping
        // as long as the current index position is less than the length of the list)
        while (index < words.size()) {
            // Create a new TextView
            TextView wordView = new TextView(this);
            // Set the text to be word at the current index
            wordView.setText(words.get(index));
            // Add this TextView as another child to the root view of this layout
            rootView.addView(wordView);
            // Increment the index variable by 1
            index++;
        }

*/

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);


    }
}
