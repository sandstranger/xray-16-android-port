package com.xray16.phone.presenter

import android.app.Activity
import android.content.Context
import com.xray16.phone.utils.requestExternalStoragePermission
import com.xray16.phone.engine.startEngine
import moxy.InjectViewState
import moxy.MvpPresenter
import moxy.MvpView

@InjectViewState
class MainActivityPresenter : MvpPresenter<MvpView>() {
    internal fun onStartGameBtnClicked(context: Context) = startEngine(context)

    internal fun requestExternalStorage (activity : Activity) = activity.requestExternalStoragePermission()
}