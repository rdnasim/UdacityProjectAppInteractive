package me.rdnasim.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        int numberOfCoffees = 2;
        int prizePerCoffee = 10;
        display(numberOfCoffees);
        displayPrize(numberOfCoffees * prizePerCoffee);
    }

    private void displayPrize(int number) {
        TextView prizeTextView = (TextView) findViewById(R.id.prize_text_view);
        prizeTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public void decrement(View view) {
        int quantity = 2;
        quantity = 1;
        display(quantity);
    }

    public void increment(View view) {
        int quantity = 2;
        quantity = 3;
        display(quantity);
    }
}
