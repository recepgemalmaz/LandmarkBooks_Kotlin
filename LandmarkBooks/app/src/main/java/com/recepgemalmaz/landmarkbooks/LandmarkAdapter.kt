package com.recepgemalmaz.landmarkbooks

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.recepgemalmaz.landmarkbooks.databinding.RecyclerRowBinding

class LandmarkAdapter (val landmarkList : ArrayList<Landmark>): RecyclerView.Adapter<LandmarkAdapter.LadnmarkHolder>() {

    class LadnmarkHolder(val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LadnmarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LadnmarkHolder(binding)
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }

    override fun onBindViewHolder(holder: LadnmarkHolder, position: Int) {
       holder.binding.recyclerTextView.text = landmarkList.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)

            //intent.putExtra("landmark",landmarkList.get(position))
            MySingleton.chosenLandmark = landmarkList.get(position)

            holder.itemView.context.startActivity(intent)

        }

    }

}

