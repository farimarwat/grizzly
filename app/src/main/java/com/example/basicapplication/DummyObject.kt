package com.example.basicapplication

object DummyObject {
    lateinit var data:String
    fun initialize(){
        for (i in 0..5){
            Thread.sleep(1000)
        }
        data = "initialized"
    }
}