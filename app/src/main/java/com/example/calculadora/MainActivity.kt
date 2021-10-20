package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculo.setOnClickListener {
            calcular()
        }
    }
    fun calcular(){
        val nText = binding.digitaNumeros1.text.toString()
        val numero1 = nText.toDouble()
        val nText2 = binding.digitaNumeros2.text.toString()
        val numero2 = nText2.toDouble()
        val selecao = binding.operacoes.checkedRadioButtonId
        val resultado = when (selecao){
            R.id.divisao -> numero1 / numero2
            R.id.multiplicacao -> numero1 * numero2
            R.id.soma -> numero1 + numero2
            else -> numero1 - numero2
        }
        binding.resultado.text = resultado.toString()
    }
}