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

class Kitchen : Fragment() {
    private lateinit var list: ArrayList<DataApps>
    private lateinit var rvKitchen: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list = ArrayList()
        list.add(DataApps("Pawon Jowo", R.drawable.kitchen,  "Particleboard countertops are laminated in plastic; its height varies from 0.8 to 1.2 mm. The coverage consists of several layers, saturated with special mastics and highly compressed. The upper layer is an enduring polymer; its layout is responsible for aesthetics properties of items. The advantage of such countertops is that they have various colour modifications: they can be matted or glazed, can imitate wood or stone. The plastic`s height, particleboard`s quality and external properties greately influence the price of the ready-made item. However, there is essential price dispersion even within such low-priced category of countertops.",
            "Yale Nathan", R.drawable.user8, "Kitchen"))
        list.add(DataApps("Gordon Ramsey Style", R.drawable.kitchen1,  "It is fair to say that such countertops are the most popular ones nowadays. These items consist of plywood with glued layer of artificial stone of around 12 mm in height. The artificial stone in turn is by nature of polymer adhesive with granules of different colour and size, imitating the natural material. Such end material is rather flexible and allows creation of complicated forms; this is often necessary for kitchen furniture with bent facades.An artificial stone is light-weight, smooth and warm, as against the natural one. One of the main advantages of such type of countertops is that you may build up large surfaces without junctions, to cut a hole for sinks or other elements. Countertops of artificial stone will work for a long time in case the technological process has not been breached and the producer hasn`t cut down expenses on components. Therefore our advice is to give preference to famous brands, which gained a good reputation during many years.",
            "Big Bang", R.drawable.user9, "Kitchen"))
        list.add(DataApps("426 Fish Style", R.drawable.kitchen2,  "These countertops are the most expensive and beautiful. It`s obvious that no imitation could be compared to the natural ornament on the stone. However, this will cost a lot. The thing is not only in cost of the stone itself. The Natural-stoned countertops weight a lot; their mounting will require the reinforced frame of kitchen cupboards of the lower level. Apart from the heavy weight and high price there are other disadvantages of some kinds of natural stone. Thus, marble looks splendid and is able to transfigure even the most ordinary interior. However, it is not functional as a countertop material; it is easily scratched (requires frequent polishing) and fouled (high water absorbency).",
            "Finnish Design", R.drawable.user10, "Kitchen"))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_kitchen, container, false)
        rvKitchen = view.findViewById<RecyclerView>(R.id.rv_kitchen)
        rvKitchen.setHasFixedSize(true)
        showRecyclerList()
        return view
    }

    private fun showRecyclerList(){
        val activity = activity as Context
        rvKitchen.layoutManager = GridLayoutManager(activity, 2)
        val listContent = ListDataAppsAdapter(list)
        rvKitchen.adapter = listContent
    }
}