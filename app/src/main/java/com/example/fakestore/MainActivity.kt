package com.example.fakestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fakestore.adapter.ProdutoAdapter
import com.example.fakestore.databinding.ActivityMainBinding
import com.example.fakestore.model.Produto
import com.example.fakestore.viewholder.ProdutoViewHolder

class MainActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMainBinding
    private lateinit var adapterProdutos: ProdutoAdapter
    private val listProdutos : MutableList<Produto> =  mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewProduto = binding.idRv
        recyclerViewProduto.layoutManager = LinearLayoutManager(this)
        recyclerViewProduto.setHasFixedSize(true)
        adapterProdutos = ProdutoAdapter()
        adapterProdutos.attackProdutos(listProdutos.toList())

        recyclerViewProduto.adapter = adapterProdutos


    }


    private fun carregarProduto(){
        val arroz = R.drawable.arros
        val feijao = R.drawable.feijao
        val macarrao = R.drawable.macarrao
        val oleo = R.drawable.oleo
        val alho = R.drawable.alho
        val picanha = R.drawable.picanha

        val produtosArroz = Produto("Arroz",10.90F,arroz)
        listProdutos.add(produtosArroz)


        val produtoFeijao = Produto("Feijão",15.56F,feijao)
        listProdutos.add(produtoFeijao)

        val produtoMacarrao = Produto("Macarrão",15.56F,macarrao)
        listProdutos.add(produtoMacarrao)

        val produtoOleo = Produto("Feijão",15.56F,oleo)
        listProdutos.add(produtoOleo)

        val produtoAlho = Produto("Alho",15.56F,alho)
        listProdutos.add(produtoAlho)

        val produtoPicanha = Produto("Picanha",15.56F,alho)
        listProdutos.add(produtoPicanha)



    }
}