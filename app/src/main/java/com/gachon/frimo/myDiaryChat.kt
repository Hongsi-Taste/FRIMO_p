package com.gachon.frimo

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class myDiary_chat : Fragment() {
    companion object{
        fun newInstance() : myDiary_chat {
            return myDiary_chat()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_my_diary_chat,container,false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.chatRecycler)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        //recyclerView.adapter = RecyclerViewAdaper()
        // Inflate the layout for this fragment
        return view
    }
//inner class RecyclerViewAdaper : RecyclerView.Adapter<RecyclerViewAdaper.CustomViewHolder>
//    private val chatModel = ArrayList<>
//
//}