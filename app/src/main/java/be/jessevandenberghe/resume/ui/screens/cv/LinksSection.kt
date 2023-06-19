package be.jessevandenberghe.resume.ui.screens.cv

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import be.jessevandenberghe.resume.models.Link
import be.jessevandenberghe.resume.ui.shared.TextWithIcon

@Composable
fun LinksSection(
    links: List<Link>,
    modifier: Modifier
) {
    Column(
        modifier = modifier
    ) {
        if (links.isNotEmpty()) {
            Text(
                text = "Links",
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(16.dp))
            LinksList(links)
        }
    }
}

@Composable
private fun LinksList(links: List<Link>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(links) { link ->
            LinkItem(link)
        }
    }
}

@Composable
private fun LinkItem(link: Link) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        TextWithIcon(
            iconPainter = painterResource(id = link.icon),
            text = link.name,
            iconTint = MaterialTheme.colorScheme.secondary,
            textColor = MaterialTheme.colorScheme.onPrimary,
            textStyle = MaterialTheme.typography.labelLarge
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = link.link,
            color = MaterialTheme.colorScheme.onPrimary,
            textDecoration = TextDecoration.Underline
        )
    }
}