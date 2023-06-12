package com.greg.assigment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "Order";
    private static final int DB_VERSION = 1;


    MyDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //create a database
        String createTableQuery = "CREATE TABLE COUNTRY (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "NAME TEXT, Quantity INTEGER, Price FLOAT)";
        sqLiteDatabase.execSQL(createTableQuery);}

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion)
    {
        ContentValues newValues = new ContentValues();
        if(oldVersion<2) {
            newValues.put("NAME", " ");
            newValues.put("QUANTITY",0);
            newValues.put("PRICE",0.00f);
//            sqLiteDatabase.update("Order", newValues,);
        }
    }
}

public class MenuActivity extends AppCompatActivity {

    SQLiteDatabase db;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        SQLiteOpenHelper databaseHelper = new MyDatabaseHelper(this);


        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this);
        ViewPager2 viewPager2 = findViewById(R.id.view_pager);
        viewPager2.setAdapter(sectionsPagerAdapter);

        Toolbar tb = findViewById(R.id.toolbar_menu);
        setSupportActionBar(tb);

        Intent intent = getIntent();
        String fragmentName = intent.getStringExtra("fragment");

        Fragment fragment = null;
        if (fragmentName.equals("soups")) {
            getSupportFragmentManager().beginTransaction()
                    .replace(androidx.fragment.R.id.action_container,new SoupMenuFragment())
                    .commit();
        }
        else if (fragmentName.equals("vegetables")) {
            getSupportFragmentManager().beginTransaction()
                    .replace(androidx.fragment.R.id.action_container,new VegetableMenuFragment())
                    .commit();
        }
        else if(fragmentName.equals("meals")){
            getSupportFragmentManager().beginTransaction()
                    .replace(androidx.fragment.R.id.action_container,new MealMenuFragment())
                    .commit();
        }
        else if(fragmentName.equals("drinks")){
            getSupportFragmentManager().beginTransaction()
                    .replace(androidx.fragment.R.id.action_container,new DrinkMenuFragment())
                    .commit();
        }
        else if(fragmentName.equals("desserts")){
            getSupportFragmentManager().beginTransaction()
                    .replace(androidx.fragment.R.id.action_container,new DessertMenuFragment())
                    .commit();
        }

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(androidx.fragment.R.id.action_container, fragment)
                    .commit();
        }

        TabLayout tabLayout = findViewById(R.id.tabs);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) ->
        {
            switch (position) {
                case 0:
                      tab.setText(getResources().getString(R.string.soup_tab));
                    break;
                case 1:
                    tab.setText(getResources().getString(R.string.vegetable_tab));
                    break;
                case 2:
                    tab.setText(getResources().getString(R.string.meal_tab));
                    break;
                case 3:
                    tab.setText(getResources().getString(R.string.drink_tab));
                    break;
                case 4:
                    tab.setText(getResources().getString(R.string.dessert_tab));
                default:
                    throw new IllegalStateException("Unexpected value: "+ position);
            }
        }).attach();


    }
    private class SectionsPagerAdapter extends FragmentStateAdapter {
        public SectionsPagerAdapter(FragmentActivity fa) {
            super(fa);
        }
        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch(position){
                case 0:
                    return new SoupMenuFragment();
                case 1:
                    return new VegetableMenuFragment();
                case 2:
                    return new MealMenuFragment();
                case 3:
                    return new DrinkMenuFragment();
                case 4:
                    return new DessertMenuFragment();
                default:
                    return null;
            }
        }

        @Override
        public int getItemCount() {
            return 5;
        }
    }
}

