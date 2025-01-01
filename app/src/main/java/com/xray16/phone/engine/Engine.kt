package com.xray16.phone.engine

import android.content.Context
import android.os.Environment
import android.os.Process
import android.system.Os
import android.view.View
import com.xray16.phone.utils.startActivity
import com.xray16.phone.engine.activity.EngineActivity

internal val releaseLibsArray= arrayOf("GL","SDL2","jpeg","luajit","lzo2","mimalloc","ogg","vorbis",
    "openal","xrAICore","xrAPI","xrCDB","xrCore","xrEngine","xrGame","xrMaterialSystem","xrNetServer","xrParticles",
    "xrScriptEngine","xrSound","xrUICore","xrAPI","xrRender_GL","xr_3da")

internal val debugLibsArray= arrayOf("GL","SDL2","jpeg","luajit","lzo2","mimalloc","ogg","vorbis",
    "openal","xrAICore","xrAPI","xrCDB","xrCore","xrEngine","xrGame","xrMaterialSystem","xrNetServer","xrParticles",
    "xrScriptEngine","xrSound","xrUICore","xrAPI","xrRender_GL","xr_3da")

internal const val MAIN_ENGINE_NATIVE_LIB = "libxr_3da.so"

@Suppress("DEPRECATION")
internal fun setFullscreen(decorView: View) {
    val uiOptions = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_FULLSCREEN
            or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
    decorView.systemUiVisibility = uiOptions
}

fun killEngine() = Process.killProcess(Process.myPid())

fun startEngine(context: Context) {
    Os.setenv("GAME_PATH","${Environment.getExternalStorageDirectory().absolutePath}/stalker",true)
    Os.setenv("REGAL_LOG_FILE", Environment.getExternalStorageDirectory().absolutePath + "/file.log",true);
    context.startActivity<EngineActivity>()
}