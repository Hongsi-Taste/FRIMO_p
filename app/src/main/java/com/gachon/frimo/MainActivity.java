package com.gachon.frimo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Floating Action Button
        FloatingActionsMenu fam = (FloatingActionsMenu) findViewById(R.id.floating_menu);
    }
}