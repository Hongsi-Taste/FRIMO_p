package com.gachon.frimo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //floating action menu+button
        FloatingActionsMenu fam = (FloatingActionsMenu) findViewById(R.id.floating_menu);

        FloatingActionButton btn2 = findViewById(R.id.floating_btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FriendlyCommunity.class);
                startActivity(intent);
            }
        });

    }
}