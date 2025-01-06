package com.xray16.phone.engine.activity

import android.os.Bundle
import com.xray16.phone.BuildConfig
import com.xray16.phone.engine.MAIN_ENGINE_NATIVE_LIB
import com.xray16.phone.engine.debugLibsArray
import com.xray16.phone.engine.killEngine
import com.xray16.phone.engine.releaseLibsArray
import com.xray16.phone.engine.setFullscreen
import org.libsdl.app.SDLActivity


class EngineActivity : SDLActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setFullscreen(window.decorView)
        super.onCreate(savedInstanceState)
        window.setBackgroundDrawable(null)
    }

    override fun getMainSharedObject() = MAIN_ENGINE_NATIVE_LIB

    override fun getLibraries() = if (BuildConfig.DEBUG) debugLibsArray else releaseLibsArray

    override fun onDestroy() {
        super.onDestroy()
        killEngine()
    }
}