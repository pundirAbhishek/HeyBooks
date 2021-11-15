package com.example.heybooks.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.heybooks.ui.theme.*
import com.example.heybooks.ui.theme.cardNight

@Composable
fun BookDetailCard(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(color = Color.White)
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .background(color = background)
                .fillMaxHeight(fraction = 0.38f)
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(horizontal = 20.dp)
        ) {


        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = rememberImagePainter(
                    data = "https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/ableson.jpg"
                ),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp, 300.dp)
                    .padding(12.dp)
                    .clip(RoundedCornerShape(16.dp))
            )

            Text(
                text = "by Charlie Collins",
                style = typography.caption,
                textAlign = TextAlign.Center,
                color = text.copy(0.7F)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Unlocking Android",
                style = typography.subtitle1,
                textAlign = TextAlign.Center,
                color = text
            )
            Spacer(modifier = Modifier.height(12.dp))
            ChipView()
        }
    }
}


@Preview
@Composable
fun BookDetailCardPreview() {
    BookDetailCard()
}