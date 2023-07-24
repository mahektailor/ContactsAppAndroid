package com.example.contactsappandroid

class ContactModel(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,
    val email: String,
    val address: String,
    val zipCode: String,
    val url: String,
    val birthday: String,
    val socialProfiles: String,
    val notes: String
) {
    override fun toString(): String {
        return "$firstName $lastName"
    }
}
