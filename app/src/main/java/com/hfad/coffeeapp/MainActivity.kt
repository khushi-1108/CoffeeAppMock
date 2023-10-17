package com.hfad.coffeeapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference to "Order" buttons for coffee items
        val orderButton1 = findViewById<Button>(R.id.orderButton1)
        val orderButton2 = findViewById<Button>(R.id.orderButton2)

        // Set click listeners for the "Order" buttons
        orderButton1.setOnClickListener {
            // Handle the order for Coffee 1
            // You can add your order processing logic here
        }
        orderButton2.setOnClickListener {
            // Handle the order for Coffee 2
            // You can add your order processing logic here
        }

        // Add more click listeners for other coffee items as needed
    }
}
