package com.example.fakestore.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fakestore.R
import com.example.fakestore.databinding.ItemProdutoBinding
import com.example.fakestore.databinding.MainHeaderBinding
import com.example.fakestore.model.Produto
import com.example.fakestore.viewholder.MainHeaderViewHolder
import com.example.fakestore.viewholder.ProdutoViewHolder

class MainHeaderAdapter : RecyclerView.Adapter<MainHeaderViewHolder>() {

    private var itens : List<String> = emptyList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHeaderViewHolder {

                var inflat = LayoutInflater.from(parent.context)
                var binding =  MainHeaderBinding.inflate(inflat,parent,false)

               return MainHeaderViewHolder(binding)

        }

    override fun getItemCount(): Int {
        return itens.size
    }

    override fun onBindViewHolder(holder: MainHeaderViewHolder, position: Int) {
       holder.bind()
    }


    fun attackItens(itens : List<String>){
        this.itens = itens
        notifyDataSetChanged()
    }




}