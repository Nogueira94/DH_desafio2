package com.example.myapplication.`class`

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.compose.ui.res.loadImageResource
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class RestaurantAdapter (private val listaRest : ArrayList<Restaurant>, val listener : onClickRestaurantListener) : RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RestaurantAdapter.RestaurantViewHolder {
        val itemView : View = LayoutInflater.from(parent.context).inflate(R.layout.cards_restaurant, parent, false)
        return RestaurantViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RestaurantAdapter.RestaurantViewHolder, position: Int) {
        var rest : Restaurant = listaRest.get(position)
        holder.ivRest.setImageResource(rest.img)
        holder.tvNameRest.text = rest.nome
        holder.tvEndRest.text = rest.end
        holder.tvHoraRest.text = rest.hora

    }

    override fun getItemCount() = listaRest.size

    interface onClickRestaurantListener {
        fun onClickRestaurant(position: Int)
    }

    inner class RestaurantViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var ivRest : ImageView = itemView.findViewById(R.id.ivRest)
        var tvNameRest : TextView = itemView.findViewById(R.id.tvNameRest)
        var tvEndRest : TextView = itemView.findViewById(R.id.tvEndRest)
        var tvHoraRest : TextView = itemView.findViewById(R.id.tvHoraRest)





        init {
            itemView.setOnClickListener(this)
        }


        override fun onClick(p0: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION)
                listener.onClickRestaurant(position)
        }

    }



}