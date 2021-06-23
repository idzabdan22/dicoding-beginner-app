package com.example.houzzdicoding.Fragments.MainFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.houzzdicoding.Models.DataApps
import com.example.houzzdicoding.PassingData.NewDataApps
import com.example.houzzdicoding.R

class AddMyHouseFragment : Fragment() {
    private lateinit var image_bath: ImageView
    private lateinit var image_bed: ImageView
    private lateinit var image_kitch: ImageView
    private lateinit var image_gar: ImageView
    private lateinit var image_liv: ImageView
    private lateinit var image_din: ImageView
    private lateinit var image_vergar: ImageView
    private lateinit var design: Array<DataApps?>
    private lateinit var findbut: Button



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_addmyhouse, container, false)

        design = NewDataApps.getInstance()!!.add
        findbut = view.findViewById(R.id.findprof)
        image_bath = view.findViewById(R.id.cardview_bathphotos)
        image_bed = view.findViewById(R.id.cardview_bedphotos)
        image_kitch = view.findViewById(R.id.cardview_kitphotos)
        image_gar   = view.findViewById(R.id.cardview_garphotos)
        image_din = view.findViewById(R.id.cardview_dinphotos)
        image_liv = view.findViewById(R.id.cardview_livphotos)
        image_vergar = view.findViewById(R.id.cardview_vgarphotos)


        findbut.setOnClickListener{
            Toast.makeText(activity, "Searching For Professional...", Toast.LENGTH_LONG).show()
        }

        if (design[0] != (null)){
            image_bath.setImageResource(design[0]!!.desImage)
        }
        if (design[1]!= (null)){
            image_bed.setImageResource(design[1]!!.desImage)
        }
        if (design[2]!= (null)){
            image_liv.setImageResource(design[2]!!.desImage)
        }
        if (design[3]!= (null)){
            image_din.setImageResource(design[3]!!.desImage)
        }
        if (design[4]!= (null)){
            image_gar.setImageResource(design[4]!!.desImage)
        }
        if (design[5]!= (null)){
            image_kitch.setImageResource(design[5]!!.desImage)
        }
        if (design[6]!= (null)){
            image_vergar.setImageResource(design[6]!!.desImage)
        }
        return view
    }
}