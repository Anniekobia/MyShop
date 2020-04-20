package com.example.myshop

/**
 * Mammal class that inherits from Vertebrate
 */
open class Mammal (val noOfFeet: Int): Vertebrate() {
    fun movement(){
        print("Movement by Locomotion using my "+noOfFeet+" feet")
    }
}