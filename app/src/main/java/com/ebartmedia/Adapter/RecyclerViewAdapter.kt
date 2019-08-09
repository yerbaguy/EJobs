package com.ebartmedia.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ebartmedia.MainActivity
import com.ebartmedia.Model.Categories
import com.ebartmedia.R

//class RecyclerViewAdapter(internal var context: Context, internal var categories: ArrayList<Categories>): RecyclerView.Adapter<RecyclerViewAdapter.CategoriesViewHolder>() {
//class RecyclerViewAdapter(internal var context: Context, internal var items: ArrayList<String>): RecyclerView.Adapter<com.ebartmedia.Adapter.RecyclerViewAdapter.CategoriesViewHolder>() {//here

class RecyclerViewAdapter(internal var context: Context, internal var items: ArrayList<Categories>): RecyclerView.Adapter<com.ebartmedia.Adapter.RecyclerViewAdapter.CategoriesViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, position: Int): CategoriesViewHolder {

        val itemView  = LayoutInflater.from(parent.context).inflate(R.layout.categories_item, parent, false )

        return CategoriesViewHolder(itemView)

    }

    override fun getItemCount(): Int {

        return items.size
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {

       // holder.txt_cat_name.text = items[position].categoryName

       // holder.txt_cat_name.text = items.get(position).toString() //here

        holder.bindItems(items[position])


    }


    class CategoriesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

      //  internal var txt_cat_id: TextView
//        internal var txt_cat_name: TextView
//
//        init {
//
//            txt_cat_name = itemView.findViewById(R.id.txt_category_name)
//        }


//        val txt_cat_name = itemView.txt_category_name //here

        fun bindItems(categories: Categories) {

            val txt_cat_name = itemView.findViewById<TextView>(R.id.txt_category_name)

            txt_cat_name.text = categories.categoryName
        }

    }


}

//class CategoriesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
//
//    //  internal var txt_cat_id: TextView
//    internal var txt_cat_name: TextView
//
//    init {
//
//        txt_cat_name = itemView.findViewById(R.id.txt_category_name)
//    }
//
//
//}




