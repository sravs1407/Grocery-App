package com.example.groceryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
        var groceryItems: ArrayList<ItemData> = ArrayList()
        val p1 = ItemData("Fruits", "Fresh Fruits", R.drawable.fruits)
        val p2 = ItemData("Vegetables", "Fresh Vegetables", R.drawable.vegetables)
        val p3 = ItemData("Bakery", "Fresh Bakery Items", R.drawable.bakery)
        val p4 = ItemData("Beverage", "Fresh Items", R.drawable.beverage)
        val p5=ItemData("Milk","Fresh milk",R.drawable.milk)
        groceryItems.add(p1)
        groceryItems.add(p2)
        groceryItems.add(p3)
        groceryItems.add(p4)
        groceryItems.add(p5)
        val myAdapter = MyCustomAdapter(groceryItems)
        recyclerView.adapter = myAdapter
    }
}
