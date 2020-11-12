package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.`class`.Prato
import com.example.myapplication.`class`.Restaurant
import kotlinx.android.synthetic.main.activity_descricao_prato.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.image_arrowback.*
import kotlinx.android.synthetic.main.image_arrowback.view.*

class descricaoPrato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descricao_prato)
        setSupportActionBar(ivToolbarPrato.toolbar)

        var prato = intent.getSerializableExtra("prato") as Prato

        ivToolbarPrato.tvName.text = prato.nome
        ivToolbarPrato.ivToolbar.setImageResource(prato.img)
        tvDescricao.text = prato.desc

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}