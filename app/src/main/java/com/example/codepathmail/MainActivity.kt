package com.example.codepathmail

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var emails: MutableList<Email>
    lateinit var adapter: EmailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailsRv = findViewById<RecyclerView>(R.id.emailsRv)
        val loadMoreBtn = findViewById<Button>(R.id.loadMoreBtn)

        // Initial emails
        emails = EmailFetcher.getEmails()
        adapter = EmailAdapter(emails)

        emailsRv.adapter = adapter
        emailsRv.layoutManager = LinearLayoutManager(this)

        // Load More button
        loadMoreBtn.setOnClickListener {
            val newEmails = EmailFetcher.getNext5Emails()
            emails.addAll(newEmails)
            adapter.notifyDataSetChanged()
        }
    }
}
