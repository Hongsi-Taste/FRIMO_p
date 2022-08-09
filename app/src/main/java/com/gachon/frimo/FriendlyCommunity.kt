package com.gachon.frimo

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gachon.frimo.databinding.FriendlyCommunityBinding
import com.skydoves.powermenu.MenuAnimation
import com.skydoves.powermenu.OnMenuItemClickListener
import com.skydoves.powermenu.PowerMenu
import com.skydoves.powermenu.PowerMenuItem

class FriendlyCommunity : AppCompatActivity() {

    private lateinit var menu : PowerMenu
    private lateinit var binding: FriendlyCommunityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = FriendlyCommunityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 기존 action bar 제거 후 custom action bar 넣기
        supportActionBar!!.hide()

        // menu
        val icon = findViewById<ImageView>(R.id.ic_menu)
        icon.setImageResource(R.drawable.ic_list)

        // menu icon click listener
        icon.setOnClickListener {
                view -> menu.showAsDropDown(view)
        }

        // menu
        menu = PowerMenu.Builder(this)
            .addItem(PowerMenuItem("Change profile", false))
            .addItem(PowerMenuItem("Friend candidate", false))
            .addItem(PowerMenuItem("Add contents", false))
            .setAnimation(MenuAnimation.SHOWUP_TOP_RIGHT) // popup시 menu가 뜨는 위치
            .setTextColor(Color.BLACK)
            .setTextGravity(Gravity.CENTER) // 글자 위치
            .setOnMenuItemClickListener(changeMenuItemClickListener)
            .build()


    }

    // change menu item click listener
    private val changeMenuItemClickListener =
        OnMenuItemClickListener<PowerMenuItem> { position, item ->
            Toast.makeText(baseContext, item.title, Toast.LENGTH_SHORT).show()
            val intent: Intent
            when (position) {
                0 -> {
                    intent = Intent(this, ModifyProfile::class.java)
                    startActivity(intent)
                }
                1 -> {
                    intent = Intent(this, FriendCandidate::class.java)
                    startActivity(intent)
                }
                2 -> {
                    intent = Intent(this, AddContents::class.java)
                    startActivity(intent)
                }
            }
        }

}