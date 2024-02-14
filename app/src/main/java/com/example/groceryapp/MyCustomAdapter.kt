package com.example.groceryapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class MyCustomAdapter(private val itemList:ArrayList<ItemData>) :RecyclerView.Adapter<MyCustomAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var itemImage:ImageView
        var itemTitle:TextView
        var itemDesc:TextView
        init {
            itemImage=itemView.findViewById(R.id.image)
            itemTitle=itemView.findViewById(R.id.Title)
            itemDesc=itemView.findViewById(R.id.description)
            itemView.setOnClickListener(){
                Toast.makeText(itemView.context,
                    "You selected ${itemList[adapterPosition].title}",
                    Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.custom_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
     return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.itemImage.setImageResource(itemList[position].image)
        holder.itemTitle.text=itemList[position].title
        holder.itemDesc.text=itemList[position].des
    }
}