package com.example.recycleview10.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview10.R
import com.example.recycleview10.model.ModelProduto

class AdapterProduto(
    private val context: Context,
    private val produtosModelProdutos: MutableList<ModelProduto>
) :
    RecyclerView.Adapter<AdapterProduto.
    ProdutoViewHolder>() {

    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewData = itemView.findViewById<TextView>(R.id.sessaoDeProdutosId)
        val imageViewFoto = itemView.findViewById<ImageView>(R.id.fotoProdutoId)
        val textViewNome = itemView.findViewById<TextView>(R.id.nomeProdutoId)
        val textViewDescricao = itemView.findViewById<TextView>(R.id.descricaoProdutoId)
        val textViewPreco = itemView.findViewById<TextView>(R.id.precoProdutoId)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(
            R.layout.hardware_item,
            parent, false
        )

        val holder = ProdutoViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {

        val produtoPosition = produtosModelProdutos[position]
        holder.textViewData.text = produtoPosition.data
        holder.imageViewFoto.setImageResource(produtoPosition.foto)
        holder.textViewNome.text = produtoPosition.nome
        holder.textViewDescricao.text = produtoPosition.descricao
        holder.textViewPreco.text = produtoPosition.preco
    }

    override fun getItemCount(): Int {
        return produtosModelProdutos.size
    }
}




