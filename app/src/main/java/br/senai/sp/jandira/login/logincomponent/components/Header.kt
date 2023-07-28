package br.senai.sp.jandira.login.logincomponent.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.login.R

@Composable
fun Header() {

    Row(
        modifier = Modifier
            .background(color = Color.Cyan)
            .fillMaxWidth()
    ) {
        Column {
            Text(text = "Login")
            Text(text = "Informe seus dados")
        }

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = ""
        )

    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Header()
}