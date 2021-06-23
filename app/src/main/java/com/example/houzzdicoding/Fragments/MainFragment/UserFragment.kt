package com.example.houzzdicoding.Fragments.MainFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.houzzdicoding.R

class UserFragment : Fragment() {

    private lateinit var logout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_user, container, false)

        logout = view.findViewById(R.id.logout)

        logout.setOnClickListener {
            activity?.moveTaskToBack(true)
            activity?.finish()
        }

        return view
    }

}