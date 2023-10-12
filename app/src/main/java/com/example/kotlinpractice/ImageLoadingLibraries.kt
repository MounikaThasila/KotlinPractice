package com.example.kotlinpractice

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class ImageLoadingLibraries : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
     var  a =10
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.imageloginglibraries)
        val imageForLoading : ImageView = findViewById(R.id.Image)

        Picasso.with(this)
            .load("https://media.geeksforgeeks.org/wp-content/cdn-uploads/logo-new-2.svg")
            .into(imageForLoading)



    }
    fun sample(){
        print("fjhbjvb")
    }
    class NestedClass{
        var obj = ImageLoadingLibraries()
        var b = 20
        fun sample2(){
            print(obj.a)
            print("dbhshbsd ")
        }
    }
}

fun main(){
    val onj = ImageLoadingLibraries()

    print(onj.a)
    onj.sample()

print("dsvc"+ImageLoadingLibraries.NestedClass().b)

}