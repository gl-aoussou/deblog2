package org.example.deblog2.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.dom.Svg
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import org.example.deblog2.models.Theme
import org.example.deblog2.util.Constants.FONT_FAMILY
import org.example.deblog2.util.Constants.SIDE_PANEL_WIDTH
import org.example.deblog2.util.Res
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh


@Composable
fun SidePanel() {

    Column(

        modifier = Modifier.padding(leftRight = 40.px, topBottom = 50.px).width(SIDE_PANEL_WIDTH.px)
            .height(100.vh).position(Position.Fixed).backgroundColor(Theme.Secondary.rgb).zIndex(9)

    ) {

        Image(
            modifier = Modifier.margin(bottom = 60.px), src = Res.Image.logo, desc = "Logo Image"
        )

        SpanText(
            modifier = Modifier
                .margin(bottom = 30.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .color(Theme.HalfWhite.rgb),

            text = "Dashboard"
        )
    }


    @Composable
    fun NavigationItem(
        modifier: Modifier = Modifier,
        selected: Boolean = false,
        title: String,
        icon: String,
        onClick: () -> Unit
    ) {

        Row(
            modifier = Modifier
                .cursor(Cursor.Pointer)
                .onClick { onClick() },
            verticalAlignment = Alignment.CenterVertically
        ) {


        }


    }


}

@Composable
private fun VectorIcon() {
    Svg(
        attrs = Modifier
            .width(24.px)
            .height(24.px)
            .toAttrs {
                attr("viewBox", "0 0 24 24")
                attr("fill", "none")
            }
    ) {
//        Path(
//            attrs
//        )
    }
}