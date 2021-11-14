package com.example.heybooks.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.heybooks.ui.theme.primary
import com.example.heybooks.ui.theme.typography

@ExperimentalComposeUiApi
@Composable
fun InputTextField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit
) {
    val keyboardController = LocalSoftwareKeyboardController.current

    OutlinedTextField(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        value = value,
        onValueChange = {
            onValueChange(it)
        },
        label = {
            LabelView(title = label)
        },
        leadingIcon = {
            SearchIcon()
        },
        colors = textFieldColors(),
        textStyle = typography.body1,
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
        keyboardActions = KeyboardActions(
            onSearch = { keyboardController?.hide() }
        )
    )
}

@Composable
fun LabelView(title: String) {
    Text(
        text = title,
        style = typography.caption,
        color = colors.primary,
        textAlign = TextAlign.Start
    )
}

@Composable
fun SearchIcon() {
    Icon(
        imageVector = Icons.Rounded.Search,
        contentDescription = "Search Icon",
        tint = Color.DarkGray
    )
}

@Composable
fun textFieldColors() = TextFieldDefaults.textFieldColors(
    textColor = colors.primaryVariant,
    focusedLabelColor = colors.primary,
    focusedIndicatorColor = colors.primary,
    unfocusedIndicatorColor = Color.LightGray,
    cursorColor = colors.primary,
    placeholderColor = colors.onSurface,
    disabledPlaceholderColor = colors.onSurface
)

@ExperimentalComposeUiApi
@Preview
@Composable
fun InputTextFieldPreview() {
    InputTextField("Search for Books...", "") {

    }
}