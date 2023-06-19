package be.jessevandenberghe.resume.ui.screens.cv

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import be.jessevandenberghe.resume.models.Skill
import be.jessevandenberghe.resume.models.SkillPackage

@Composable
fun SkillSection(
    skillPackages: List<SkillPackage>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        if (skillPackages.isNotEmpty()) {
            Text(
                text = "Skills",
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(16.dp))
            SkillPackageList(skillPackages)
        }
    }

}

@Composable
private fun SkillPackageList(
    skillPackages: List<SkillPackage>,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(skillPackages) {skillPackage ->
            Column {
                Text(
                    text = skillPackage.title,
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = MaterialTheme.typography.labelLarge
                )
                SkillList(skillPackage.skills)
            }
        }
    }
}

@Composable
private fun SkillList(skills: List<Skill>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .padding(vertical = 8.dp)
    ) {
        skills.forEach { skill: Skill ->
            SkillItem(skill)
        }
    }
}

@Composable
private fun SkillItem(skill: Skill) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = skill.name,
            color = MaterialTheme.colorScheme.onPrimary.copy(
                alpha = .8f
            ),
            style = MaterialTheme.typography.labelMedium.copy(
                fontWeight = FontWeight.Normal
            )
        )
        Spacer(modifier = Modifier.height(4.dp))
        LinearProgressIndicator(
            progress = (skill.level.ordinal / Skill.MAX_LEVEL.toFloat()),
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.fillMaxWidth()
        )
    }
}