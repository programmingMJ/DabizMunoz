package com.example.by_dabiz_munoz

import androidx.recyclerview.widget.RecyclerView

class VideoAdapter(

private val clip:List<Video>,
private val clickListener: VideoClickListener
)
: RecyclerView.Adapter<VideoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = ActivityListItemBinding.inflate(from,parent,false)
        return VideoViewHolder(binding,clickListener)
    }


    override fun getItemCount(): Int=video.size
    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        holder.bindVideo(video[position])
    }
}
