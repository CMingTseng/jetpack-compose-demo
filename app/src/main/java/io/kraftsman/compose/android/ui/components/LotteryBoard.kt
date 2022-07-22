package io.kraftsman.compose.android.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.kraftsman.compose.android.ui.theme.JetpackComposeDemoTheme

@Composable
fun LotteryBoard() {
    val lotteryNumbers = listOf(1, 2, 3, 4, 5, 6)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "做一個發財夢",
            fontSize = 30.sp,
            color = Color.DarkGray,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        (1..49).chunked(7).forEach { group ->
            Row {
                group.forEach {
                    Box(
                        modifier = Modifier.padding(2.dp)
                    ) {
                        Ball(it, lotteryNumbers)
                    }
                }
            }
        }
        Spacer(
            modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
        )
        Button(onClick = {

        }) {
            Text(
                text = "選號 🎲",
                fontSize = 30.sp,
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LotteryBoardPreview() {
    JetpackComposeDemoTheme {
        LotteryBoard()
    }
}
