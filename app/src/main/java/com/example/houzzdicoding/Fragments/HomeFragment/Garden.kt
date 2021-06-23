package com.example.houzzdicoding.Fragments.HomeFragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.houzzdicoding.Adapter.ListDataAppsAdapter
import com.example.houzzdicoding.Models.DataApps
import com.example.houzzdicoding.R

class Garden : Fragment() {
    private lateinit var list: ArrayList<DataApps>
    private lateinit var rvGarden: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list = ArrayList()
        list.add(DataApps("Leaf Forest 101", R.drawable.garden,  "The combination of all these factors affects how people see the landscape (bright, clear desert distances; soft, mysterious, changeable foggy landscapes), what they expect from design (shade from the sun, protection from the wind, shelter from rain and snow), and how gardens and landscapes are designed. The patios, cloisters, and oases of Mediterranean and Middle Eastern regions, the romantic naturalistic parks of Europe, China, and eastern North America, the esoteric garden abstractions of Japan—all of these different approaches to design were inspired partly by the particular qualities of the landscape climate in which they developed.",
            "Caltech Design", R.drawable.user9, "Garden"))
        list.add(DataApps("Garden By The Backyard", R.drawable.garden1,  "The pond was also designed to provide an ideal environment for koi and other aquatic life. The site was excavated to a depth of only 2 feet, but its reinforced concrete walls are covered with a black waterproof coating to create the illusion of deeper water. An underground drain pipe system leads to a filter and an above-ground mechanical pump hidden by a cinder block wall covered with vines. To help move and oxygenate the water, the Niemans installed a rock waterfall and other water statuary, which work in unison with the pump system to maintain good water quality for the pond’s many visitors.",
            "Uncle Sam", R.drawable.user2, "Garden"))
        list.add(DataApps("Kalimantan Rain Green", R.drawable.garden2,  "For flower lovers, a charming white-picketed garden area shows off raised beds full of colorful wildflowers, perennials, and annuals, including nasturtiums, cosmos, Peruvian lilies, snapdragons, daisy’s, delphiniums, and calla lilies. “Something is always in bloom, providing color all year round in the sunny San Diego climate.A garden sign that insinuates dragons are nearby is one of the many whimsical items in the yard, added for the delight of visiting grandchildren.",
            "Big Bang", R.drawable.user3, "Garden"))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_garden, container, false)
        rvGarden = view.findViewById<RecyclerView>(R.id.rv_garden)
        rvGarden.setHasFixedSize(true)
        showRecyclerList()
        return view
    }

    private fun showRecyclerList(){
        val activity = activity as Context
        rvGarden.layoutManager = GridLayoutManager(activity, 2)
        val listContent = ListDataAppsAdapter(list)
        rvGarden.adapter = listContent
    }
}