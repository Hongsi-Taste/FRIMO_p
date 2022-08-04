package com.gachon.frimo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gachon.frimo.R

class FriendCandidateAdapter(private val dataSet: Array<String>) : RecyclerView.Adapter<FriendCandidateAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imageview_userProfile: ImageView
        val edittext_userName: TextView
        val edittext_userDesc: TextView

        init {

            // Define click listener for the ViewHolder's View.
            imageview_userProfile = view.findViewById(R.id.imageview_userProfile)
            edittext_userName = view.findViewById(R.id.edittext_userName)
            edittext_userDesc = view.findViewById(R.id.edittext_userDesc)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.friend_candidate_view, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.imageview_userProfile = dataSet[position]. ??
        viewHolder.edittext_userName = dataSet[position]. ??
        viewHolder.edittext_userDesc = dataSet[position]. ??
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}
