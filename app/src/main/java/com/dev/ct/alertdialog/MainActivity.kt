package com.dev.ct.alertdialog

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Objects

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // MainActivity içinde Toast ve AlertDialog kullanımına örnek basit Kotlin kodu
        Toast.makeText(this, "This is a toast message", Toast.LENGTH_SHORT).show()

    }
    // Bu fonksiyon, kullanıcıya "Save" işlemi için onay isteyen bir AlertDialog gösterir
   // Kullanıcı "Yes" derse "Saved" Toast mesajı gösterir
  // Kullanıcı "No" derse "Not Saved" Toast mesajı gösterir
    fun save(view: View){
        val  alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save")
        alert.setMessage("Are you sure?")

        alert.setPositiveButton("Yes") { dialog, _ ->
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
        }

        alert.setNegativeButton("No") {dialog,_->
            Toast.makeText(this, "Not Saved", Toast.LENGTH_SHORT).show() }


        alert.show()
    }

    fun click(view: View ){
        Toast.makeText(this, "Toast Button clicked!", Toast.LENGTH_LONG).show()
    }


}