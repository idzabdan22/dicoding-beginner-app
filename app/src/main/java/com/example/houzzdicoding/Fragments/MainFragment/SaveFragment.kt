package com.example.houzzdicoding.Fragments.MainFragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.houzzdicoding.Activity.MainActivity
import com.example.houzzdicoding.Adapter.ListDataAppsAdapter
import com.example.houzzdicoding.Fragments.HomeFragment.*
import com.example.houzzdicoding.Fragments.SaveFragment.*
import com.example.houzzdicoding.Models.DataApps
import com.example.houzzdicoding.PassingData.NewDataApps
import com.example.houzzdicoding.R

class SaveFragment : Fragment() {

    private lateinit var rvSave: RecyclerView
    private lateinit var list: ArrayList<DataApps>
    private lateinit var datapps: NewDataApps

    private lateinit var livingFragment: LivingSaveFragment
    private lateinit var diningFragment: DiningSaveFragment
    private lateinit var gardenFragment: GardenSaveFragment
    private lateinit var bathFragment: BathroomSaveFragment
    private lateinit var bedFragment: BedroomSaveFragment
    private lateinit var vergarFragment: VerticalGarSaveFragment    
    private lateinit var kitchenFragment: KitchenSaveFragment

    private lateinit var universalCat: UniversalSaveFragment
    private lateinit var batBut: TextView
    private lateinit var bedBut: TextView
    private lateinit var livBut: TextView
    private lateinit var garBut: TextView
    private lateinit var vgarBut: TextView
    private lateinit var dinBut: TextView
    private lateinit var kitBut: TextView

    private lateinit var backbut: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        list = ArrayList()
//        list = NewDataApps.getInstance()!!.saveall
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_save, container, false)

        backbut = view.findViewById(R.id.back_button)

        backbut.setOnClickListener{
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

//        rvSave = view.findViewById<RecyclerView>(R.id.rv_save)
//        rvSave.setHasFixedSize(true)
//        showRecyclerList()
//        batBut = view.findViewById(R.id.button_bathroom_save)
//        bedBut = view.findViewById(R.id.button_bedroom_save)
//        livBut = view.findViewById(R.id.button_livingroom_save)
//        garBut = view.findViewById(R.id.button_Garden_save)
//        vgarBut = view.findViewById(R.id.button_verGarden_save)
//        dinBut = view.findViewById(R.id.button_diningroom_save)
//        kitBut = view.findViewById(R.id.button_kitchen_save)
//        homeBack = view.findViewById(R.id.imageku)

        universalCat = UniversalSaveFragment()
        childFragmentManager
            .beginTransaction()
            .replace(R.id.fl_save, universalCat)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .addToBackStack(null)
            .commit()
//
//        dinBut.setOnClickListener{
//            diningFragment = DiningSaveFragment()
//            childFragmentManager
//                .beginTransaction()
//                .replace(R.id.fl_save, diningFragment)
//                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                .commit()
//        }
//
////        homeBack.setOnClickListener{
////            universalCat = UniversalCategory()
////            childFragmentManager
////                .beginTransaction()
////                .replace(R.id.fl_save, universalCat)
////                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
////                .commit()
////
////        }
//
//        livBut.setOnClickListener{
//            livingFragment = LivingSaveFragment()
//            childFragmentManager
//                .beginTransaction()
//                .replace(R.id.fl_save, livingFragment)
//                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                .commit()
//        }
//
//        vgarBut.setOnClickListener{
//            vergarFragment = VerticalGarSaveFragment()
//            childFragmentManager
//                .beginTransaction()
//                .replace(R.id.fl_save, vergarFragment)
//                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                .commit()
//        }
//
//        kitBut.setOnClickListener{
//            kitchenFragment = KitchenSaveFragment()
//            childFragmentManager
//                .beginTransaction()
//                .replace(R.id.fl_save, kitchenFragment)
//                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                .commit()
//        }
//
//        bedBut.setOnClickListener{
//            bedFragment = BedroomSaveFragment()
//            childFragmentManager
//                .beginTransaction()
//                .replace(R.id.fl_save, bedFragment)
//                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                .commit()
//        }
//
//        batBut.setOnClickListener{
//            bathFragment = BathroomSaveFragment()
//            childFragmentManager
//                .beginTransaction()
//                .replace(R.id.fl_save, bathFragment)
//                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                .commit()
//        }
//
//        garBut.setOnClickListener{
//            gardenFragment = GardenSaveFragment()
//            childFragmentManager
//                .beginTransaction()
//                .replace(R.id.fl_save, gardenFragment)
//                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                .commit()
//        }
        return view
    }
////    private fun showRecyclerList(){
////        val activity = activity as Context
////        rvSave.layoutManager = GridLayoutManager(activity, 2)
////        val listContent = ListDataAppsAdapter(list)
////        rvSave.adapter = listContent
//    }
}