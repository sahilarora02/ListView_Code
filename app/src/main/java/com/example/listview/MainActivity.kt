package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lisView = findViewById<ListView>(R.id.ListView)

        val taskList = arrayListOf<String>()
        taskList.add("Complete TicTacToe Project")
        taskList.add("DO DSA Question")
        taskList.add("Do placement Series Questions")
        taskList.add("Complete ListView")
        taskList.add("Pay attention to diet")

        val adapterForMyListView = ArrayAdapter(this , android.R.layout.simple_list_item_1,taskList)
        lisView.adapter = adapterForMyListView
    }
}