package org.example.project

import AppTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import getColorsTheme
import moe.tlaster.precompose.PreComposeApp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
  PreComposeApp {
    val colors = getColorsTheme()
    val titleTopBar = "mi topbar"


    AppTheme {
      Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
          TopAppBar(elevation = 0.dp, title = {
            Text(
              text = titleTopBar, fontSize = 25.sp, color = colors.textColor
            )
          },
            navigationIcon = {
              IconButton(
                onClick = {
                  // navigator.popBackstack()
                }
              ) {
                Icon(
                  modifier = Modifier.padding(start=16.dp),
                  imageVector = Icons.Default.ArrowBack,
                  tint = colors.textColor,
                  contentDescription = "Flecha back"
                )
              }
            }
          )
      },
        backgroundColor = colors.backgroundColor,
      ) {

      }
    }
  }
}

// @Composable Video Cap. 36, Time 15:54

