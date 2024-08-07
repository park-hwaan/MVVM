package com.example.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.FragmentTestBinding

class TestFragment : Fragment() {

    private lateinit var viewModel : TestFragmentViewModel
    private lateinit var binding : FragmentTestBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_test,container,false)

        viewModel = ViewModelProvider(this).get(TestFragmentViewModel::class.java)

        binding.result.text = viewModel.countValue.toString()

        binding.plus.setOnClickListener{
            viewModel.plus()
            binding.result.text = viewModel.countValue.toString()
        }

        binding.minus.setOnClickListener {
            viewModel.minus()
            binding.result.text = viewModel.countValue.toString()
        }



        return binding.root
    }

}