package com.example.houzzdicoding.Activity

import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.houzzdicoding.Fragments.MainFragment.*
import com.example.houzzdicoding.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var btmNav: BottomNavigationView
    private lateinit var frameLayout: FrameLayout

    private lateinit var addmyhouseholderFragment: AMHHolderFragment
    private lateinit var homeFragmentFragment: HomeFragment
    private lateinit var userFragment: UserFragmentHolder
    private lateinit var saveFragment: SaveFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btmNav = findViewById(R.id.bot_nav)
        frameLayout = findViewById(R.id.frame_layout)

        homeFragmentFragment = HomeFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout, homeFragmentFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .addToBackStack(null)
            .commit()

        btmNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId){
                R.id.homeBut_menu ->{
                    homeFragmentFragment = HomeFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, homeFragmentFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .addToBackStack(null)
                        .commit()
                }
                R.id.myhouseBut_menu ->{
                    addmyhouseholderFragment = AMHHolderFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, addmyhouseholderFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .addToBackStack(null)
                        .commit()
                }
                R.id.saveBut_menu ->{
                    saveFragment = SaveFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, saveFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .addToBackStack(null)
                        .commit()
                }
                R.id.userBut_menu ->{
                    userFragment = UserFragmentHolder()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, userFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .addToBackStack(null)
                        .commit()
                }
            }
            true
        }
    }
}