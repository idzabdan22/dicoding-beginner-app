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


class Bedroom : Fragment() {
    private lateinit var list: ArrayList<DataApps>
    private lateinit var rvBedroom: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list = ArrayList()
        list.add(DataApps("Cottage Bed", R.drawable.bedroom,  "In the basis of the style modern are clear lines, simplicity, comfort, lightness and unobtrusiveness. Palette often contains white, black colors and neutral shades, while bright accents are also welcome. The main element of any contemporary interior is graphic lines, free space, minimum number of decor elements and furniture items. Despite the external strictness and clarity, the modern style can be also cosy and comfortable for everyday life.",
            "Budi Doremi", R.drawable.user5, "Bedroom"))
        list.add(DataApps("Asford Glen", R.drawable.bedroom1,  "Materials from which made the bedroom’s furniture in the modern style can be quite different. The amount of furniture in the room will depend on, whether it is used only modern or a combination of two styles. In the first case it welcomes the presence of a bed and chest of drawers, a bedside table and mirror, a wardrobe. The furniture can be decorated with floral motives in combinations with other styles. The combination of different materials looks perfectly. As an additional item of furniture it is possible to use an armchair.",
            "Jo & Co", R.drawable.user6, "Bedroom"))
        list.add(DataApps("Coastcal Master", R.drawable.bedroom2,  "Accessories in the bedroom in modern style can be used, but their number should be varied according to the room’s size. It is better to use for additional decorative elements such materials as porcelain and wood, metal, stone and glass. Elegant decorations will fit to the real modern style. Lightning sources can be several lights at once. It is good if they have a fancy shape like some animal or plant. You can decorate the bedroom with a mirror in a large frame, paintings of wide format printing.",
            "Budi Sugeng Darmono", R.drawable.user7, "Bedroom"))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_bedroom, container, false)
        rvBedroom = view.findViewById<RecyclerView>(R.id.rv_bed)
        rvBedroom.setHasFixedSize(true)
        showRecyclerList()
        return view
    }

    private fun showRecyclerList(){
        val activity = activity as Context
        rvBedroom.layoutManager = GridLayoutManager(activity, 2)
        val listContent = ListDataAppsAdapter(list)
        rvBedroom.adapter = listContent
    }
}