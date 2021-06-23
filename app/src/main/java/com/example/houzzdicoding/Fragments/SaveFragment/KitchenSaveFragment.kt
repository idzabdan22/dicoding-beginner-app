package com.example.houzzdicoding.Fragments.SaveFragment

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
import com.example.houzzdicoding.PassingData.NewDataApps
import com.example.houzzdicoding.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [KitchenSaveFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class KitchenSaveFragment : Fragment() {
    private lateinit var list: ArrayList<DataApps>
    private lateinit var rvKit: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list = ArrayList()
        list = NewDataApps.getInstance()!!.savekit
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_kitchen_save, container, false)
        rvKit = view.findViewById<RecyclerView>(R.id.rvkitchen_save)
        rvKit.setHasFixedSize(true)
        showRecyclerList()
        return view
    }

    private fun showRecyclerList(){
        val activity = activity as Context
        rvKit.layoutManager = GridLayoutManager(activity, 2)
        val listContent = ListDataAppsAdapter(list)
        rvKit.adapter = listContent
    }
}