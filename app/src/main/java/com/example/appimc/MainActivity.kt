package com.example.appimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()

    }

  private fun setListeners(){

      campoPeso?.doAfterTextChanged { text -> Toast.makeText(this
          ,text.toString(),Toast.LENGTH_SHORT).show() }

      campoAltura?.doAfterTextChanged { text -> Toast.makeText(this
          ,text.toString(),Toast.LENGTH_SHORT).show() }

      BotaoIMC.setOnClickListener{
          calcular(campoAltura.text.toString(), campoPeso.text.toString())
      }
  }

    private fun calcular(altura: String, peso: String){
     //declarando variáveis

        val altura = altura.toFloatOrNull()
        val peso = peso.toFloatOrNull()

        //checando nulidade
        if (peso != null && altura != null){
            //fazendo a função e alterando na view
            val imc = peso / (altura * altura)

            if (imc < 18.5){
                mensagem01.text = "Seu IMC é %.2f - Abaixo do peso".format(imc)

            }
            if (imc > 18.5 && imc < 24.9){
                mensagem01.text = "Seu IMC é %.2f - Peso ideal".format(imc)

            }
            if (imc > 25.0 && imc < 29.9){
                mensagem01.text = "Seu IMC é %.2f - Levemente acima do peso".format(imc)

            }
            if (imc > 30.0 && imc < 34.9){
                mensagem01.text = "Seu IMC é %.2f - Obesidade grau I".format(imc)

            }
            if (imc > 35.0 && imc < 39.9){
                mensagem01.text = "Seu IMC é %.2f - Obesidade grau II".format(imc)

            }
            if (imc > 40.0){
                mensagem01.text = "Seu IMC é %.2f - Obesidade grau III".format(imc)

            }
        }
    }

}



