package com.example.fakestore.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.fakestore.databinding.MainHeaderBinding


class MainHeaderViewHolder(var binding: MainHeaderBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind() {
        binding.textView3.text = "teste"
    }


}