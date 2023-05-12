package com.example.by_dabiz_munoz

import androidx.recyclerview.widget.RecyclerView
import com.example.by_dabiz_munoz.databinding.ActivityListItemBinding

class VideoViewHolder(
//    private val listItemBinding: ActivityListItemBinding,
    private val clickListener: VideoClickListener
) :RecyclerView.ViewHolder(listItemBinding.root)
{
    fun bindVideo(video: Video)
    {
        listItemBinding.foodImg.setImageResource(plate.imageId)
        listItemBinding.nameFoodTxt.text=plate.title

        listItemBinding.cardView.setOnClickListener{
            clickListener.onClick(video)
        }
    }
}