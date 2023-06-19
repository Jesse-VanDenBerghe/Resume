package be.jessevandenberghe.resume.seeds.me

import be.jessevandenberghe.resume.models.Resume

class MyResume : Resume(
    profile = MyResume.Profile,
    skills = MyResume.Skills,
    links = MyResume.Links,
    bio = MyResume.Bio,
    employment = MyResume.Employment,
    education = MyResume.Education,
    hobbies = MyResume.Hobbies
) {
    companion object
}
