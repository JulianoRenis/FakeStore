package com.example.fakestore.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fakestore.databinding.ItemProdutoBinding
import com.example.fakestore.model.Produto
import com.example.fakestore.viewholder.MainHeaderViewHolder
import com.example.fakestore.viewholder.ProdutoViewHolder

class ProdutoAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var produtos : List<Produto> = emptyList()

    companion object {
        private const val VIEW_TYPE_A = 0
        private const val VIEW_TYPE_B = 1
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) {
            VIEW_TYPE_B
        } else {
            VIEW_TYPE_A
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return when (viewType) {
            VIEW_TYPE_B -> {
                var inflat = LayoutInflater.from(parent.context)
                var binding =  ItemProdutoBinding.inflate(inflat,parent,false)
                ProdutoViewHolder(binding)
            }
            else -> {
                var inflat = LayoutInflater.from(parent.context)
                var binding =  ItemProdutoBinding.inflate(inflat,parent,false)
                ProdutoViewHolder(binding)
            }
        }



    }



    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemPosition = position - 1

        if (position == 0) {
           // val viewHolderB = holder as MainHeaderViewHolder
           // viewHolderB.bind()

        } else {
            val item = produtos[itemPosition]

            val viewHolderA = holder as ProdutoViewHolder
            viewHolderA.bind(item)
        }

    }

    override fun getItemCount(): Int {
        return produtos.size + 1
    }

 /*   override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {


        when (holder.itemViewType) {
            VIEW_TYPE_A -> {
                holder.bind(produtos.get(position))
            }
            VIEW_TYPE_B -> {
                val viewHolderB = holder as ViewHolderB
                viewHolderB.bind(item as ItemB)
            }
        }
    }*/

    fun attackProdutos(produtos : List<Produto>){
        this.produtos = produtos
        notifyDataSetChanged()
    }

}