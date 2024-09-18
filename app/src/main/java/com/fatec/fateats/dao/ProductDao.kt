package com.fatec.fateats.dao

import androidx.compose.runtime.mutableStateListOf
import com.fatec.fateats.model.Product

class ProductDao {

    companion object {
        private val products = mutableStateListOf<Product>()
    }

    fun products() = products.toList()

    fun save(product: Product) {
        products.add(product)
    }

}