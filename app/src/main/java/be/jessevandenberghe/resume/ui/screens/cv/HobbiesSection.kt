package be.jessevandenberghe.resume.ui.screens.cv

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import be.jessevandenberghe.resume.R
import be.jessevandenberghe.resume.models.Link
import be.jessevandenberghe.resume.ui.shared.TextWithIcon

@Composable
fun HobbiesSection(
    hobbies: List<String>,
    modifier: Modifier
) {
    Column(
        modifier = modifier
    ) {
        if (hobbies.isNotEmpty()) {
            Text(
                text = "Hobbies",
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(16.dp))
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                hobbies.forEach { hobby ->
                    TextWithIcon(
                        text = hobby,
                        iconPainter = painterResource(id = R.drawable.ic_dot),
                        iconSize = 6.dp,
                        iconTint = MaterialTheme.colorScheme.secondary,
                        textColor = MaterialTheme.colorScheme.onPrimary,
                        textStyle = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    }
}
