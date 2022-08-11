package com.gachon.frimo.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.gachon.frimo.FriendlyCommunity
import com.gachon.frimo.R
import com.gachon.frimo.entity.UserProfile

class FriendCandidateAdapter(private val dataSet: ArrayList<UserProfile>) : RecyclerView.Adapter<FriendCandidateAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imageview_userProfile: ImageView
        val textview_userName: TextView
        val textview_userDesc: TextView
        val button_add: Button

        init {

            // Define click listener for the ViewHolder's View.
            // Todo: user click시 친구 Friendly Community 화면으로 이동
            // Todo: add button click listener
            imageview_userProfile = view.findViewById(R.id.imageview_userProfile)
            textview_userName = view.findViewById(R.id.textview_userName)
            textview_userDesc = view.findViewById(R.id.textview_userDesc)
            button_add = view.findViewById(R.id.button_add)

        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.friend_candidate_view, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.imageview_userProfile.setImageResource(dataSet[position].profileImage)
        viewHolder.textview_userName.text = dataSet[position].name
        viewHolder.textview_userDesc.text = dataSet[position].desc
    }

    override fun getItemCount() = dataSet.size

}
