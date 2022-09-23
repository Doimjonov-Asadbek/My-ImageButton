package app.test.myimagebutton

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnImage = findViewById<ImageButton>(R.id.btnImage)

        btnImage.setOnClickListener {
            Toast.makeText(this, "You Clicked Photo", Toast.LENGTH_SHORT).show()
        }

    }
}