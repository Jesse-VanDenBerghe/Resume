package be.jessevandenberghe.resume.models

data class SkillPackage(
    val title: String,
    val skills: List<Skill>
)

data class Skill(
    val name: String,
    val level: Levels
){
    companion object{
        val MAX_LEVEL = Levels.values().size - 1
    }
  enum class Levels {
      NONE,
      BEGINNER,
      MEDIOR,
      SENIOR,
      EXPERT
  }
}
