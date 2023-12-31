package com.example.recycleview10.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview10.R
import com.example.recycleview10.model.Produto

/**
 *  1 - HERDA DE model, classe Produto.
 *  2 - PASSO 08: CRIAR A CLASSE AdapterProduto E IMPLEMENTA MEMBROS. *
 *  3 - CRIAR CLASSE ProdutoViewHolder.
 *  • Criar variável que invoque os parâmetros da classe Produtos. Os
 *  parâmetros da classe "Produtos", são herdados de "hardware_item.xml".
 *  Essa variável deve ser do tipo mutável.
 *  • Segue para "MainActivity.kt".
 */
class AdapterProduto(private val context: Context, private val produtos: MutableList<Produto>) :
    RecyclerView.Adapter<AdapterProduto.
    ProdutoViewHolder>() {


    /**
     * 1 - Passo 09:
     * 1 - A classe inner class ProdutoViewHolder importar os id's e views
     * do arquivo xml "hardware_item.xml".
     */
    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sessao = itemView.findViewById<TextView>(R.id.sessaoDeProdutosId)
        val foto = itemView.findViewById<ImageView>(R.id.fotoProdutoId)
        val nome = itemView.findViewById<TextView>(R.id.nomeProdutoId)
        val descricao = itemView.findViewById<TextView>(R.id.descricaoProdutoId)
        val preco = itemView.findViewById<TextView>(R.id.precoProdutoId)
    }

    /**
     * • Passo 10: Criar a "context" em AdapterProduto.
     * • A variável itemLista herda o parâmetro "context" do construtor da
     * • onCreateViewHolder é quem cria a visualização em tela.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(
            R.layout.hardware_item,
            parent, false
        )

        val holder = ProdutoViewHolder(itemLista)
        return holder
    }

    /**
     * Passo 11:
     * • onBindViewHolder é o responsável por criar a visualização do usuário.
     * • Antes de trabalhar com função onBindViewHolde, deve se - invocar as id's das views
     * do layout "hardware_item.xml".
     * • Criar uma lista mutável na classe AdapterProdutos para invocar todos os ítens
     * a serem exibidos.
     */

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.sessao.setText(produtos[position].sessao)
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.setText(produtos[position].nome)
        holder.descricao.setText(produtos[position].descricao)
        holder.preco.setText(produtos[position].preco)
    }

    /**
     * • PASSO 11:
     * • Implementar o ".size".
     * • Segue para "MainActivity.kt".
     */
    override fun getItemCount(): Int = produtos.size

}
