package com.example.mytabviewsoccer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter(var context: Context, var arrayList: ArrayList<ProfileCards>):
                RecyclerView.Adapter<ProfileAdapter.ItemHolder>(){


        class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            var icons = itemView.findViewById<ImageView>(R.id.profile_image)
            var position = itemView.findViewById<TextView>(R.id.positionText)
            var profile_name = itemView.findViewById<TextView>(R.id.nameText)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemholder = LayoutInflater.from(parent.context).inflate(R.layout.profile_card, parent, false)
        return ItemHolder(itemholder)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var myCard: ProfileCards = arrayList.get(position)

        holder.icons.setImageResource(myCard.iconsProfile!!)
        holder.position.text = myCard.positionProfile
        holder.profile_name.text = myCard.nameProfile
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}