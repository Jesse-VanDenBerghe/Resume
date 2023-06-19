package be.jessevandenberghe.resume.ui.screens.cv

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import be.jessevandenberghe.resume.models.Profile
import be.jessevandenberghe.resume.ui.theme.Colors

@Composable
fun CvScreen(){
    Row {
        Column(
            modifier = Modifier
                .weight(0.3f)
                .fillMaxHeight()
                .background(Colors.DARK_BLUE)
        ) {
            ProfileSection(
                profile = Profile.ME,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            )
        }
        Column(
            modifier = Modifier
                .weight(0.7f)
                .fillMaxHeight()
        ) {

        }
    }
}