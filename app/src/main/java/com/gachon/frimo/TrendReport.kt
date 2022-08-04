package com.gachon.frimo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.gachon.frimo.entity.Report
import com.gachon.frimo.adapter.TrendReportAdapter

class TrendReport : AppCompatActivity(){

    private val reports: ArrayList<Report> = ArrayList() // Report

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.trend_report)

        // RecyclerView에 보여 줄 Report 받아오기
        prepareData();

        // RecyclerView 셋팅
        val recyclerView: RecyclerView = findViewById(R.id.TrendReportRecyclerView)
        recyclerView.adapter = TrendReportAdapter(reports)

    }

    private fun prepareData() {

        // Todo: 서버랑 연결해 User data 받아오기
        reports.add(Report(R.drawable.img_sample, "test1"))
        reports.add(Report(R.drawable.img_sample, "test2"))
        reports.add(Report(R.drawable.img_sample, "test3"))
        reports.add(Report(R.drawable.img_sample, "test4"))
        reports.add(Report(R.drawable.img_sample, "test5"))

    }
}