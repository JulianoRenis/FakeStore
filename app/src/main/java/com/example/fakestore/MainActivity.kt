package com.example.fakestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fakestore.adapter.ProdutoAdapter
import com.example.fakestore.databinding.ActivityMainBinding
import com.example.fakestore.viewholder.ProdutoViewHolder

class MainActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMainBinding
    private lateinit var adapterProdutos: ProdutoAdapter
    private val listProdutos : MutableList<ProdutoViewHolder> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewProduto = binding.idRv
        recyclerViewProduto.layoutManager = LinearLayoutManager(this)
        recyclerViewProduto.setHasFixedSize(true)
        adapterProdutos = ProdutoAdapter()
        adapterProdutos.attackProdutos(listProdutos)

        recyclerViewProduto.adapter = adapterProdutos





    }
}