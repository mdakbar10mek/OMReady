package com.omready

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCreateKey = findViewById<Button>(R.id.btnCreateKey)
        val btnScanSheet = findViewById<Button>(R.id.btnScanSheet)
        val btnViewResults = findViewById<Button>(R.id.btnViewResults)

        btnCreateKey.setOnClickListener {
            startActivity(Intent(this, CreateKeyActivity::class.java))
        }

        btnScanSheet.setOnClickListener {
            startActivity(Intent(this, ScanSheetActivity::class.java))
        }

        btnViewResults.setOnClickListener {
            startActivity(Intent(this, ViewResultsActivity::class.java))
        }
    }
}
