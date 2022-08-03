package com.gachon.frimo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.getbase.floatingactionbutton.FloatingActionButton
import com.getbase.floatingactionbutton.FloatingActionsMenu
import java.time.Instant

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fam: FloatingActionsMenu = findViewById(R.id.floating_menu)

        var fam_friendly_community: FloatingActionButton = findViewById(R.id.floating_btn2)
        var fam_trend_report: FloatingActionButton = findViewById(R.id.floating_btn3)

        fam_friendly_community.setOnClickListener{

            val intent = Intent(this, FriendlyCommunity::class.java)
            startActivity(intent)
        }

        fam_trend_report.setOnClickListener{

            val intent = Intent(this, TrendReport::class.java)
            startActivity(intent)
        }
    }

}