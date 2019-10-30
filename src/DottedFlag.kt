import hevs.graphics.FunGraphics

import java.awt.Color

// Constant parameters
val GRAPHICS_WIDTH = 640
val GRAPHICS_HEIGHT = 480
val DOT_DISTANCE = 20
val DOT_RADIUS = 8
val STARTING_POSITION_X = 10
val STARTING_POSITION_Y = 10

// Display surface to draw on
val display: FunGraphics = FunGraphics(GRAPHICS_WIDTH, GRAPHICS_HEIGHT)

fun drawDisc(radius: Int, Cx: Int, Cy: Int) {
    display.setColor(Color.red)

    // Draws a red disc
    for (x in 0 until GRAPHICS_WIDTH) {
        for (y in 0 until GRAPHICS_HEIGHT) {
            val distance = ((Cx - x) * (Cx - x) + (Cy - y) * (Cy - y)).toDouble()

            if (distance <= radius * radius) {
                display.setPixel(x, y)
            }
        }
    }

}


fun fastDrawDisc(radius: Int, Cx: Int, Cy: Int) {
    display.setColor(Color.red)

    // Draws a red disc
    for (x in Cx - radius until Cx + radius) {
        for (y in Cy - radius until Cy + radius) {
            val distance = ((Cx - x) * (Cx - x) + (Cy - y) * (Cy - y)).toDouble()

            if (distance <= radius * radius) {
                display.setPixel(x, y)
            }
        }
    }

}


fun main() {
    display.setColor(Color.red)

    val before = System.currentTimeMillis()
    for (i in 1..39) {
        for (j in 1..29) {
            fastDrawDisc(5, i * 15, j * 15)
        }
    }

    val after = System.currentTimeMillis()

    println("Took " + (after - before) + " ms")
}