package com.example.heybooks.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import com.example.heybooks.ui.theme.Shapes
import com.example.heybooks.ui.theme.primary
import com.example.heybooks.ui.theme.text
import com.example.heybooks.ui.theme.typography


@Composable
fun BookItemList(modifier: Modifier = Modifier) {
    BookItem()
}


@Composable
fun BookItem(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .background(color = MaterialTheme.colors.onSurface)
            .padding(16.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = rememberImagePainter(
                    data = "https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/ableson.jpg"
                ),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp, 150.dp)
                    .clip(RoundedCornerShape(16.dp))
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column() {
                Text(
                    text = "by Charlie Collins",
                    style = typography.caption,
                    color = text.copy(0.7F)
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = "Unlocking Android", style = typography.subtitle1, color = text)
                Spacer(modifier = Modifier.height(12.dp))
                ChipView()
            }
        }
    }
}

@Composable
fun ChipView(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .clip(shape = RoundedCornerShape(12.dp))
            .background(color = primary.copy(0.10F))
            .padding(horizontal = 12.dp, vertical = 5.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Mobile", style = typography.caption, color = primary)
    }
}


//@Preview
//@Composable
//fun BookItemPreview() {
//    BookItem()
//}