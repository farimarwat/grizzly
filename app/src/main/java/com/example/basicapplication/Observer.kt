package com.example.basicapplication

interface Observer<T> {
    fun whenAppReady(obj : T?)
}
class Subject<T>{
    var mObserver:Observer<T>? = null
    var data : T? = null
        set(value){
            field  = value
            notifyObserver()
        }
    fun addObserver(observer: Observer<T>){
        mObserver = observer
    }
    fun notifyObserver(){
        mObserver?.whenAppReady(data)
    }
}
