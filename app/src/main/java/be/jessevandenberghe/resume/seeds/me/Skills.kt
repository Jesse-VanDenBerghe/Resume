package be.jessevandenberghe.resume.seeds.me

import be.jessevandenberghe.resume.models.Skill
import be.jessevandenberghe.resume.models.SkillPackage

internal val MyResume.Companion.Skills: List<SkillPackage>
    get() = listOf(
        SkillPackage(
            title = "Android",
            skills = listOf(
                Skill(name = "Mobile", level = Skill.Levels.EXPERT),
                Skill(name = "TV", level = Skill.Levels.MEDIOR),
                Skill(name = "Automotive", level = Skill.Levels.MEDIOR)
            )
        ),
        SkillPackage(
            title = "Programming",
            skills = listOf(
                Skill(name = "Git", level = Skill.Levels.SENIOR),
                Skill(name = "CI/CD", level = Skill.Levels.MEDIOR),
                Skill(name = "Kotlin", level = Skill.Levels.EXPERT),
                Skill(name = "Java", level = Skill.Levels.SENIOR),
                Skill(name = "XML", level = Skill.Levels.EXPERT)
            )
        ),
        SkillPackage(
            title = "Languages",
            skills = listOf(
                Skill(name = "Dutch", level = Skill.Levels.EXPERT),
                Skill(name = "English", level = Skill.Levels.SENIOR),
                Skill(name = "French", level = Skill.Levels.BEGINNER)
            )
        )
    )