package be.jessevandenberghe.resume.models

data class Profile(
    val firstName: String,
    val lastName: String,
    val title: String,
    val phone: String,
    val email: String,
    val home: Address
) {
    val fullName by lazy { "$firstName $lastName" }
}
