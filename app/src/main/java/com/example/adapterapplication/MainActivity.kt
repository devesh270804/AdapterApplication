package com.example.adapterapplication

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var listView:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    listView=findViewById(R.id.listView)

    val fruits= listOf("Mangoes","Bananas","PineApples", "Grapes","Peaches","Guavas","Berries")


        val customAdapter=MyAdapter(this,fruits)
        listView.adapter=customAdapter
    }
}