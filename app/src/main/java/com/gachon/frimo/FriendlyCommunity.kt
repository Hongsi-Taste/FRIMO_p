package com.gachon.frimo

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.gachon.frimo.adapter.InterestAdapter
import com.gachon.frimo.databinding.FriendlyCommunityBinding
import com.gachon.frimo.entity.Interest
import com.skydoves.powermenu.MenuAnimation
import com.skydoves.powermenu.OnMenuItemClickListener
import com.skydoves.powermenu.PowerMenu
import com.skydoves.powermenu.PowerMenuItem

class FriendlyCommunity : AppCompatActivity() {

    private lateinit var menu : PowerMenu
    private lateinit var binding: FriendlyCommunityBinding
    private val interest: ArrayList<Interest> = ArrayList() // Interests

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = FriendlyCommunityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 기존 action bar 제거 후 custom action bar 넣기
        supportActionBar!!.hide()

        binding.labelInterests.setOnClickListener{

            prepareInterestData(); // RecyclerView에 보여 줄 data 받아오기
            binding.recyclerView.adapter = InterestAdapter(interest)
            binding.recyclerView.layoutManager = GridLayoutManager(this, 2)
        }



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

    private fun prepareInterestData() {

        // Todo: 크롤링으로 data 받아오기
        interest.clear()
        interest.add(Interest(R.drawable.img_sample, "test1"))
        interest.add(Interest(R.drawable.img_sample, "test2"))
        interest.add(Interest(R.drawable.img_sample, "test3"))
        interest.add(Interest(R.drawable.img_sample, "test4"))
        interest.add(Interest(R.drawable.img_sample, "test5"))
        interest.add(Interest(R.drawable.img_sample, "test6"))
        interest.add(Interest(R.drawable.img_sample, "test7"))
        interest.add(Interest(R.drawable.img_sample, "test8"))
        interest.add(Interest(R.drawable.img_sample, "test9"))
        interest.add(Interest(R.drawable.img_sample, "test10"))

    }
}