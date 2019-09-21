package com.example.faddigital

import android.content.Context
import android.widget.Button
import android.widget.Toast

class BotaoIndice(context: Context?) : Button(context) {
     fun onClick(){
        Toast.makeText(context, "Funciona", Toast.LENGTH_SHORT).show()
    }
}
