package com.example.by_dabiz_munoz

var plateList = mutableListOf<Plate>()
val PLATE_ID_EXTRA = "plateExtra"
class Plate(
    var title:String,
    var imageId: Int,
    var description: String,
    var restaurant: String,
    val id: Int? = plateList.size)

