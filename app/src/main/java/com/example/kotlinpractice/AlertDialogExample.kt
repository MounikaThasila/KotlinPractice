package com.example.kotlinpractice

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import cn.pedant.SweetAlert.SweetAlertDialog


class AlertDialogExample : AppCompatActivity() {
        @SuppressLint("WrongViewCast")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.alertdialoge)

//            /*Alert Dialog Box and How to create it*/
            val btn = findViewById<Button>(R.id.clickButton)
            btn.setOnClickListener {
                val builder = AlertDialog.Builder(this)
                //set title for alert dialog
                builder.setTitle("dialogTitle")
                //set message for alert dialog
                builder.setMessage("dialogMessage")
                builder.setIcon(android.R.drawable.ic_dialog_alert)

                //performing positive action
                builder.setPositiveButton("Yes") { dialogInterface, which ->
                    Toast.makeText(applicationContext, "clicked yes", Toast.LENGTH_LONG).show()
                }
                //performing cancel action
                builder.setNeutralButton("Cancel") { dialogInterface, which ->
                    Toast.makeText(applicationContext, "clicked cancel   ", Toast.LENGTH_LONG)
                        .show()
                }
                //performing negative action
                builder.setNegativeButton("No") { dialogInterface, which ->
                    Toast.makeText(applicationContext, "clicked No", Toast.LENGTH_LONG).show()
                }
                // Create the AlertDialog
                val alertDialog : AlertDialog = builder.create()
                // Set other dialog properties
                alertDialog.setCancelable(false)
                alertDialog.show()
                alertDialog.window?.setGravity(Gravity.LEFT);
            }

//            /*How to create a custom AlertDialog in Android*/

//            btn.setOnClickListener{
//                SweetAlertDialog(this,SweetAlertDialog.NORMAL_TYPE).setTitleText("vdbhjbd").show()
//            }




        }
        }