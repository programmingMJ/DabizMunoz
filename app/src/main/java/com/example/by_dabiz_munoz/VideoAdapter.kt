package com.example.by_dabiz_munoz

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.by_dabiz_munoz.databinding.VideoItemBinding

class VideoAdapter(

private val videos:List<Video>,
private val clickListener: VideoClickListener
)
: RecyclerView.Adapter<VideoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = VideoItemBinding.inflate(from,parent,false)
        return VideoViewHolder(binding,clickListener)
    }


    override fun getItemCount(): Int=videos.size
    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        holder.bindVideo(videos[position])
    }
}
