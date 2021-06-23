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

class BathroomSaveFragment : Fragment() {
    private lateinit var list: ArrayList<DataApps>
    private lateinit var rvBathroom: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list = ArrayList()
        list = NewDataApps.getInstance()!!.savebath
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_bathroom_save, container, false)
        rvBathroom = view.findViewById<RecyclerView>(R.id.rvbath_save)
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