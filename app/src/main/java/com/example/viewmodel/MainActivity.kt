package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewModel : TestFragmentViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel = ViewModelProvider(this)[TestFragmentViewModel::class.java]

        //observe는 livedata의 value의 값의 변경을 감지하고 호출되는 부분
        viewModel.map.observe(this,Observer{
            binding.result1.text = it.toString()
        })

        viewModel.switchMap.observe(this,Observer{
            binding.result2.text = it.toString()
        })

        binding.plus.setOnClickListener {
            val count = binding.inputArea.text.toString().toInt()
            viewModel.setLiveData(count)
        }





    }
}