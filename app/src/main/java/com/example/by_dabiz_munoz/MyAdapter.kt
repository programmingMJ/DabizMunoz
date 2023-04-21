package com.example.by_dabiz_munoz

import android.app.Activity
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context : Activity, private val arrayList: ArrayList<Plate>): ArrayAdapter<Plate> (context,
    R.layout.activity_list_item,arrayList){


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.activity_list_item,null);

        val imageView : ImageView = view.findViewById(R.id.food_img)
        val name : TextView = view.findViewById(R.id.name_food_txt)

        imageView.setImageResource(arrayList[position].imageId)
        name.text =arrayList[position].title
        return view
    }
}