package com.example.houzzdicoding.Fragments.MainFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction
import com.example.houzzdicoding.Fragments.HomeFragment.*
import com.example.houzzdicoding.Fragments.HomeFragment.UniversalCategory
import com.example.houzzdicoding.R

class HomeFragment : Fragment() {

    private lateinit var imgButton: ImageView
    private lateinit var universalCat: UniversalCategory
    private lateinit var livingFragment: Living
    private lateinit var diningFragment: Dining
    private lateinit var gardenFragment: Garden
    private lateinit var bathFragment: Bathroom
    private lateinit var bedFragment: Bedroom
    private lateinit var vergarFragment: VerticalGarden
    private lateinit var kitchenFragment: Kitchen
    private lateinit var batBut: TextView
    private lateinit var bedBut: TextView
    private lateinit var livBut: TextView
    private lateinit var garBut: TextView
    private lateinit var vgarBut: TextView
    private lateinit var dinBut: TextView
    private lateinit var kitBut: TextView
    private lateinit var homeBack: ImageView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        batBut = view.findViewById(R.id.button_bathroom)
        bedBut = view.findViewById(R.id.button_bedroom)
        livBut = view.findViewById(R.id.button_livingroom)
        garBut = view.findViewById(R.id.button_Garden)
        vgarBut = view.findViewById(R.id.button_verGarden)
        dinBut = view.findViewById(R.id.button_diningroom)
        kitBut = view.findViewById(R.id.button_kitchen)
        homeBack = view.findViewById(R.id.imageku)


        universalCat = UniversalCategory()
        childFragmentManager
            .beginTransaction()
            .replace(R.id.fl_home, universalCat)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

        dinBut.setOnClickListener{
            diningFragment = Dining()
            childFragmentManager
                .beginTransaction()
                .replace(R.id.fl_home, diningFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
        }

        homeBack.setOnClickListener{
            universalCat = UniversalCategory()
            childFragmentManager
                .beginTransaction()
                .replace(R.id.fl_home, universalCat)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()

        }

        livBut.setOnClickListener{
            livingFragment = Living()
            childFragmentManager
                .beginTransaction()
                .replace(R.id.fl_home, livingFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
        }

        vgarBut.setOnClickListener{
            vergarFragment = VerticalGarden()
            childFragmentManager
                .beginTransaction()
                .replace(R.id.fl_home, vergarFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
        }

        kitBut.setOnClickListener{
            kitchenFragment = Kitchen()
            childFragmentManager
                .beginTransaction()
                .replace(R.id.fl_home, kitchenFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
        }

        bedBut.setOnClickListener{
            bedFragment = Bedroom()
            childFragmentManager
                .beginTransaction()
                .replace(R.id.fl_home, bedFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
        }

        batBut.setOnClickListener{
            bathFragment = Bathroom()
            childFragmentManager
                .beginTransaction()
                .replace(R.id.fl_home, bathFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
        }

        garBut.setOnClickListener{
            gardenFragment = Garden()
            childFragmentManager
                .beginTransaction()
                .replace(R.id.fl_home, gardenFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
        }
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}