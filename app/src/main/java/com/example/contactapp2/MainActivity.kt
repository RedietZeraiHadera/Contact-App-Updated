package com.example.contactapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        val contact1 = ContactData("Rediet Zerai","0927444862","redietzerai@gmail.com","https://images.unsplash.com/photo-1542727313-4f3e99aa2568?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8cHJvZmlsZSUyMHBpY3R1cmVzJTIwZm9yJTIwYmxhY2tzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact2=ContactData("Rediet","0927444862","redietzerai@gmail.com","https://images.unsplash.com/photo-1506863530036-1efeddceb993?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8cHJvZmlsZSUyMHBpY3R1cmVzJTIwZm9yJTIwYmxhY2tzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact3 = ContactData("Mihireteab Zerai","0927444862","redietzerai@gmail.com","https://images.unsplash.com/photo-1508184964240-ee96bb9677a7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cHJvZmlsZSUyMHBpY3R1cmVzJTIwZm9yJTIwYmxhY2tzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact4 = ContactData("Zerai Hadera","0927444862","redietzerai@gmail.com","https://images.unsplash.com/photo-1531299983330-093763e1d963?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8cHJvZmlsZSUyMHBpY3R1cmVzJTIwZm9yJTIwYmxhY2tzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60")
        val contact5 = ContactData("Zinash Zerihun","0927444862","redietzerai@gmail.com","https://images.unsplash.com/photo-1527203561188-dae1bc1a417f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fHByb2ZpbGUlMjBwaWN0dXJlcyUyMGZvciUyMGJsYWNrc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60")
        val contactLists = mutableListOf(contact1,contact2,contact3,contact4,contact5)
        val contactAdapter = ContactAdapter(contactLists)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter
    }

}
