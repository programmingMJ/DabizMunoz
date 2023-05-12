package com.example.by_dabiz_munoz

var videoList = mutableListOf<Video>()
val VIDEO_ID_EXTRA = "videoExtra"
class Video(
    var coverId:Int,
    var videoId: Int,
    val id: Int? = videoList.size
)

