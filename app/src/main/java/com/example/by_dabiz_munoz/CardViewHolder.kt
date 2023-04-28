package com.example.by_dabiz_munoz

import androidx.recyclerview.widget.RecyclerView
import com.example.by_dabiz_munoz.databinding.ActivityListItemBinding

class CardViewHolder(
    private val listItemBinding: ActivityListItemBinding,
    private val clickListener: PlateClickListener
) :RecyclerView.ViewHolder(listItemBinding.root)
{
    fun bindPlate(plate: Plate)
    {
        listItemBinding.foodImg.setImageResource(plate.imageId)
        listItemBinding.nameFoodTxt.text=plate.title

        listItemBinding.cardView.setOnClickListener{
            clickListener.onClick(plate)
        }
    }
}