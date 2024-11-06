package com.ahuaman.stylistecommerceapp.components

import android.media.session.PlaybackState.CustomAction
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahuaman.stylistecommerceapp.R

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    icon: Int,
    colorIcon: Color = Color(0xFF9775FA),
) {
    Image(
        modifier = modifier
            .background(
                color = colorIcon,
                shape = RoundedCornerShape(10.dp)
            )
            .padding(13.dp)
            .size(25.dp),
        painter = painterResource(id = icon),
        contentDescription = null,
    )
}


@Preview
@Composable
private fun CustomButtonPrev() {
    CustomButton(icon = R.drawable.ic_voice, colorIcon = Color.Transparent)
}