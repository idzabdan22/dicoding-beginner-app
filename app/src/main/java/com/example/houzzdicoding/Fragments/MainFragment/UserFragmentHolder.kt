package com.example.houzzdicoding.Fragments.MainFragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentTransaction
import com.example.houzzdicoding.Activity.MainActivity
import com.example.houzzdicoding.R

class UserFragmentHolder : Fragment() {

    private lateinit var userfragment: UserFragment
    private lateinit var backbutton: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_user_holder, container, false)

        backbutton = view.findViewById(R.id.iv)

        backbutton.setOnClickListener{
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

        userfragment = UserFragment()
        childFragmentManager
            .beginTransaction()
            .replace(R.id.fl_user, userfragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
        return view
    }
}