package com.gachon.frimo

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.gachon.frimo.adapter.ContentAdapter
import com.gachon.frimo.adapter.FollowAdapter
import com.gachon.frimo.adapter.InterestAdapter
import com.gachon.frimo.databinding.FriendlyCommunityBinding
import com.gachon.frimo.entity.Content
import com.gachon.frimo.entity.Interest
import com.gachon.frimo.entity.UserProfile
import com.skydoves.powermenu.MenuAnimation
import com.skydoves.powermenu.OnMenuItemClickListener
import com.skydoves.powermenu.PowerMenu
import com.skydoves.powermenu.PowerMenuItem

class FriendlyCommunity : AppCompatActivity() {

    private lateinit var menu: PowerMenu
    private lateinit var binding: FriendlyCommunityBinding
    private val interest: ArrayList<Interest> = ArrayList() // Interests
    private val content: ArrayList<Content> = ArrayList() // Contents
    private val follow: ArrayList<UserProfile> = ArrayList() // follower, following

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = FriendlyCommunityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 기존 action bar 제거 후 custom action bar 넣기
        supportActionBar!!.hide()

        with(binding) {

            labelInterests.setOnClickListener {

                prepareInterestData() // RecyclerView에 보여 줄 data 받아오기
                interests.setText(interest.size.toString())
                recyclerView.adapter = InterestAdapter(interest)
                recyclerView.layoutManager = GridLayoutManager(it.context, 2)
            }

            labelContents.setOnClickListener {

                prepareContentData()
                contents.setText(content.size.toString())
                recyclerView.adapter = ContentAdapter(content)
                recyclerView.layoutManager = LinearLayoutManager(it.context)
            }

            labelFollowers.setOnClickListener {

                prepareFollowerData()
                followers.setText(follow.size.toString())
                recyclerView.adapter = FollowAdapter(follow)
                recyclerView.layoutManager = LinearLayoutManager(it.context)
            }

            labelFollowing.setOnClickListener {

                prepareFollowingData()
                following.setText(follow.size.toString())
                recyclerView.adapter = FollowAdapter(follow)
                recyclerView.layoutManager = LinearLayoutManager(it.context)
            }

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

        // menu icon
        val icon = findViewById<ImageView>(R.id.ic_menu)
        icon.setImageResource(R.drawable.ic_list)

        // menu icon click listener
        icon.setOnClickListener {
            menu.showAsDropDown(it)
        }

    }

    // change menu item click listener
    private val changeMenuItemClickListener =
        OnMenuItemClickListener<PowerMenuItem> { position, item ->
            Toast.makeText(baseContext, item.title, Toast.LENGTH_SHORT).show()

            lateinit var intent: Intent
            when (position) {
                0 -> intent = Intent(this, ModifyProfile::class.java)
                1 -> intent = Intent(this, FriendCandidate::class.java)
                2 -> intent = Intent(this, AddContents::class.java)
            }
            startActivity(intent)
        }

    private fun prepareInterestData() {

        // Todo: 서버에서 interest data 받아오기
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

    private fun prepareContentData() {

        // Todo: 서버에서 content data 받아오기
        content.clear()
        content.add(Content(R.drawable.img_sample, "test1", "test1 description"))
        content.add(Content(R.drawable.img_sample, "test2", "test2 description"))
        content.add(Content(R.drawable.img_sample, "test3", "test3 description"))
        content.add(Content(R.drawable.img_sample, "test4", "test4 description"))
        content.add(Content(R.drawable.img_sample, "test5", "test5 description"))
        content.add(Content(R.drawable.img_sample, "test6", "test6 description"))
        content.add(Content(R.drawable.img_sample, "test7", "test7 description"))
        content.add(Content(R.drawable.img_sample, "test8", "test8 description"))

    }

    private fun prepareFollowerData() {

        // Todo: 서버에서 follower data 받아오기
        follow.clear()
        follow.add(UserProfile(R.drawable.ic_user, "test1", "test1 description"))
        follow.add(UserProfile(R.drawable.ic_user, "test2", "test2 description"))
        follow.add(UserProfile(R.drawable.ic_user, "test3", "test3 description"))
        follow.add(UserProfile(R.drawable.ic_user, "test4", "test4 description"))
        follow.add(UserProfile(R.drawable.ic_user, "test5", "test5 description"))
        follow.add(UserProfile(R.drawable.ic_user, "test6", "test6 description"))
        follow.add(UserProfile(R.drawable.ic_user, "test7", "test7 description"))
        follow.add(UserProfile(R.drawable.ic_user, "test8", "test8 description"))
        follow.add(UserProfile(R.drawable.ic_user, "test9", "test9 description"))
        follow.add(UserProfile(R.drawable.ic_user, "test10", "test10 description"))

    }

    private fun prepareFollowingData() {

        // Todo: 서버에서 following data 받아오기
        follow.clear()
        follow.add(UserProfile(R.drawable.img_sample, "test1", "test1 description"))
        follow.add(UserProfile(R.drawable.img_sample, "test2", "test2 description"))
        follow.add(UserProfile(R.drawable.img_sample, "test3", "test3 description"))
        follow.add(UserProfile(R.drawable.img_sample, "test4", "test4 description"))
        follow.add(UserProfile(R.drawable.img_sample, "test5", "test5 description"))
        follow.add(UserProfile(R.drawable.img_sample, "test6", "test6 description"))
        follow.add(UserProfile(R.drawable.img_sample, "test7", "test7 description"))
        follow.add(UserProfile(R.drawable.img_sample, "test8", "test8 description"))
        follow.add(UserProfile(R.drawable.img_sample, "test9", "test9 description"))
        follow.add(UserProfile(R.drawable.img_sample, "test10", "test10 description"))
        follow.add(UserProfile(R.drawable.img_sample, "test11", "test11 description"))
        follow.add(UserProfile(R.drawable.img_sample, "test12", "test12 description"))
        follow.add(UserProfile(R.drawable.img_sample, "test13", "test13 description"))
        follow.add(UserProfile(R.drawable.img_sample, "test14", "test14 description"))
    }

}