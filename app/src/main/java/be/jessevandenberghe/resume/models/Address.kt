package be.jessevandenberghe.resume.models

data class Address(
    val street: String,
    val number: String,
    val postal: String,
    val city: String,
    val country: String
) {
    val formatted by lazy { "$street $number\n$postal $city, $country" }
}
