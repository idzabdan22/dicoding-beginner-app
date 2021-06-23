package com.example.houzzdicoding.Fragments.HomeFragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.houzzdicoding.Adapter.ListDataAppsAdapter
import com.example.houzzdicoding.Models.ContentData
import com.example.houzzdicoding.Models.DataApps
import com.example.houzzdicoding.R

class UniversalCategory : Fragment() {

    private lateinit var rvDatas: RecyclerView
    private var list: ArrayList<DataApps> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_universal_category, container, false)
        rvDatas = view.findViewById<RecyclerView>(R.id.rv_universal_cat)
        rvDatas.setHasFixedSize(true)
        list.addAll(ContentData.dataList)
        showRecyclerList()
        return view
    }

    private fun showRecyclerList() {
        val activity = activity as Context
        rvDatas.layoutManager = GridLayoutManager(activity, 2)
        val listContent = ListDataAppsAdapter(list)
        rvDatas.adapter = listContent
    }
}