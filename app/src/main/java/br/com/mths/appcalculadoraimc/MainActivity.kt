package br.com.mths.appcalculadoraimc

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = intent.getStringExtra("INTENT_NOME");
        val peso = intent.getStringExtra("INTENT_PESO");
        val altura = intent.getStringExtra("INTENT_ALTURA");
        /*
        val sharedPrefs = getSharedPreferences("cadastro_$nome", Context.MODE_PRIVATE);

        //val peso = sharedPrefs.getString("PESO", "");
        val peso = sharedPrefs.getInt("PESO", 0);
        //val altura = sharedPrefs.getString("ALTURA", "");
        val altura = sharedPrefs.getInt("ALTURA", 0);


        //exibir os valores na activity
        //val IMC = (peso.absoluteValue / (altura.absoluteValue * altura.absoluteValue));


         */
        //val IMC = peso / (altura*altura);
/*
        val alturaImc = altura.toString().toFloat() /100;
        val pesoImc = peso.toString().toFloat()
        val res = pesoImc/(alturaImc*alturaImc);

 */
        val pesoImc = peso.toString().toFloat()
        val alturaImc = altura.toString().toFloat() /100;
        val res = pesoImc /(alturaImc*alturaImc);
        edtMainNome.text = nome;
        //txtValorImcMain.text = IMC.toString();
        txtValorImcMain.text = "%.2f".format(res);
    }
}