package com.example.codepathmail

class EmailFetcher {

    companion object {

        val senders = listOf(
            "Dahlia Cline","Kevin Miranda","Kaya Austin","Laila Calderon",
            "Marquise Rhodes","Fletcher Patel","Luz Barron","Kamren Dudley",
            "Jairo Foster","Lilah Sandoval"
        )

        val title = "Welcome to Kotlin!"
        val summary = "Welcome to the Android Kotlin Course! We're excited to have you join us."

        fun getEmails(): MutableList<Email> {
            val emails = mutableListOf<Email>()

            for (i in 0..4) {
                emails.add(Email(senders[i], title, summary))
            }

            return emails
        }

        fun getNext5Emails(): MutableList<Email> {
            val emails = mutableListOf<Email>()

            for (i in 5..9) {
                emails.add(Email(senders[i], title, summary))
            }

            return emails
        }
    }
}
