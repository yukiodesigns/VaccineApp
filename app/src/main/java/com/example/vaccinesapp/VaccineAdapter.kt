package com.example.vaccinesapp

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VaccineAdapter(val itemList: ArrayList<VaccineModel>): RecyclerView.Adapter<>() {

    inner class MyViewHOlder(itemView: View): RecyclerView.ViewHolder(itemView){
        lateinit var vaccineImage: ImageView
        lateinit var vaccineTitle: TextView

        init{
            vaccineImage = itemView.findViewById(R.id.image)
            vaccineTitle = itemView.findViewById(R.id.txt1)
        }
    }
}