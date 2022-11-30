package com.example.homework_3_7

import java.io.Serializable

data class Character(
    var image: String?="https://s3.amazonaws.com/www-inside-design/uploads/2018/01/rick-morty-sq.jpg",
    var status: String? = "In This Universe",
    var name: String? = "No name"
): Serializable