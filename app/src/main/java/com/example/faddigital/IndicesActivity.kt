package com.example.faddigital

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast.makeText
import android.widget.Toast.LENGTH_SHORT

class IndicesActivity : AppCompatActivity() {

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

        btFecha.setOnClickListener()
        {
            makeText(this, "Vai fechar nada não", LENGTH_SHORT).show()
        }
        btA1.setOnClickListener()
        {
            makeText(this, "Categoria A1", LENGTH_SHORT).show()
        }
        btA2.setOnClickListener()
        {
            makeText(this, "Categoria A2", LENGTH_SHORT).show()
        }
        btB.setOnClickListener()
        {
            makeText(this, "Categoria B", LENGTH_SHORT).show()
        }
        btC.setOnClickListener()
        {
            makeText(this, "Categoria C", LENGTH_SHORT).show()
        }
        btD1.setOnClickListener()
        {
            makeText(this, "Categoria D1", LENGTH_SHORT).show()
        }
        btD2.setOnClickListener()
        {
            makeText(this, "Marcelo D2, lixo!", LENGTH_SHORT).show()
        }
        btE.setOnClickListener()
        {
            makeText(this, "ÉÉÉÉÉ", LENGTH_SHORT).show()
        }
        btTrata.setOnClickListener()
        {
            makeText(this, "Toma seu remédio", LENGTH_SHORT).show()
        }

    }

/*    */
}
