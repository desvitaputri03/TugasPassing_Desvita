package com.Mobile_Desvita

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tugasmobileyuni.R

class MainActivity : AppCompatActivity() {
    private lateinit var eUser: EditText
    private lateinit var ePassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnList: Button
    private lateinit var btnRecycle: Button
    private lateinit var btnBuah: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menghubungkan variabel dengan view di layout
        eUser = findViewById(R.id.eUser)
        ePassword = findViewById(R.id.ePassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnList = findViewById(R.id.btnList)
        btnRecycle = findViewById(R.id.btnRecycle)
        btnBuah = findViewById(R.id.btnBuah)

        // Fungsi tombol login
        btnLogin.setOnClickListener {
            val nUsername = eUser.text.toString()
            val nPassword = ePassword.text.toString()

            val intentPassingData = Intent(this@MainActivity, WelcomePageActivity::class.java)
            intentPassingData.putExtra("username", nUsername)
            intentPassingData.putExtra("password", nPassword)

            Log.d("cek data username", nUsername)
            Log.d("cek data password", nPassword)

            startActivity(intentPassingData)
        }

        // Fungsi tombol List untuk berpindah ke ListViewActivity
        btnList.setOnClickListener {
            val intent = Intent(this@MainActivity, ListViewActivity::class.java)
            startActivity(intent)
        }

        // Fungsi tombol Recycle untuk berpindah ke RecyclerViewActivity
        btnRecycle.setOnClickListener {
            val intent = Intent(this@MainActivity, RecycleViewAtcivity::class.java)
            startActivity(intent)
        }

        // Fungsi tombol Buah untuk berpindah ke ReycleBuahImageActivity
        btnBuah.setOnClickListener {
            val intent = Intent(this@MainActivity, RecycleBuahImageActivity::class.java)
            startActivity(intent)
        }

        // Menyelaraskan padding untuk mengakomodasi window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
