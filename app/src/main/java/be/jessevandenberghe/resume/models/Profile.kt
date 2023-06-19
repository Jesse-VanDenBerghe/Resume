package be.jessevandenberghe.resume.models

data class Profile(
    val firstName: String,
    val lastName: String,
    val title: String,
    val phone: String,
    val email: String
){
    companion object{
        val ME = Profile(
            firstName = "Jesse",
            lastName = "Van Den Berghe",
            title = "Senior Android Developer",
            phone = "+32487602603",
            email = "jesse.vandenberghe95@gmail.com"
        )
    }

    val fullName get() = "$firstName $lastName".trim()
}
