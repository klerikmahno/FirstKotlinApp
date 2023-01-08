package com.example.firstkotlinapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firstkotlinapp.R
import com.example.firstkotlinapp.models.Country

open class CountryAdapter( var context: Context, var country : List<Country>) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var countryItems : View = LayoutInflater.from(context).inflate(R.layout.country_item,parent,false)
        return CountryViewHolder(countryItems)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.countryTitle.text = country[position].name
    }

    override fun getItemCount(): Int {
        return country.size
    }

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var countryTitle : TextView = itemView.findViewById(R.id.countryTitle)
    }
}