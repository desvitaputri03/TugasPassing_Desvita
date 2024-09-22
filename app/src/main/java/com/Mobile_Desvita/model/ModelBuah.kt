package com.Mobile_Desvita.model

import com.tugasmobileyuni.R


data class ModelBuah(
    val image: Int,
    val judul: String
)

object Mocklist {
    fun getModel(): List<ModelBuah> {
        val item1 = ModelBuah(
            R.drawable.apple,
            "Apel" // Perbaiki typo
        )
        val item2 = ModelBuah(
            R.drawable.grapes,
            "Anggur"
        )
        val item3 = ModelBuah(
            R.drawable.apple,
            "Apel" // Perbaiki typo
        )
        val item4 = ModelBuah(
            R.drawable.pear,
            "Pir" // Perbaiki typo
        )
        val item5 = ModelBuah(
            R.drawable.lucy,
            "Luci" // Perbaiki typo
        )
        val item6 = ModelBuah(
            R.drawable.strawberry,
            "Strawberry" // Perbaiki typo
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)
        return itemList
    }
}
