package com.hyg.dialog

import android.app.Dialog
import android.content.Context
import com.google.android.material.shadow.ShadowRenderer

/**
 * @Author 韩永刚
 * @Date 2021/12/06
 * @Desc
 */
abstract class BaseDialog(context: Context,themeResId: Int): Dialog(context, themeResId) {

    constructor(context: Context): this(context,0)

    private val params = window?.attributes
    fun width(width: Int){
    }

    fun height(height: Int){

    }

    fun alpha(alpha: Float){

    }


}