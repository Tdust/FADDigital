package com.example.faddigital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.makeText

class IndicesActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indices)
        val btFecha: Button = findViewById(R.id.btFechamento)
        val btA1: Button = findViewById(R.id.btA1)
        val btA2: Button = findViewById(R.id.btA2)
        val btB: Button = findViewById(R.id.btB)
        val btC: Button = findViewById(R.id.btC)
        val btD1: Button = findViewById(R.id.btD1)
        val btD2: Button = findViewById(R.id.btD2)
        val btE: Button = findViewById(R.id.btE)
        val btTrata: Button = findViewById(R.id.btTratamento)

        }

    override fun onClick(p0: View?) {
        var texto = when(p0?.getId())
        {
            R.id.btA2 -> "Adicionado deposito A1"
            R.id.btA2 -> "Adicionado deposito A"
            R.id.btB -> "Adicionado deposito B"
            R.id.btC -> "Adicionado deposito C"
            R.id.btD1 -> "Adicionado deposito D1"
            R.id.btD2 -> "Adicionado deposito D2"
            R.id.btE -> "Adicionado deposito E"
            R.id.btTratamento -> "Aopersistiremossintomas,omedicodeveraserconsultado"
            R.id.btFechamento -> "Eh nois e a gente"
            else -> "Comassim?"
        }
        Toast.makeText(this, ""+texto, Toast.LENGTH_SHORT).show()
    }
}
