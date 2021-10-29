package mx.edu.tecmm.moviles.listwiewlugares_06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    var lugares = arrayOf("Tequila", "Magdalena", "Quemada", "Arenal", "Amatitan","San Andres"
                            , "San juan", "Santa teresa", "Hosto", "lA Joya", "ojo Zarco", "Puerta de Medio")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView : ListView = findViewById(R.id.list_view_lugares);
        var txtLugar : TextView = findViewById(R.id.txtLugar);
        var adaptador = ArrayAdapter(this, R.layout.list_item,lugares);

        listView.adapter = adaptador;


        listView.onItemClickListener = object: AdapterView.OnItemClickListener {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, posicion: Int, p3: Long) {
                val item = listView.getItemAtPosition(posicion) as String
                Toast.makeText(applicationContext, "El item Seleccionado es: $item", Toast.LENGTH_LONG).show()
                txtLugar.text = item;
            }

        }

    }
}