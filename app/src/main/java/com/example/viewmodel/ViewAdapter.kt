package com.example.viewmodel

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.viewmodel.databinding.StringItemBinding

class ViewAdapter(private val dataSet : ArrayList<String>) : RecyclerView.Adapter<ViewAdapter.ViewHolder>() {

    class ViewHolder(binding : StringItemBinding) : RecyclerView.ViewHolder(binding.root){
        val myText : TextView = binding.text
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewAdapter.ViewHolder {
        val view = DataBindingUtil.inflate<StringItemBinding>(LayoutInflater.from(parent.context),R.layout.string_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewAdapter.ViewHolder, position: Int) {
        holder.myText.text = dataSet[position]
    }

    override fun getItemCount(): Int {
       return dataSet.size
    }
}