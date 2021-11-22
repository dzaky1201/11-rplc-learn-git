package com.example.contohprojek

class Najwan(val umur: String, val tinggi: Int, val bb: Int) {
    fun BMI(){
        tinggi * tinggi / bb
    }
}

val Orang1 = Najwan("halo",170,60)

fun main(){
    println(Orang1.BMI())
}