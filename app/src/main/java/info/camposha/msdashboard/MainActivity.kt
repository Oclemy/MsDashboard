package info.camposha.msdashboard

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        first.setOnClickListener {
            Toast.makeText(this@MainActivity, "First", Toast.LENGTH_SHORT).show()
        }
        second.setOnClickListener {
            Toast.makeText(this@MainActivity, "Second", Toast.LENGTH_SHORT).show()
        }
        third.setOnClickListener {
            Toast.makeText(this@MainActivity, "Third", Toast.LENGTH_SHORT).show()
        }
        fourth.setOnClickListener {
            Toast.makeText(this@MainActivity, "Fourth", Toast.LENGTH_SHORT).show()
        }
    }
}