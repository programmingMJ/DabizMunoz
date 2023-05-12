package com.example.by_dabiz_munoz

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
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
//    private val context : Activity,
//                  private val arrayList: ArrayList<Plate>): ArrayAdapter<Plate> (context,
//    R.layout.activity_list_item,arrayList){

//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//
//        val inflater: LayoutInflater = LayoutInflater.from(context)
//        val view: View = inflater.inflate(R.layout.activity_list_item,null);
//
//        val imageView : ImageView = view.findViewById(R.id.food_img)
//        val name : TextView = view.findViewById(R.id.name_food_txt)
//
//        imageView.setImageResource(arrayList[position].imageId)
//        name.text =arrayList[position].title
//        return view
//    }
//}