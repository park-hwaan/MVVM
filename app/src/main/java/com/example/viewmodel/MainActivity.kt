package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val array = arrayListOf<String>()

        array.add("a")
        array.add("b")
        array.add("c")

        val viewAdapter = ViewAdapter(array)

        val rv = binding.recy
        rv.adapter = viewAdapter
        rv.layoutManager = LinearLayoutManager(this)


    }
}