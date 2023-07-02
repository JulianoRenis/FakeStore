package com.example.fakestore.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fakestore.databinding.ItemProdutoBinding
import com.example.fakestore.model.Produto
import com.example.fakestore.viewholder.ProdutoViewHolder

class ProdutoAdapter : RecyclerView.Adapter<ProdutoViewHolder>() {

    private var produtos : List<Produto> = emptyList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        var inflat = LayoutInflater.from(parent.context)
        var binding =  ItemProdutoBinding.inflate(inflat,parent,false)
        return  ProdutoViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return produtos.size
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.bind(produtos.get(position))
    }

    fun attackProdutos(produtos : List<Produto>){
        this.produtos = produtos
        notifyDataSetChanged()
    }

}