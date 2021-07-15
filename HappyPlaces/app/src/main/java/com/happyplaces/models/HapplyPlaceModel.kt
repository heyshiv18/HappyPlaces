package com.happyplaces.models

data class HapplyPlaceModel (
    val id: Int,
    val title: String,
    val image: String,
    val description: String,
    val data: String,
    val location: String,
    val latitude: Double,
    val longitude: Double
    )