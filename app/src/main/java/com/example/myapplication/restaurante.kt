package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.`class`.Prato
import com.example.myapplication.`class`.PratoAdapter
import com.example.myapplication.`class`.Restaurant
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_restaurante.*
import kotlinx.android.synthetic.main.image_arrowback.*
import kotlinx.android.synthetic.main.image_arrowback.view.*


class restaurante : AppCompatActivity(), PratoAdapter.OnClickPratoListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurante)
        setSupportActionBar(ivToolbarRest.toolbar)

        var listPrato = intent.getSerializableExtra("rest") as Restaurant
        var adapter = PratoAdapter(listPrato.listaPratos, this,this)

        rvPratos.adapter = adapter
        rvPratos.layoutManager = GridLayoutManager(this,2)
        rvPratos.setHasFixedSize(true)

        ivToolbarRest.ivToolbar.setImageResource(listPrato.img)
        ivToolbarRest.tvName.text = listPrato.nome
    }

    override fun onClickPrato(position: Int) {
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

//    fun getAllRestaurantPrato(rest : Restaurant) : ArrayList<Prato>{
//        val restaurant1 = Restaurant("Tony Roma's","Av. Lavandisca, 717 - Indianópolis, São Paulo","Fecha às 22:00",R.drawable.image1)
//        var prato1 = Prato("Salada com molho Gengibre - REST1","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.")
//        var prato2 = Prato("Salada com molho Gengibre - REST1","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.")
//        var prato3 = Prato("Salada com molho Gengibre - REST1","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.")
//        var prato4 = Prato("Salada com molho Gengibre - REST1","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.")
//        var prato5 = Prato("Salada com molho Gengibre - REST1","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.")
//
//        val restaurant2 = Restaurant("Aoyama - Moema","Alameda dos Arapanés, 532 - Moema","Fecha às 00:00",R.drawable.image4)
//        var prato7 = Prato("Salada com molho Gengibre - REST2","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",restaurant2)
//        var prato8 = Prato("Salada com molho Gengibre - REST2","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",restaurant2)
//        var prato9 = Prato("Salada com molho Gengibre - REST2","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",restaurant2)
//        var prato10 = Prato("Salada com molho Gengibre - REST2","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",restaurant2)
//        var prato11 = Prato("Salada com molho Gengibre - REST2","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",restaurant2)
//
//        val restaurant3 = Restaurant("Outback - Moema","Av. Moaci, 187, 187 - Moema, São Paulo","Fecha às 22:00",R.drawable.image5)
//        var prato12 = Prato("Salada com molho Gengibre - REST3","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",restaurant3)
//        var prato13 = Prato("Salada com molho Gengibre - REST3","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",restaurant3)
//        var prato14 = Prato("Salada com molho Gengibre - REST3","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",restaurant3)
//        var prato15 = Prato("Salada com molho Gengibre - REST3","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",restaurant3)
//        var prato16 = Prato("Salada com molho Gengibre - REST3","Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",restaurant3)
//
//        var listPratos = arrayListOf<Prato>(prato1,prato2,prato3,prato4,prato5,prato7,prato8,prato9,prato10,prato11,prato12,prato13,prato14,prato15,prato16)
//        var listFinal = ArrayList<Prato>()
//
//        for (i in listPratos ){
//            if (i.rest == rest){
//                listFinal.add(i)
//            }
//        }
//
//        return listFinal
//    }

}