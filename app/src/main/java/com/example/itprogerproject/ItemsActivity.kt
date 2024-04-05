package com.example.itprogerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList :RecyclerView = findViewById(R.id.itemsList);
        val items = arrayListOf<Item>()

        items.add(Item(1,"iphone","IPhone 15","New IPhone from Apple","",107990))
        items.add(Item(2,"samsung","Samsung S24","New SmartPhone from Samsung","",97990))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items,this)
    }
}