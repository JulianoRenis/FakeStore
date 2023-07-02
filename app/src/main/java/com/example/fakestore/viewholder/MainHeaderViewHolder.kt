package com.example.fakestore.viewholder

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fakestore.R
import com.example.fakestore.adapter.ProdutoAdapter
import com.example.fakestore.databinding.MainHeaderBinding
import com.example.fakestore.model.Produto


class MainHeaderViewHolder(var binding: MainHeaderBinding) : RecyclerView.ViewHolder(binding.root) {
    private val listProdutos : MutableList<Produto> =  mutableListOf()
    fun bind() {
        var adapterProdutos = ProdutoAdapter()
        carregarProduto()
        //binding.textView3.text = "teste"
        adapterProdutos.attackProdutos(listProdutos.toList())



        //binding.recyclerviewProdutos.layoutManager = GridLayoutManager(binding.root.context,3,RecyclerView.VERTICAL,false)
        binding.recyclerviewProdutos.layoutManager = LinearLayoutManager(binding.root.context,RecyclerView.HORIZONTAL,false)
        binding.recyclerviewProdutos.setHasFixedSize(true)
        binding.recyclerviewProdutos.adapter = adapterProdutos
    }

    private fun carregarProduto(){
        val arroz = R.drawable.arros
        val feijao = R.drawable.feijao
        val macarrao = R.drawable.macarrao
        val oleo = R.drawable.oleo
        val alho = R.drawable.alho
        val picanha = R.drawable.picanha

        val produtosArroz = Produto("Picanha",10.90F,picanha)
        listProdutos.add(produtosArroz)


        val produtoFeijao = Produto("Feijão",15.56F,feijao)
        listProdutos.add(produtoFeijao)

        val produtoMacarrao = Produto("Macarrão",15.56F,macarrao)
        listProdutos.add(produtoMacarrao)

        val produtoOleo = Produto("Feijão",15.56F,oleo)
        listProdutos.add(produtoOleo)

        val produtoAlho = Produto("Alho",15.56F,alho)
        listProdutos.add(produtoAlho)

        val produtoPicanha = Produto("Picanha",15.56F,picanha)
        listProdutos.add(produtoPicanha)



    }
}