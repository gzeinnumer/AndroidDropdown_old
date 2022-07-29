package com.gzeinnumer.androiddropdown_old;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private String[] fruits = {"Apple", "Appy", "Banana", "Cherry", "Date", "Grape", "Kiwi", "Mango", "Pear"};
    private AutoCompleteTextView autoTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoTextView = findViewById(R.id.act);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, fruits);
        autoTextView.setThreshold(1);
        autoTextView.setAdapter(adapter);

    }
}