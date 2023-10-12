package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class Spinner : AppCompatActivity() {
    var spinner = findViewById<Spinner>(R.id.spinner)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
    }
}

//        val spinner = Spinner(this)
//        // Create an ArrayAdapter
//        val array = arrayOf(10,20)
//        val adapter = ArrayAdapter.createFromResource(
//            this,
//            array, android.R.layout.simple_spinner_item
//        )
        // Specify the layout to use when the list of choices appears
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        // Apply the adapter to the spinner
//        spinner.adapter = adapter
//
//    }

//    fun getValues(view: View) {
//        Toast.makeText(this, "Spinner 1 " + spinner.selectedItem.toString(), Toast.LENGTH_LONG)
//            .show()
//    }
//}



//
//
//    val languages = resources.getStringArray(R.array.cities)
//
//    // access the spinner
//    val spinner = findViewById<View>(R.id.spinner)
//    if (spinner != null) {
//        val adapter = ArrayAdapter(this,
//            android.R.layout.simple_spinner_item, languages)
//        spinner.adapter = adapter
//Spinner.
//        spinner.onItemSelectedListener = object :
//            AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>,
//                                        view: View, position: Int, id: Long) {
//                Toast.makeText(this@Spinner,
//                    getString(R.string.app_name) + " " +
//                            "" + languages[position], Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>) {
//                // write code to perform some action
//            }
//        }

