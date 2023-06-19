package be.jessevandenberghe.resume.models

open class Resume(
    val profile: Profile,
    val skills: List<SkillPackage> = emptyList(),
    val links: List<Link> = emptyList(),
    val bio: String,
    val employment: History,
    val education: History,
    val hobbies: List<String>
)