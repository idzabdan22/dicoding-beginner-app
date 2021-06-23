package com.example.houzzdicoding.PassingData

import com.example.houzzdicoding.Models.DataApps

class NewDataApps private constructor(){
    companion object{
        private var instance: NewDataApps? = null
        fun getInstance(): NewDataApps? {
            if (instance == null) instance = NewDataApps()
            return instance
        }
    }
    val saveall: ArrayList<DataApps> = ArrayList()
    val savebath: ArrayList<DataApps> = ArrayList()
    val savebed: ArrayList<DataApps> = ArrayList()
    val savekit: ArrayList<DataApps> = ArrayList()
    val savegar: ArrayList<DataApps> = ArrayList()
    val savevergar: ArrayList<DataApps> = ArrayList()
    val savedin: ArrayList<DataApps> = ArrayList()
    val saveliv: ArrayList<DataApps> = ArrayList()
    val add: Array<DataApps?> = arrayOfNulls<DataApps>(7)
    val designState = booleanArrayOf(false, false, false, false, false, false, false)
}