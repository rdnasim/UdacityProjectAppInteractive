package me.rdnasim.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        String totalQuantity = "Total Item Count : "+ quantity + " coffees";
        String prizeMessage = "Prize $"+ (quantity * 10);
        displayTotalCount(totalQuantity);
        displayMessage(prizeMessage);
    }

    /*private void displayPrize(int number) {
        TextView prizeTextView = (TextView) findViewById(R.id.prize_text_view);
        prizeTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }*/

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.prize_text_view);
        priceTextView.setText(message);
    }
    private void displayTotalCount(String totalCount) {
        TextView priceTextView = (TextView) findViewById(R.id.total_count_coffees);
        priceTextView.setText(totalCount);
    }


}
