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

class Bathroom : Fragment() {
    private lateinit var list: ArrayList<DataApps>
    private lateinit var rvBathroom: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list = ArrayList()
        list.add(DataApps("Mid Century Modern", R.drawable.bathroom,"The modern bathroom design is simply defined by its look. Straight, clean lines, uncluttered counter spaces and geometric shapes dominate the landscape. Modern design takes quite a departure from the antique and ornate detailed traditional interior design theme—in fact, the concept is exactly the opposite. Modern design is often confused with contemporary design but actually there is a distinct difference between the two.",
            "Abdan Idza", R.drawable.user2, "Bathroom"))
        list.add(DataApps("1331 Constitution", R.drawable.bathroom1,"Modern bathroom designs were so popular as they offered a departure from the warm and cozy wooden Victorian design themes prevalent at the time. Over the decades, other cultures around the world began to develop a taste for the look and feel of simple elegance that is modern design.\n" + "But what really defines a modern bathroom design theme? Besides the look and feel of sleek cool lines and simple colour palates with neutral tones, modern design elements often go hand in hand with organization. A well-organized space with minimal décor clutter and clever storage solutions screams modern bathroom design.",
            "Caltech Design", R.drawable.user3, "Bathroom"))
        list.add(DataApps("Latern House On The River", R.drawable.bathroom2,"Accenting with bright and bold colours is also a feature that is often used in modern bathroom designs. While the greys, browns and tans of the moderns design reflect the industrial overtones of the theme, bold and bright splashes of red, green, yellow and blue are always welcome. However, when using colors that contrast with the neutral tones of a bright colour, be sure they line up correctly on the colour wheel or else you could have a bad colour match that makes the bold colour stand out too much rather than make a nice accent.",
            "Uncle Sam", R.drawable.user4, "Bathroom"))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_bathroom, container, false)
        rvBathroom = view.findViewById<RecyclerView>(R.id.rv_bath)
        rvBathroom.setHasFixedSize(true)
        showRecyclerList()
        return view
    }

    private fun showRecyclerList(){
        val activity = activity as Context
        rvBathroom.layoutManager = GridLayoutManager(activity, 2)
        val listContent = ListDataAppsAdapter(list)
        rvBathroom.adapter = listContent
    }
}