package com.recepgemalmaz.landmarkbooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.recepgemalmaz.landmarkbooks.databinding.ActivityDetailsBinding
import com.recepgemalmaz.landmarkbooks.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //val intent = intent
        //val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark


        val selectedLandmark = MySingleton.chosenLandmark

        //let icinde yaz
        selectedLandmark?.let {
            binding.imageView.setImageResource(it.image)
            binding.nameText.text = it.name
            binding.countryText.text = it.country
        }



    }
}