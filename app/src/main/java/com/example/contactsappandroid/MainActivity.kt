package com.example.contactsappandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsappandroid.adapter.ContactAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactAdapter(getSampleContacts())
    }

    private fun getSampleContacts(): List<Contact> {
        // Create and return a list of sample contacts here
        val contacts = mutableListOf<Contact>()
        contacts.add(Contact("Mahek", "1234567890", "Mahek@example.com"))
        contacts.add(Contact("Rohan", "9876543210", "Rohan@example.com"))
        return contacts
    }
}
