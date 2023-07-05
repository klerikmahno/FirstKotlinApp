package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstkotlinapp.adapters.CountryAdapter
import com.example.firstkotlinapp.models.Country

class MainActivity : AppCompatActivity() {

    lateinit var countryRecycler: RecyclerView
    lateinit var countryAdapter : CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countryList = ArrayList<Country>()
        countryList.add(Country(1, "Россия"))
        countryList.add(Country(2, "Турция"))
        countryList.add(Country(3, "Узбекистан"))
        countryList.add(Country(4, "Прочее"))
        setCountyRecycler(countryList)
    }

    fun setCountyRecycler(countryList: ArrayList<Country>): Unit {
        var layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        countryRecycler = findViewById(R.id.countryRecycler)
        countryRecycler.layoutManager = layoutManager

        countryAdapter = CountryAdapter(this,countryList)
        countryRecycler.adapter = countryAdapter
    }

}
