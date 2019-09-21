package com.example.faddigital

import android.content.Context
import android.widget.Button
import android.widget.Toast

class BotaoIndice constructor(var c: Context ,var bt : Button){
    fun onClick(){
        Toast.makeText(c, "Funciona", Toast.LENGTH_SHORT).show()
    }
}
