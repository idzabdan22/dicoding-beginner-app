package com.example.houzzdicoding.Fragments.MainFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.houzzdicoding.Models.DataApps
import com.example.houzzdicoding.PassingData.NewDataApps
import com.example.houzzdicoding.R


class DetailsHolderFragment : Fragment() {
//Content Data
    private lateinit var image_content: ImageView
    private lateinit var desc_content: TextView
    private lateinit var title_content: TextView
    private lateinit var cat_content: TextView
    private lateinit var user_photos: ImageView
    private lateinit var user_names: TextView
//End Content Data
// Activity Button
    private lateinit var save_button: Button
    private lateinit var addmyhouse_button: Button
//End Activity Button

    //Class Import
    private lateinit var newDataApps: DataApps
    private lateinit var dataApps: NewDataApps
//End Class Import

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_details_holder, container, false)

        image_content = view.findViewById(R.id.content_img)
        title_content = view.findViewById(R.id.judul_design)
        desc_content = view.findViewById(R.id.desc_text)
        cat_content = view.findViewById(R.id.category)

        user_photos = view.findViewById(R.id.userphoto)
        user_names = view.findViewById(R.id.namauser)

        save_button = view.findViewById(R.id.save_but_content)
        addmyhouse_button = view.findViewById(R.id.addmyhouse_but)

        val bundle: Bundle?= activity!!.intent.extras
        val contentimg: Int = bundle!!.getInt("content_image")
        val userimg: Int = bundle!!.getInt("user_image")

        val title: String ?= activity!!.intent.getStringExtra("content_title")
        val desc: String ?= activity!!.intent.getStringExtra("content_desc")
        val cat: String ?= activity!!.intent.getStringExtra("category")
        val names: String ?= activity!!.intent.getStringExtra("user_name")

        title_content.text = title
        desc_content.text = desc
        cat_content.text = cat
        user_names.text = names
        user_photos.setImageResource(userimg)
        image_content.setImageResource(contentimg)

        save_button.setOnClickListener{
            if(cat.equals("Bathroom")){
                newDataApps = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                NewDataApps.getInstance()!!.saveall.add(newDataApps)
                NewDataApps.getInstance()!!.savebath.add(newDataApps)
            }
            else if(cat.equals("Bedroom")){
                newDataApps = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                NewDataApps.getInstance()!!.saveall.add(newDataApps)
                NewDataApps.getInstance()!!.savebed.add(newDataApps)
            }
            else if(cat.equals("Living Room")){
                newDataApps = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                NewDataApps.getInstance()!!.saveall.add(newDataApps)
                NewDataApps.getInstance()!!.saveliv.add(newDataApps)
            }
            else if(cat.equals("Garden")){
                newDataApps = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                NewDataApps.getInstance()!!.saveall.add(newDataApps)
                NewDataApps.getInstance()!!.savegar.add(newDataApps)
            }
            else if(cat.equals("Vertical Garden")){
                newDataApps = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                NewDataApps.getInstance()!!.saveall.add(newDataApps)
                NewDataApps.getInstance()!!.savevergar.add(newDataApps)
            }
            else if(cat.equals("Dining Room")){
                newDataApps = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                NewDataApps.getInstance()!!.saveall.add(newDataApps)
                NewDataApps.getInstance()!!.savedin.add(newDataApps)
            }
            else if(cat.equals("Kitchen")){
                newDataApps = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                NewDataApps.getInstance()!!.saveall.add(newDataApps)
                NewDataApps.getInstance()!!.savekit.add(newDataApps)
            }
            Toast.makeText(activity, "Succesfully Added To Save!", Toast.LENGTH_SHORT).show()
        }

        addmyhouse_button.setOnClickListener{
            if(cat.equals("Bathroom")){
                NewDataApps.getInstance()!!.add[0] = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                if(NewDataApps.getInstance()!!.designState[0] == false){
                }
                NewDataApps.getInstance()!!.designState[0] = true
            }
            else if(cat.equals("Bedroom")){
                NewDataApps.getInstance()!!.add[1] = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                if(NewDataApps.getInstance()!!.designState[1] == false){
                }
                NewDataApps.getInstance()!!.designState[1] = true
            }
            else if(cat.equals("Living Room")){
                NewDataApps.getInstance()!!.add[2] = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                if(NewDataApps.getInstance()!!.designState[2] == false){
                }
                NewDataApps.getInstance()!!.designState[2] = true
            }
            else if(cat.equals("Dining Room")){
                NewDataApps.getInstance()!!.add[3] = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                if(NewDataApps.getInstance()!!.designState[3] == false){
                }
                NewDataApps.getInstance()!!.designState[3] = true
            }
            else if(cat.equals("Garden")){
                NewDataApps.getInstance()!!.add[4] = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                if(NewDataApps.getInstance()!!.designState[4] == false){
                }
                NewDataApps.getInstance()!!.designState[4] = true
            }
            else if(cat.equals("Kitchen")){
                NewDataApps.getInstance()!!.add[5] = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                if(NewDataApps.getInstance()!!.designState[5] == false){
                }
                NewDataApps.getInstance()!!.designState[5] = true
            }
            else if(cat.equals("Vertical Garden")){
                NewDataApps.getInstance()!!.add[6] = DataApps(title.toString(), contentimg, desc.toString(), names.toString(), userimg, cat.toString())
                if(NewDataApps.getInstance()!!.designState[6] == false){
                }
                NewDataApps.getInstance()!!.designState[6] = true
            }
            Toast.makeText(activity, "Succesfully Added To MyHouse!", Toast.LENGTH_SHORT).show()
        }
        return view
    }

}