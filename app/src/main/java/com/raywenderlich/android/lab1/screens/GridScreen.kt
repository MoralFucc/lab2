package com.raywenderlich.android.lab1.screens

import android.content.Intent.ShortcutIconResource
import android.graphics.drawable.Icon
import android.widget.GridView
import android.widget.RemoteViews.RemoteCollectionItems
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

private val items = listOf(
    Icons.Filled.Check,
    Icons.Filled.Close,
    Icons.Filled.ThumbUp,
    Icons.Filled.Build,
    Icons.Filled.Delete,
    Icons.Filled.Home,
    Icons.Filled.Close,
    Icons.Filled.ThumbUp,
    Icons.Filled.Build,
    Icons.Filled.ThumbUp,
)

@Composable
fun GridScreen() {
    GridView(ColumnCount = 3)

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun GridView(ColumnCount: Int) {
    //code
}

@Composable
fun RowItem(rowItems: List<ShortcutIconResource>) {
    //code
}

@Composable
fun RowScope.GridIcon(iconResource: IconResource){
    //code
}

data class IconResource(val imageVector: ImageVector, val isVisible: Boolean)


