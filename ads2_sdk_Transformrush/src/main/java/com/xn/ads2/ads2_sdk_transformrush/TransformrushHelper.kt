package com.xn.ads2.ads2_sdk_transformrush

import android.content.Context
import com.monetize.core.MonetizeCoreSdk

object TransformrushHelper {

    fun transformrushInit(context: Context) {
        MonetizeCoreSdk.init(context)
    }

    fun transformrushStart(context: Context) {
        MonetizeCoreSdk.start(context)
    }
}