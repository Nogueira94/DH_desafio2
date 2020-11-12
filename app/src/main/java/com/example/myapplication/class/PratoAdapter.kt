package com.example.myapplication.`class`

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.descricaoPrato

class PratoAdapter (private val listaPrato : ArrayList<Prato>, val listener : OnClickPratoListener, private val context : Context) : RecyclerView.Adapter<PratoAdapter.PratoViewHolder>() {

    interface OnClickPratoListener {
        fun onClickPrato(position: Int)
    }

    inner class PratoViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var cvPratos : CardView = itemView.findViewById(R.id.cvPratos)
        var ivPrato : ImageView = itemView.findViewById(R.id.ivPrato)
        var tvNomePrato : TextView = itemView.findViewById(R.id.tvNomePrato)

        init {
            itemView.setOnClickListener(this)
        }


        override fun onClick(p0: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION)
                listener.onClickPrato(position)
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PratoAdapter.PratoViewHolder {
        val itemView : View = LayoutInflater.from(parent.context).inflate(R.layout.cards_pratos, parent, false)
        return PratoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PratoAdapter.PratoViewHolder, position: Int) {
        var prato : Prato = listaPrato.get(position)
        holder.ivPrato.setImageResource(prato.img)
        holder.tvNomePrato.text = prato.nome
        holder.cvPratos.setOnClickListener {
            var intent = Intent(context, descricaoPrato::class.java)
            intent.putExtra("prato", prato )
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = listaPrato.size

}