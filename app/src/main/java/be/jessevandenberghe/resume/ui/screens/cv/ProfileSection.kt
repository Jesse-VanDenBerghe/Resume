package be.jessevandenberghe.resume.ui.screens.cv

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import be.jessevandenberghe.resume.R
import be.jessevandenberghe.resume.models.Profile
import be.jessevandenberghe.resume.ui.shared.TextWithIcon

@Composable
fun ProfileSection(
    profile: Profile,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_profile),
            contentDescription = "Profile image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(20.dp)
                .aspectRatio(1f / 1f)
                .clip(CircleShape)
        )
        Text(
            text = profile.fullName,
            color = MaterialTheme.colorScheme.secondary,
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.SemiBold
            )
        )
        Text(
            text = profile.title,
            color = MaterialTheme.colorScheme.onPrimary,
            style = MaterialTheme.typography.headlineSmall.copy(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            )
        )
        TextWithIcon(
            icon = Icons.Rounded.Call,
            text = profile.phone,
            iconTint = MaterialTheme.colorScheme.secondary,
            textColor = MaterialTheme.colorScheme.onPrimary,
            textStyle = MaterialTheme.typography.bodyLarge
        )
        TextWithIcon(
            icon = Icons.Rounded.Email,
            text = profile.email,
            iconTint = MaterialTheme.colorScheme.secondary,
            textColor = MaterialTheme.colorScheme.onPrimary,
            textStyle = MaterialTheme.typography.bodyLarge
        )
        TextWithIcon(
            icon = Icons.Rounded.Home,
            text = profile.home.formatted,
            iconTint = MaterialTheme.colorScheme.secondary,
            textColor = MaterialTheme.colorScheme.onPrimary,
            textStyle = MaterialTheme.typography.bodyLarge
        )
    }
}