package me.milesglitch.testmod

import ru.cristalix.clientapi.KotlinMod
import ru.cristalix.uiengine.UIEngine
import ru.cristalix.uiengine.utility.*

class Main: KotlinMod() {
    override fun onEnable() {
        UIEngine.initialize(this)
        val text = text {
            content = "Hello, world!"
            shadow = true
            align = TOP
            origin = TOP
            offset.y = 2.0
        }

        val rect = rectangle {
            size = V3(50.0, 20.0)
            color = Color(255, 255, 100, 0.5)
            align = CENTER
            origin = CENTER
            addChild(text)
        }

        UIEngine.overlayContext.addChild(rect)
        super.onEnable()
    }
}