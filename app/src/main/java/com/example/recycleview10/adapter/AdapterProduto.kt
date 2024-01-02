package com.example.recycleview10.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview10.R
import com.example.recycleview10.model.Produto

class AdapterProduto(private val context: Context, private val produtos: MutableList<Produto>) :
    RecyclerView.Adapter<AdapterProduto.
    ProdutoViewHolder>() {

    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sessao = itemView.findViewById<TextView>(R.id.sessaoDeProdutosId)
        val foto = itemView.findViewById<ImageView>(R.id.fotoProdutoId)
        val nome = itemView.findViewById<TextView>(R.id.nomeProdutoId)
        val descricao = itemView.findViewById<TextView>(R.id.descricaoProdutoId)
        val preco = itemView.findViewById<TextView>(R.id.precoProdutoId)
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
        holder.sessao.setText(produtos[position].sessao)
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.setText(produtos[position].nome)
        holder.descricao.setText(produtos[position].descricao)
        holder.preco.setText(produtos[position].preco)
    }

    override fun getItemCount(): Int {
        return produtos.size
    }
}
