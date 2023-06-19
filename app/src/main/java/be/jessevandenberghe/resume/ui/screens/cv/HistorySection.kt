package be.jessevandenberghe.resume.ui.screens.cv

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Place
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import be.jessevandenberghe.resume.models.History
import be.jessevandenberghe.resume.models.HistoryInstant
import be.jessevandenberghe.resume.models.HistoryPeriod
import be.jessevandenberghe.resume.ui.shared.TextWithIcon

@Composable
fun HistorySection(
    history: History,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier, content = periodList(history)
    )
}

@Composable
private fun periodList(history: History): @Composable() (ColumnScope.() -> Unit) =
    {
        Text(
            text = history.title,
            color = MaterialTheme.colorScheme.secondary,
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(8.dp))

        PeriodList(history.periods)
    }

@Composable
private fun PeriodList(periods: List<HistoryPeriod>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(periods) { period: HistoryPeriod ->
            Text(
                text = period.title,
                style = MaterialTheme.typography.headlineMedium
            )

            TextWithIcon(
                icon = Icons.Rounded.Place,
                text = period.location,
                iconTint = MaterialTheme.colorScheme.secondary,
                textStyle = MaterialTheme.typography.labelLarge
            )

            Spacer(modifier = Modifier.height(4.dp))

            Row {
                InstantList(
                    period.items
                )
            }


        }
    }
}

@Composable
private fun InstantList(instants: List<HistoryInstant>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .padding(start = 8.dp, top = 8.dp)
            .background(MaterialTheme.colorScheme.primary.copy(alpha = .2f))
            .padding(start = 1.dp)
            .background(MaterialTheme.colorScheme.background)
            .padding(start = 8.dp)
    ) {
        instants.forEach { instant ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = MaterialTheme.colorScheme.primary.copy(alpha = .05f),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .padding(16.dp)
            ) {
                Text(
                    text = instant.title,
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Text(
                    text = instant.periodString,
                    style = MaterialTheme.typography.titleMedium
                )
                if (!instant.description.isNullOrEmpty()){
                    Text(
                        text = instant.description,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }
            }
        }
    }
}