package br.com.mths.appcalculadoraimc

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_info.*

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        btnCalcularInfo.setOnClickListener {

            val nome = edtNomeInfo.text.toString().trim();
            val peso = edtPesoInfo.text.toString();
            val altura = edtAlturaInfo.text.toString();

           /* if (nome.isEmpty() || peso == 0 || altura == 0) {
                Toast.makeText(this, "Preencha todos os dados corretamenta", Toast.LENGTH_LONG)
                    .show();
            } else {
                val sharedPrefs = getSharedPreferences("cadastro_$nome", Context.MODE_PRIVATE);

                val editPrefs = sharedPrefs.edit();

                editPrefs.putString("NOME", nome);
                //editPrefs.putString("PESO", peso);
                editPrefs.putString("PESO", peso.toString())
                editPrefs.putString("ALTURA", altura.toString());

                editPrefs.apply();
*/
                val mIntent = Intent(this, MainActivity::class.java)

                mIntent.putExtra("INTENT_NOME", nome);
                mIntent.putExtra("INTENT_PESO", peso);
                mIntent.putExtra("INTENT_ALTURA", altura);

                startActivity(mIntent);

                finishAffinity();
            }
        }
    }


//}