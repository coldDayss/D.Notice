package com.example.dnotice

fun main(){

    forAndWhile()

}

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,3,4)

    val array2 = arrayOf(1, "3", 2, "apple")
    val list2 = listOf(1,2.3, "23", "D")

    array[1] = 34


    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(30)
}

fun forAndWhile(){

    val students = arrayListOf<String>("a", "b", "c", "d")

    for( name in students){
        println("${name}")
    }

    var sum : Int = 0

    for( i in 1 until 100){
        sum += i

    }
    println("${sum}")

    var index = 0
    while (index<10){
        ++index
        println("current index is ${index}")
    }


}