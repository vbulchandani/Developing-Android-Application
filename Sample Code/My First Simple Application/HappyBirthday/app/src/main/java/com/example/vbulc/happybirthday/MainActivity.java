package com.example.vbulc.happybirthday;

import java.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    protected  int numberOfCoffee = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void incrementPrice(View view){
        numberOfCoffee++;
        display(numberOfCoffee);
    }

    public void decrementPrice(View view){
        if(numberOfCoffee>0)
            numberOfCoffee--;
        display(numberOfCoffee);
    }
    public void submitOrder(View view) {
        //int numberOfCoffee = 2;
        //display(numberOfCoffee);
        //displayPrice(numberOfCoffee*5);
        int price = numberOfCoffee * 5;
        String priceMessage = "Total: $" + price;
        displayMessage(priceMessage);

    }


    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }


    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given quantity value on the screen.
     */


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}