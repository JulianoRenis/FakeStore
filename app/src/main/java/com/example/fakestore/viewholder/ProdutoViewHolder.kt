package com.example.fakestore.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.fakestore.databinding.ItemProdutoBinding
import com.example.fakestore.model.Produto

class ProdutoViewHolder(var binding: ItemProdutoBinding) : RecyclerView.ViewHolder(binding.root) {


    fun bind(produto: Produto){
        binding.imgProduto.setImageResource(produto.imagem)
        binding.txtNomeProduto.setText(produto.titulo)
        binding.txtPreco.setText("R$ ${produto.preco}")
    }
}