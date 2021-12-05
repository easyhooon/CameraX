package com.points.camerax

import android.app.Application
import androidx.camera.camera2.Camera2Config
import androidx.camera.core.CameraXConfig

class GlobalApplication: Application(), CameraXConfig.Provider {

    override fun getCameraXConfig(): CameraXConfig = Camera2Config.defaultConfig()
}