package com.example.fakestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fakestore.adapter.MainHeaderAdapter
import com.example.fakestore.adapter.ProdutoAdapter
import com.example.fakestore.databinding.ActivityMainBinding
import com.example.fakestore.model.Produto
import com.example.fakestore.viewholder.ProdutoViewHolder
import java.util.Arrays

class MainActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMainBinding
    private var adapter = MainHeaderAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val recyclerView = binding.idRv
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        adapter.attackItens(Arrays.asList(""))

        recyclerView.adapter = adapter


    }



}