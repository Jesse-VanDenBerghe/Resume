package be.jessevandenberghe.resume.ui.screens.cv

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import be.jessevandenberghe.resume.models.Resume
import be.jessevandenberghe.resume.seeds.me.MyResume
import be.jessevandenberghe.resume.ui.theme.Colors

@Composable
fun CvScreen(
    resume: Resume = MyResume()
) {
    Row {
        Column(
            modifier = Modifier
                .weight(3 / 10f)
                .fillMaxHeight()
                .shadow(
                    elevation = 8.dp,
                    clip = false,
                    spotColor = Colors.DARK_BLUE,
                    ambientColor = Colors.DARK_BLUE
                )
                .background(Colors.DARK_BLUE)
                .padding(16.dp)

        ) {
            ProfileSection(
                profile = resume.profile,
                modifier = Modifier
                    .weight(1 / 3f)
                    .padding(16.dp)
                    .fillMaxWidth()
            )
            Divider(
                color = Colors.WHITE.copy(alpha = .2f),
                thickness = 1.dp,
                modifier = Modifier.padding(vertical = 20.dp)
            )
            SkillSection(
                skillPackages = resume.skills,
                modifier = Modifier
                    .weight(1 / 3f)
                    .padding(16.dp)
            )
            Divider(
                color = Colors.WHITE.copy(alpha = .2f),
                thickness = 1.dp,
                modifier = Modifier.padding(vertical = 20.dp)
            )

            LinksSection(
                resume.links,
                modifier = Modifier
                    .weight(1 / 3f)
                    .padding(16.dp)
            )
        }
        Column(
            modifier = Modifier
                .weight(7 / 10f)
                .fillMaxHeight()
                .padding(32.dp)
        ) {

            BioSection(
                bio = resume.bio
            )

            Divider(
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = .2f),
                thickness = 1.dp,
                modifier = Modifier.padding(vertical = 20.dp)
            )

        }
    }
}


