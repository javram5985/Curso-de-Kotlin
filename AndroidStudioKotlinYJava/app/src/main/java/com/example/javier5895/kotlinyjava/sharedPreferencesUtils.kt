package com.example.javier5895.kotlinyjava

import android.content.SharedPreferences

fun SharedPreferences.edit(func:SharedPreferences.Editor.() -> Unit){
    val editor = edit()
    editor.func()
    editor.apply()
}

//edit: https://developer.android.com/reference/android/content/SharedPreferences.html
//apply: https://developer.android.com/reference/android/content/SharedPreferences.Editor.html