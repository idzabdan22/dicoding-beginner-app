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
import com.example.houzzdicoding.Models.ContentData
import com.example.houzzdicoding.Models.DataApps
import com.example.houzzdicoding.R
import java.util.*
import kotlin.collections.ArrayList

class Living : Fragment() {
    private lateinit var list: ArrayList<DataApps>
    private lateinit var rvLiving: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            list = ArrayList()
            list.add(DataApps("Huntington Model", R.drawable.livingroom,  "The first original idea is to use photo wallpapers with the scene matching the overall design of the living room as a decoration of the free wall. For example, this could be a fascinating and stylish view of a night city with glowing lights. An image of a city street in the retro style will emphasize the classic features of the interior. And for creating of futuristic atmosphere you can include some space patterns on wallpaper.",
                "Java & Co", R.drawable.userphoto, "Living Room"))
            list.add(DataApps("Classc Hill Coutry", R.drawable.livingroom1,  "Lambrequin is a decorative element, which is located in front of the curtain and is used for hiding of a curtain-rod. However, apart from this function lambrequin could be successfully used for visual raise of ceilings and shift in windows` proportions. Lambrequin may be soft and hard. Soft is sewn directly on the curtain and is only a decorative element in such a case. In turn, the hard one is fixed to the wall above the curtain-rod, hides it and visually corrects the window`s size.",
                "Budi Doremi", R.drawable.user5, "Living Room"))
            list.add(DataApps("Family Cozy Home", R.drawable.livingroom2,  "Color tincture of curtains may be compliant with other interior colors, yet must necessarily be light (beige, white coffee, ivory) or should make emphasizes (red, violet, light-blue, green). In any case these colors should be pure and pristine. The curtains in modern style may be manufactured of any fabric:  starting from natural one with pronounced texture, to the fabric, produced with the use of modern technologies (metallic threads, laser beam cutting etc.). The ornament may be either sole-colored or contain geometric figures.",
                "Jo & Co", R.drawable.user6, "Living Room"))
        }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_living, container, false)
        rvLiving = view.findViewById<RecyclerView>(R.id.rv_living)
        rvLiving.setHasFixedSize(true)
        showRecyclerList()
        return view
    }

    private fun showRecyclerList(){
        val activity = activity as Context
        rvLiving.layoutManager = GridLayoutManager(activity, 2)
        val listContent = ListDataAppsAdapter(list)
        rvLiving.adapter = listContent
    }
}