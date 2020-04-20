package com.example.myshop

open class Mammal (val noOfFeet: Int): Vertebrate() {
    fun movement(){
        print("Movement by Locomotion using my "+noOfFeet+" feet")
    }
    override fun backbone(){
        print("I have a spinal cord surrounded by cartilage")
    }
}