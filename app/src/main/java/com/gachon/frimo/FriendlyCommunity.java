package com.gachon.frimo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.skydoves.powermenu.MenuAnimation;
import com.skydoves.powermenu.OnMenuItemClickListener;
import com.skydoves.powermenu.PowerMenu;
import com.skydoves.powermenu.PowerMenuItem;

public class FriendlyCommunity extends AppCompatActivity {

    private PowerMenu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friendly_community);

        // 기존 action bar 제거 후 custom action bar 넣기
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ImageView icon = findViewById(R.id.ic_menu);
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu.showAsDropDown(view);
            }
        });

        menu = new PowerMenu.Builder(this)
                .addItem(new PowerMenuItem("Change profile", false))
                .addItem(new PowerMenuItem("Friend candidate", false))
                .addItem(new PowerMenuItem("Add contents", false))
                .setAnimation(MenuAnimation.SHOWUP_TOP_RIGHT) // popup시 menu가 뜨는 위치
                .setTextColor(Color.BLACK)
                .setTextGravity(Gravity.CENTER) // 글자 위치
                .setOnMenuItemClickListener(changeMenuItemClickListener)
                .build();
    }

    // change mode menu item click listener
    private final OnMenuItemClickListener<PowerMenuItem> changeMenuItemClickListener =
            new OnMenuItemClickListener<PowerMenuItem>() {
                @Override
                public void onItemClick(int position, PowerMenuItem item) {

                    Toast.makeText(getBaseContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
                    Intent intent;

                    switch (position) {
                        case 0: // Change profile
                            intent = new Intent(FriendlyCommunity.this, ChangeProfile.class);
                            startActivity(intent);
                            break;

                        case 1: // Friend candidate
                            intent = new Intent(FriendlyCommunity.this, FriendCandidate.class);
                            startActivity(intent);
                            break;

                        case 2: // Add contents
                            intent = new Intent(FriendlyCommunity.this, AddContents.class);
                            startActivity(intent);
                            break;
                    }
                }
            };
}
