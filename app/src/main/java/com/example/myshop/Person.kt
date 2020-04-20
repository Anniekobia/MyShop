package com.example.myshop

class Person(val name: String, val race: String) : Mammal(2) {

    //for and while loop
    fun forAndWhileLoop() {
        //For loop to iterate through 100 with a stepper of 5
        for (i in 0..100 step 5)
            print(i)
        //While loop to iterate through 100 with a stepper of 5
        var i = 0
        while (i <= 100) {
            println("i")
            i += 5
        }
        //iterate and print items in an array of strings
        var subjects = arrayOf("Math", "English", "Science")
        for (item in subjects)
            println(item)
        //iterate and print items in an array of numbers
        var numbers = arrayOf(1, 2, 3)
        for (item in numbers)
            println(item)
    }


}