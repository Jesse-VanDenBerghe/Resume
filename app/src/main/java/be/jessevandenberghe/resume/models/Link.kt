package be.jessevandenberghe.resume.models

import androidx.annotation.DrawableRes

data class Link(
    @DrawableRes val icon: Int,
    val name: String,
    val link: String
)