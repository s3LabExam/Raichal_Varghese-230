package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onOptionsItemCreate(MenuItem menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, (Menu) menu);
    }

    public boolean onOptionsItemSelected(Menu item){
        int id = R.menu.menu;
        if(id==R.id.mu){
            Toast.makeText(this,"Manchester United Selected",Toast.LENGTH_LONG).show();
        }
        return onOptionsItemSelected(item);
    }
}
