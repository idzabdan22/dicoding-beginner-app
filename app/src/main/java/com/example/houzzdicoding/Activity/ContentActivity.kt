package com.example.houzzdicoding.Activity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.houzzdicoding.Fragments.MainFragment.DetailsHolderFragment
import com.example.houzzdicoding.Fragments.MainFragment.HomeFragment
import com.example.houzzdicoding.Models.DataApps
import com.example.houzzdicoding.PassingData.NewDataApps
import com.example.houzzdicoding.R

class ContentActivity : AppCompatActivity() {

    private lateinit var contentholder: DetailsHolderFragment
    private lateinit var fmlayout: FrameLayout
    private lateinit var backbutton: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        backbutton = findViewById(R.id.back_button)

        backbutton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        fmlayout = findViewById(R.id.fl_details)
        contentholder = DetailsHolderFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fl_details, contentholder)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
    }
}