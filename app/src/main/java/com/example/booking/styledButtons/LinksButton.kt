package com.example.booking.styledButtons

import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.booking.dataClasses.links
import com.example.booking.ui.theme.link_color


@Preview
@Composable
fun ClickableLink1() {
    val annotatedText = buildAnnotatedString {
        withStyle(style = SpanStyle(color = link_color, fontSize = 14.sp)) {
            append(links.link1 + ",")

        }
    }

    val text = remember { annotatedText }

    ClickableText(text = text, onClick = {
        text.getStringAnnotations(tag = "LINK", start = it, end = it).firstOrNull()
            ?.let {
            }
    })
}

@Preview
@Composable
fun ClickableLink2() {
    val annotatedText = buildAnnotatedString {
        withStyle(style = SpanStyle(color = link_color, fontSize = 14.sp)) {
            append(links.link2 + ",")

        }
    }

    val text = remember { annotatedText }

    ClickableText(text = text, onClick = {
        text.getStringAnnotations(tag = "LINK", start = it, end = it).firstOrNull()
            ?.let {
            }
    })
}

@Preview
@Composable
fun ClickableLink3() {
    val annotatedText = buildAnnotatedString {
        withStyle(style = SpanStyle(color = link_color, fontSize = 14.sp)) {
            append(links.link3 + ",")

        }
    }

    val text = remember { annotatedText }

    ClickableText(text = text, onClick = {
        text.getStringAnnotations(tag = "LINK", start = it, end = it).firstOrNull()
            ?.let {
            }
    })
}

@Preview
@Composable
fun ClickableLink4() {
    val annotatedText = buildAnnotatedString {
        withStyle(style = SpanStyle(color = link_color, fontSize = 14.sp)) {
            append(links.link4)

        }
    }

    val text = remember { annotatedText }

    ClickableText(text = text, onClick = {
        text.getStringAnnotations(tag = "LINK", start = it, end = it).firstOrNull()
            ?.let {
            }
    })
}


