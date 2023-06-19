package be.jessevandenberghe.resume.seeds.me

import be.jessevandenberghe.resume.models.Address
import be.jessevandenberghe.resume.models.Profile

internal val MyResume.Companion.Profile: Profile
    get() = Profile(
        firstName = "Jesse",
        lastName = "Van Den Berghe",
        title = "Senior Android Developer",
        phone = "+32487602603",
        email = "jesse.vandenberghe95@gmail.com",
        home = Address(
            street = "Drieharingenstraat",
            number = "3(1)",
            postal = "3290",
            city = "Diest",
            country = "Belgium"
        )
    )