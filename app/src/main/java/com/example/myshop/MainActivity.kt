package com.example.myshop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User(1,"Annie Kobia","+254785464376","kobiaannie@gmail.com",'F', "2018-5-5")
        val supplier = Supplier(1,null,"Wimbi","+254785464376")
        val supplierTwo = Supplier(2,"Wimbi Flour","Wimbi","+254785464376")
        val product = Product(1,"Milk",34.0, "Litres",null)


        //Multiple Inheritance
        val person = Person("Annie","African")
        person.backbone()
        person.noOfFeet
        person.movement()
        person.forAndWhileLoop()
    }
}