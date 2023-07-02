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

class ProdutoAdapter : RecyclerView.Adapter<ProdutoViewHolder>() {

    private var produtos : List<Produto> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        var inflat = LayoutInflater.from(parent.context)
        var binding =  ItemProdutoBinding.inflate(inflat,parent,false)
       return ProdutoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.bind(produtos.get(position))
    }


    override fun getItemCount(): Int {
        return produtos.size
    }


    fun attackProdutos(produtos : List<Produto>){
        this.produtos = produtos
        notifyDataSetChanged()
    }





}