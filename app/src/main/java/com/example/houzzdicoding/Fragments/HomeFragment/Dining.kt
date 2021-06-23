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

class Dining : Fragment() {
    private lateinit var rvDining: RecyclerView
    private lateinit var list: ArrayList<DataApps>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list = ArrayList()
        list.add(DataApps("Western Syle", R.drawable.dining,  "Unlike most dining rooms, this one by Leanne Ford Interiors doesn't use a large pendant light as the focal point. Instead, the focus is on the space itself. To enhance the beauty of a space like this one, work with raw materials like concrete, jute, and wood, and keep those beams exposed. An abstract painting in light clay tones elevates the dining nook even more. ",
            "Budi Sugeng Darmono", R.drawable.user7, "Dining Room"))
        list.add(DataApps("Port Margate", R.drawable.dining1,  "This moody dining room designed by Anne Pyne proves that formal doesn't necessarily mean fussy. Rich jewel one fabrics and lush layers of patterns bring the room to life, but they're used with restraint so the modern art gallery-esque table and light fixture can also assert a more edgy and serious tone. ",
            "Yale Nathan", R.drawable.user8, "Dining Room"))
        list.add(DataApps("Intracoastal Residence", R.drawable.dining2,  "When your formal dining room is also your everyday dining area, invest in pieces that fuse form and function. This built-in velvet banquette by Abdan Idza is cozy and comfortable, but it also looks dressy. The same is true for those beautiful barrel chairs. And unusual lighting and wallpaper are easy ways to add character without taking up surface space.",
            "Abdan Idza", R.drawable.user2, "Dining Room"))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_dining, container, false)
        rvDining = view.findViewById<RecyclerView>(R.id.rv_dining)
        rvDining.setHasFixedSize(true)
        showRecyclerList()
        return view
    }

    private fun showRecyclerList(){
        val activity = activity as Context
        rvDining.layoutManager = GridLayoutManager(activity, 2)
        val listContent = ListDataAppsAdapter(list)
        rvDining.adapter = listContent
    }

}