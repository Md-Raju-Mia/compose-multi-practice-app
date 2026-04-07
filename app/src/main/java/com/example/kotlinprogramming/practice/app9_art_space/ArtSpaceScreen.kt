package com.example.kotlinprogramming.practice.app9_art_space

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlinprogramming.R
import com.example.kotlinprogramming.ui.theme.KotlinProgrammingTheme

@Composable
fun ArtSpaceApp() {
    // 1. Create state for dynamic elements (Artwork ID)
    var currentArtworkId by remember { mutableIntStateOf(1) }
    val totalArtworks = 4

    // 2. Determine artwork details based on ID
    val artworkDetails = when (currentArtworkId) {
        1 -> ArtworkData(
            title = "The Lush Lemon Tree",
            artist = "Nature's Gallery",
            year = "2021",
            imageRes = R.drawable.lemon_tree
        )
        2 -> ArtworkData(
            title = "A Fresh Squeeze",
            artist = "The Kitchen Studio",
            year = "2022",
            imageRes = R.drawable.lemon_squeeze
        )
        3 -> ArtworkData(
            title = "Refreshing Lemon Drink",
            artist = "Summer Vibe",
            year = "2023",
            imageRes = R.drawable.lemon_drink
        )
        else -> ArtworkData(
            title = "The Golden Harvest",
            artist = "Orchard Masters",
            year = "2024",
            imageRes = R.drawable.lemon_restart
        )
    }

    ArtSpaceScreen(
        artworkTitle = artworkDetails.title,
        artistName = artworkDetails.artist,
        year = artworkDetails.year,
        imageRes = artworkDetails.imageRes,
        // 3. Write conditional logic for Next interaction
        onNextClick = {
            currentArtworkId = if (currentArtworkId < totalArtworks) {
                currentArtworkId + 1
            } else {
                1 // Loop back to first
            }
        },
        // 4. Write conditional logic for Previous interaction
        onPreviousClick = {
            currentArtworkId = if (currentArtworkId > 1) {
                currentArtworkId - 1
            } else {
                totalArtworks // Loop back to last
            }
        }
    )
}

// Data class to hold artwork information
data class ArtworkData(
    val title: String,
    val artist: String,
    val year: String,
    val imageRes: Int
)

@Composable
fun ArtSpaceScreen(
    artworkTitle: String,
    artistName: String,
    year: String,
    imageRes: Int,
    onPreviousClick: () -> Unit,
    onNextClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .safeDrawingPadding()
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ArtworkImageCard(
                imageRes = imageRes,
                contentDescription = artworkTitle,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            ArtworkInfoCard(
                artworkTitle = artworkTitle,
                artistName = artistName,
                year = year,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            ArtworkNavigationButtons(
                onPreviousClick = onPreviousClick,
                onNextClick = onNextClick,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun ArtworkImageCard(
    imageRes: Int,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = contentDescription,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Composable
fun ArtworkInfoCard(
    artworkTitle: String,
    artistName: String,
    year: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = artworkTitle,
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "$artistName ($year)",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Composable
fun ArtworkNavigationButtons(
    onPreviousClick: () -> Unit,
    onNextClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = onPreviousClick,
            modifier = Modifier.width(150.dp)
        ) {
            Text(text = "Previous")
        }

//        Spacer(modifier = Modifier.weight(1f)) //"  horizontalArrangement = Arrangement.SpaceBetween" SpaceBetween works it's same task

        Button(
            onClick = onNextClick,
            modifier = Modifier.width(150.dp)
        ) {
            Text(text = "Next")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArtSpaceAppPreview() {
    KotlinProgrammingTheme {
        ArtSpaceApp()
    }
}
