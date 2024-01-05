package com.example.recycleview10.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview10.R
import com.example.recycleview10.adapter.AdapterProduto
import com.example.recycleview10.model.ModelProduto

class MainActivity : AppCompatActivity() {

    /* Variáveis de Escopo Global: */
    private lateinit var recyclerView: RecyclerView
    private var listaProduto: MutableList<ModelProduto>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Funções(): */
        declararVariaveis()
        configurarRecyclerView()
        instanciarClasseProdutos()
    }

    private fun declararVariaveis() {
        recyclerView =
            findViewById<RecyclerView>(R.id.recycleView_produtosId)
    }

    private fun configurarRecyclerView() {

        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager =
            LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
            )
    }

    private fun instanciarClasseProdutos() {

        listaProduto = mutableListOf()

        val produtoHd = ModelProduto(

            data = "17/06/1987",
            foto = R.drawable.hd,
            nome = "Hd SanDisk Plus 480GB",
            descricao = "Confiável, rápido e muita capacidade. " +
                    "A SanDisk, pioneira em tecnologias de armazenamento" +
                    " de estado sólido é a marca de confiança dos profissionais" +
                    " da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.",
            preco = "R$ 450,00"
        )

        val produtoProcessador = ModelProduto(
            data = "25/12/2023",
            foto = R.drawable.processador,
            nome = "Intel Core i5 10400F",
            descricao = "Os novos processadores da 10ª " +
                    "geração oferecem atualizações de desempenho " +
                    "incríveis para melhorar a produtividade e proporcionar entretenimento " +
                    "surpreendente.",
            preco = "R$ 550,00"
        )

        val produtoMemoriaRam = ModelProduto(
            data = "17/06/1987",
            foto = R.drawable.memoria,
            nome = "Memória Ram Corsair  8GB DDR4 ",
            descricao = "Memória Corsair Vengeance LPX, 8GB, 2666MHz, DDR4, C16, Preto.",
            preco = "R$ 369,00"
        )

        val produtoPlacaDeVideo = ModelProduto(
            data = "25/12/2023",
            foto = R.drawable.placadevideo,
            nome = "GeForce RTX 3090 24GB",
            descricao = "Os blocos de construção para a GPU " +
                    "mais rápida e eficiente do mundo, o novo Ampere " +
                    "SM traz 2X a taxa de transferência do FP32 e maior eficiência de energia.",
            preco = "18.499,00"
        )

        val produtoTeclado = ModelProduto(
            data = "17/06/1987",
            foto = R.drawable.teclado,
            nome = "Teclado Mecânico Gamer T-Dagger Corvette",
            descricao = "Teclado Mecânico Gamer T-Dagger " +
                    "Corvette, LED Rainbow, Switch Outemu DIY Blue, ABNT2 - T-TGK302 -BL (PT-BLUE).",
            preco = "229,00"
        )

        val produtoGabinete = ModelProduto(

            data = "25/12/2023",
            foto = R.drawable.gabinete,
            nome = "Gabinete Gamer",
            descricao = "A série Carbide SPEC-DELTA RGB é uma " +
                    "caixa ATX de torre média de vidro temperado com " +
                    "estilo angular impressionante, fluxo de ar potente e três " +
                    "ventiladores de refrigeração RGB incluídos.",
            preco = "799,00"
        )

        listaProduto!!.add(produtoHd)
        listaProduto!!.add(produtoProcessador)
        listaProduto!!.add(produtoMemoriaRam)
        listaProduto!!.add(produtoPlacaDeVideo)
        listaProduto!!.add(produtoTeclado)
        listaProduto!!.add(produtoGabinete)

        val adapterProduto = AdapterProduto(this, listaProduto!!)
        recyclerView.adapter = adapterProduto
    }
}




