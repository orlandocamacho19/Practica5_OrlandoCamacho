package orlando.camacho.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.button_cold_drinks) as Button
        var btnHotDrinks: Button = findViewById(R.id.button_hot_drinks) as Button
        var btnSweets: Button = findViewById(R.id.button_sweets) as Button
        var btnSalties: Button = findViewById(R.id.button_salties) as Button
        var btnCombos: Button = findViewById(R.id.button_combos) as Button
        var btnCustom: Button = findViewById(R.id.button_custom) as Button

        btnCold.setOnClickListener {
            var intent : Intent = Intent(this, ProductsActivity::class.java)
            startActivity(intent)
        }

        btnHotDrinks.setOnClickListener {
            var intent : Intent = Intent(this, ProductsActivity::class.java)
            startActivity(intent)
        }

        btnSweets.setOnClickListener {
            var intent : Intent = Intent(this, ProductsActivity::class.java)
            startActivity(intent)
        }

        btnSalties.setOnClickListener {
            var intent : Intent = Intent(this, ProductsActivity::class.java)
            startActivity(intent)
        }


    }
}