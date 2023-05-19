package com.example.by_dabiz_munoz

import androidx.recyclerview.widget.RecyclerView
import com.example.by_dabiz_munoz.databinding.ActivityListItemBinding
import com.squareup.picasso.Picasso

class CardViewHolder(
    private val listItemBinding: ActivityListItemBinding,
    private val clickListener: PlateClickListener
) :RecyclerView.ViewHolder(listItemBinding.root)
{
    fun bindPlate(plate: Plate) {
        Picasso.get()
            .load(plate.imageId)
            .into(listItemBinding.foodImg)

        listItemBinding.nameFoodTxt.text = plate.title

        listItemBinding.cardView.setOnClickListener {
            clickListener.onClick(plate)
        }
    }
}