package com.example.nav2

data class User(var name:String,var per:String){
    fun showInfo(): String{
        return name+" "+per
    }

}

