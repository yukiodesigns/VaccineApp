package com.example.vaccinesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class VaccineAdapter(val itemList: ArrayList<VaccineModel>): RecyclerView.Adapter<VaccineAdapter.MyViewHOlder>() {

    inner class MyViewHOlder(itemView: View): RecyclerView.ViewHolder(itemView){
        lateinit var vaccineImage: ImageView
        lateinit var vaccineTitle: TextView

        init{
            vaccineImage = itemView.findViewById(R.id.image)
            vaccineTitle = itemView.findViewById(R.id.txt1)

            itemView.setOnClickListener(){
                Toast.makeText(itemView.context, "You chose: ${itemList[adapterPosition].name}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHOlder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return MyViewHOlder(v)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHOlder, position: Int) {
        holder.vaccineTitle.text = itemList[position].name
        holder.vaccineImage.setImageResource(itemList[position].img)
    }
}