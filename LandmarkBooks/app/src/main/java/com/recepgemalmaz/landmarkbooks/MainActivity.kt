package com.recepgemalmaz.landmarkbooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.recepgemalmaz.landmarkbooks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        val colosseum = Landmark("Colosseum", "Italy", R.drawable.collesium)
        val eiffel = Landmark("Eiffel", "France", R.drawable.eiffel)
        val londonBridge = Landmark("London Bridge", "England", R.drawable.london)


        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)

        //Adapter - ArrayAdapter Layout & Data

        //Adapter: Layout & Data

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkADAPTER = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkADAPTER

    /*
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name })

        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(applicationContext,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarkList[position])
            //MySingleton.selectedLandmark = landmarkList[position]
            startActivity(intent)
        }

         */


    }
}