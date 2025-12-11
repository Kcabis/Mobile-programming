package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
public class MenuActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Toolbar toolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.menu_home:
                //Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MenuActivity.this,SecondActivity.class));
                return true;

            case R.id.menu_about:
                //Toast.makeText(this, "about Clicked", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MenuActivity.this,MainActivity.class));
                return true;
            case R.id.menu_settings:
                //Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(MenuActivity.this,MenuActivity.class));

                return true;
        }


        return super.onOptionsItemSelected(item);
    }




}