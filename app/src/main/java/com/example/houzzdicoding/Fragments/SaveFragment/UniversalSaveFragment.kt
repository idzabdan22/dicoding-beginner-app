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
 * Use the [UniversalSaveFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UniversalSaveFragment : Fragment() {
    private lateinit var list: ArrayList<DataApps>
    private lateinit var rvUniv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list = ArrayList()
        list = NewDataApps.getInstance()!!.saveall
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_universal_save, container, false)
        rvUniv = view.findViewById<RecyclerView>(R.id.rv_universal_save)
        rvUniv.setHasFixedSize(true)
        showRecyclerList()
        return view
    }

    private fun showRecyclerList(){
        val activity = activity as Context
        rvUniv.layoutManager = GridLayoutManager(activity, 2)
        val listContent = ListDataAppsAdapter(list)
        rvUniv.adapter = listContent
    }
}