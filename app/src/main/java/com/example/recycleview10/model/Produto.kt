package com.example.recycleview10.model

/**
 * 01 - PASSO 06:
02 - HERDADO DE: hardware_item.xml
03 - data class já contém o get e seter do java.
04 - AS PROPRIEDADES DO drawable, como as fotos, por exemplos,
devem ser tratadas como sendo do tipo Int. Caso essas fotos viessem de um
servidor, seriam tratadas como String.
 05 - SEGUIR PARA O PACOTE Adapter.
 */
data class Produto(

    /**
     * Note:
     * */
    val foto: Int,
    val nome: String,
    val descricao: String,
    val preco: String
) {
}