package com.example.by_dabiz_munoz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.recyclerview.widget.GridLayoutManager
import com.example.by_dabiz_munoz.databinding.ActivityDishesBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Dishes : AppCompatActivity(),PlateClickListener {

    private lateinit var binding: ActivityDishesBinding
//    private lateinit var plateArrayList : ArrayList<Plate>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDishesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ourPlates()

        val dishesActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext,1)
            adapter = CardAdapter(plateList,dishesActivity)
        }


        val button_back: FloatingActionButton = findViewById(R.id.floatingActionButtonBack)
        button_back.setOnClickListener{
            startActivity(Intent(this, Menu::class.java))
        }
    }
    override fun onClick(plate: Plate) {
        val intent = Intent(applicationContext,Description::class.java)
        intent.putExtra(PLATE_ID_EXTRA,plate.id)
        startActivity(intent)
    }
    private fun ourPlates(){
        val plate1 = Plate(
            "Crabs (Blue and Royal)",
            R.drawable.carrilleras,
            "Crabs (Blue and Royal) with home-fermented kimchis, sheep's yoghurt, wild strawberries and coffee",
            R.drawable.diverxo_png
        )
        plateList.add(plate1)
        val plate2 = Plate(
            "Jalapeño gazpacho",
            R.drawable.gazpachoo,
            "Jalapeño gazpacho with Motril shrimp, sea urchin, vanilla and coconut oil and the head of shrimp blanched in sake, Motril shrimp tartar, sea urchin, cut stick and jalapeño.",
            R.drawable.diverxo_png
        )
        plateList.add(plate2)
        val plate3 = Plate(
            "Sandwich Club",
            R.drawable.huevo,
            "Steamed ricotta and fried quail egg club sandwich with shichimi tōgarashi.",
            R.drawable.goxo
        )
        plateList.add(plate3)

        val plate4 = Plate(
            "Nigiri croqueta",
            R.drawable.nigiri,
            "sheep's milk nigiri croqueta, mille-feuille of salmon matured in jabugo fat, tomato jam and smoked tea",
            R.drawable.streetxo
        )
        plateList.add(plate4)

        val plate5 = Plate(
            "Sabu sabu",
            R.drawable.sabbu,
            "chili crab-style octopus sabu sabu with paprika de la vera and Canarian potato",
            R.drawable.streetxo
        )
        plateList.add(plate5)


    }

    override fun onBackPressed() {
        finish()
    }


}