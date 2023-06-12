package com.greg.assigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //create icon functions
    public void click_registration(View view)
    {
        Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void click_cart(View view)
    {
        Intent intent = new Intent(MainActivity.this, CartActivity.class);
        startActivity(intent);
    }

    //create imagebutton functions
    public void buttonClick(View view) {
        int buttonId = view.getId();
        if(buttonId==R.id.soups){
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            intent.putExtra("fragment", "soups");
            startActivity(intent);
        }else if(buttonId==R.id.vegetables){
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            intent.putExtra("fragment", "vegetables");
            startActivity(intent);
        } else if (buttonId==R.id.meals) {
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            intent.putExtra("fragment", "meals");
            startActivity(intent);
        } else if (buttonId==R.id.drinks) {
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            intent.putExtra("fragment", "drinks");
            startActivity(intent);
        } else if (buttonId==R.id.desserts) {
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            intent.putExtra("fragment", "desserts");
            startActivity(intent);
        }
    }
}