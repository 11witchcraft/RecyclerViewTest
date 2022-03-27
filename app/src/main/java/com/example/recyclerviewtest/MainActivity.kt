package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFruits()
        val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        val adapter = FruitAdapter(fruitList)
        recyclerView.adapter = adapter
    }

    private fun initFruits() {
        repeat(3) {
            fruitList.add(Fruit(("Apple"), R.drawable.apple_pic))
            fruitList.add(Fruit(("Banana"), R.drawable.banana_pic))
            fruitList.add(Fruit(("Orange"), R.drawable.orange_pic))
            fruitList.add(Fruit(("Watermelon"), R.drawable.watermelon_pic))
            fruitList.add(Fruit(("Pear"), R.drawable.pear_pic))
            fruitList.add(Fruit(("Grape"), R.drawable.grape_pic))
            fruitList.add(Fruit(("Pineapple"), R.drawable.pineapple_pic))
            fruitList.add(Fruit(("Strawberry"), R.drawable.strawberry_pic))
            fruitList.add(Fruit(("Cherry"), R.drawable.cherry_pic))
            fruitList.add(Fruit(("Mango"), R.drawable.mango_pic))
        }
    }
}
