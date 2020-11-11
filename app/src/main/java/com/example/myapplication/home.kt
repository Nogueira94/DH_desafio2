package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.`class`.Restaurant
import com.example.myapplication.`class`.RestaurantAdapter
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class home : AppCompatActivity(), RestaurantAdapter.onClickRestaurantListener {

    var listRestaurant = getRestaurant()
    var adapter = RestaurantAdapter(listRestaurant, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val email = intent.extras?.getString("email")

        Toast.makeText(this, "Bem vindo ${email}", Toast.LENGTH_SHORT).show()

        rvRestaurant.adapter = adapter
        rvRestaurant.layoutManager = LinearLayoutManager(this)
        rvRestaurant.setHasFixedSize(true)

    }

    fun getRestaurant() : ArrayList<Restaurant> {
        val restaurant1 = Restaurant("Tony Roma's","Av. Lavandisca, 717 - Indianópolis, São Paulo","Fecha às 22:00",R.drawable.image1)
        val restaurant2 = Restaurant("Aoyama - Moema","Alameda dos Arapanés, 532 - Moema","Fecha às 00:00",R.drawable.image4)
        val restaurant3 = Restaurant("Outback - Moema","Av. Moaci, 187, 187 - Moema, São Paulo","Fecha às 22:00",R.drawable.image5)
        val restaurant4 = Restaurant("Sí Señor!","Alameda Jauaperi, 626 - Moema","Fecha às 01:00",R.drawable.image3)
        return arrayListOf<Restaurant>(restaurant1, restaurant2,restaurant3,restaurant4)
    }

    override fun onClickRestaurant(position: Int) {
        var intent = Intent(this,restaurante::class.java)
        startActivity(intent)
    }

}