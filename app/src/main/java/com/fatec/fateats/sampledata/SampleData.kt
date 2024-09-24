package com.fatec.fateats.sampledata

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.fatec.fateats.extensions.toBrazilianCurrency
import com.fatec.fateats.model.Product
import java.math.BigDecimal

val sampleCandies = listOf(
    Product(
        name = "Chocolate",
        price = BigDecimal("3.99"),
        image = "https://http2.mlstatic.com/D_NQ_NP_771677-MLB48202716450_112021-O.webp",
    ),
    Product(
        name = "Sorvete",
        price = BigDecimal("5.99"),
        image = "https://http2.mlstatic.com/D_NQ_NP_654691-MLB45800601029_052021-O.webp",
        description = LoremIpsum(5).values.first()
    ),
    Product(
        name = "Bolo",
        price = BigDecimal("11.99"),
        image = "https://http2.mlstatic.com/D_NQ_NP_624225-MLU74829559554_032024-O.webp",
    )
)

val sampleDrinks = listOf(
    Product(
        name = "Cerveja",
        price = BigDecimal("5.99"),
        image = "https://http2.mlstatic.com/D_NQ_NP_947480-MLU72636575455_112023-O.webp",
        description = LoremIpsum(20).values.first()
    ),
    Product(
        name = "Refrigerante",
        price = BigDecimal("4.99"),
        image = "https://http2.mlstatic.com/D_NQ_NP_671591-MLU73748023800_012024-O.webp"
    ),
    Product(
        name = "Suco",
        price = BigDecimal("7.99"),
        image = "https://http2.mlstatic.com/D_NQ_NP_623356-MLU75436777046_042024-O.webp",
        description = LoremIpsum(100).values.first()
    ),
    Product(
        name = "Água",
        price = BigDecimal("2.99"),
        image = "https://http2.mlstatic.com/D_NQ_NP_823635-MLU75419899482_042024-O.webp"
    )
)

val sampleProducts: List<Product> = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal("12.99"),
        image = "https://t2.gstatic.com/licensed-image?q=tbn:ANd9GcRRto3IlY56MlAIOAvXHvPEVxBDVzG1uz1zULEBYdJ-I4Aa-xOyPEVvv7fmIjLnxaOz",
        description = LoremIpsum(20).values.first()
    ),
    Product(
        name = "Pizza",
        price = BigDecimal("19.99"),
        image = "https://blog.ceraflame.com.br/wp-content/uploads/2021/06/Pizza-Napolitana-CERAFLAME.jpg"
    ),
    Product(
        name = "Batata frita",
        price = BigDecimal("7.99"),
        image = "https://t0.gstatic.com/licensed-image?q=tbn:ANd9GcT1rwHV76cR1gwVhjIq9JlfkbZEy6wBK-lg7NhUa__l8L4Klm40-tkX8lpiBWMUDTx0",
        description = LoremIpsum(50).values.first()
    ), *sampleDrinks.toTypedArray(), *sampleCandies.toTypedArray()
)

val sampleSections = mapOf(
    "Promoções" to sampleProducts,
    "Doces" to sampleCandies,
    "Bebidas" to sampleDrinks
)