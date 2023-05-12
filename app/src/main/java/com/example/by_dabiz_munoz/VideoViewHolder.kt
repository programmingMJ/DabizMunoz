package com.example.by_dabiz_munoz

import androidx.recyclerview.widget.RecyclerView
import com.example.by_dabiz_munoz.databinding.ActivityListItemBinding
import com.example.by_dabiz_munoz.databinding.ActivityRecipesBinding
import com.example.by_dabiz_munoz.databinding.VideoItemBinding

class VideoViewHolder(
    private val videoItemBinding:VideoItemBinding,
    private val clickListener: VideoClickListener
) :RecyclerView.ViewHolder(videoItemBinding.root)
{
    fun bindVideo(video: Video)
    {
        videoItemBinding.videoImg.setImageResource(video.coverId)

        videoItemBinding.cardViewVideo.setOnClickListener{
            clickListener.onClick(video)
        }
    }
}