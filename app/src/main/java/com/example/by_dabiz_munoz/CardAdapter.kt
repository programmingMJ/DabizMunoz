package com.example.by_dabiz_munoz


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.by_dabiz_munoz.databinding.ActivityListItemBinding

class CardAdapter(
    private val plates:List<Plate>,
    private val clickListener: PlateClickListener
)
    :RecyclerView.Adapter<CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = ActivityListItemBinding.inflate(from,parent,false)
        return CardViewHolder(binding,clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindPlate(plates[position])
    }

    override fun getItemCount(): Int=plates.size
}
