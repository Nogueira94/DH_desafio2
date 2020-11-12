package com.example.myapplication.`class`

import android.os.Bundle
import java.io.Serializable

class Restaurant(val nome: String, val end: String, val hora: String, val img: Int, var listaPratos : ArrayList<Prato>) : Serializable
