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

class VerticalGarden : Fragment() {
    private lateinit var list: ArrayList<DataApps>
    private lateinit var rvVergar: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list = ArrayList()
        list.add(DataApps("Amazon Vertical Side", R.drawable.vergar,  "Succulents are popular among plant enthusiasts because they are space efficient, colorful, and very easy to maintain. Succulents are also fire-resistant and are great alternatives if you are in a region with a lot of water shortages. For this reason, succulents are great plant choices for vertical gardens.Succulents are well known to have a hard and fleshy exterior which makes them great candidates for interiors. Selecting succulents makes it very easy to mold and shape any vertical garden to your needs. Watering and other maintenance is needed less for succulents while they provide a wonderful aesthetic to any space.",
            "Finnish Design", R.drawable.user4, "Vertical Garden"))
        list.add(DataApps("Backbone Green", R.drawable.vergar1,  "Vertical gardening is used by many as a means to ensure they are using their garden space to its maximum potential. A simple structure formed by bamboo poles can allow bean plants to climb vertically, providing more growing space than would be possible in a conventional horizontal garden. Cucumbers, squash, and even tomatoes can be grown vertically, as well.Climbing plants and vines are far from the only options when it comes to vertical gardening. With a little planning and the right materials, vertical gardens can be created that allow you to grow virtually anything. A number of DIY kits can be found that use small cups or other containers set in rows in the face of a vertical support. These containers are filled with soil and seeds, and then watered. ",
            "Java & Co", R.drawable.user7, "Vertical Garden"))
        list.add(DataApps("Upside Garden Neo", R.drawable.vergar2,  "The building block of this modular system is a rigid, light weight, three-dimensional panel made from a powder coated galvanized and welded steel wire that supports plants with both a face grid and a panel depth. This system is designed to hold a green facade off the wall surface so that plant materials do not attach to the building, provides a “captive” growing environment for the plant with multiple supports for the tendrils, and helps to maintain the integrity of a building membrane. Panels can be stacked and joined to cover large areas, or formed to create shapes and curves, are made from recycledcontent steel and are recyclable. Because the panels are rigid, they can span between structures and can also be used for freestanding green walls.",
            "Java & Co", R.drawable.user7, "Vertical Garden"))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_vertical_garden, container, false)
        rvVergar = view.findViewById<RecyclerView>(R.id.rv_vergar)
        rvVergar.setHasFixedSize(true)
        showRecyclerList()
        return view
    }

    private fun showRecyclerList(){
        val activity = activity as Context
        rvVergar.layoutManager = GridLayoutManager(activity, 2)
        val listContent = ListDataAppsAdapter(list)
        rvVergar.adapter = listContent
    }
}