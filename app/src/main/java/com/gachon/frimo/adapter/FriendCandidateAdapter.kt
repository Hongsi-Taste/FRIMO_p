package com.gachon.frimo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gachon.frimo.R
import com.gachon.frimo.entity.UserProfile

class FriendCandidateAdapter(private val dataSet: ArrayList<UserProfile>) : RecyclerView.Adapter<FriendCandidateAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imageview_userProfile: ImageView
        val textview_userName: TextView
        val textview_userDesc: TextView

        init {

            // Define click listener for the ViewHolder's View.
            imageview_userProfile = view.findViewById(R.id.imageview_userProfile)
            textview_userName = view.findViewById(R.id.textview_userName)
            textview_userDesc = view.findViewById(R.id.textview_userDesc)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.friend_candidate_view, viewGroup, false)
        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        viewHolder.imageview_userProfile.setImageResource(dataSet[position].profileImage)
        viewHolder.textview_userName.text = dataSet[position].name
        viewHolder.textview_userDesc.text = dataSet[position].desc
    }

    override fun getItemCount() = dataSet.size

}
