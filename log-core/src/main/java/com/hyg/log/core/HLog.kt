package com.hyg.log.core

import android.os.Debug

/**
 * @Author 韩永刚
 * @Date 2021/11/29
 * @Desc
 */
class HLog {
    companion object{
        private const val TAG = "HLog"

        private var debug = false

        @JvmStatic
        fun debug(debug: Boolean){
            HLog.debug = debug
        }

        fun v(msg: String){
            v(TAG,msg)
        }
        fun v(tag: String, msg: String){
            v(TAG,msg,null)
        }
        fun v(tag: String, msg: String,throwable: Throwable?){

        }

        fun d(msg: String){
            d(TAG,msg)
        }
        fun d(tag: String, msg: String){
            d(TAG,msg,null)
        }
        fun d(tag: String, msg: String,throwable: Throwable?){

        }

        fun i(msg: String){
            i(TAG,msg)
        }
        fun i(tag: String, msg: String){
            i(TAG,msg,null)
        }
        fun i(tag: String, msg: String,throwable: Throwable?){

        }

        fun w(msg: String){
            w(TAG,msg)
        }
        fun w(tag: String, msg: String){
            w(TAG,msg,null)
        }
        fun w(tag: String, msg: String,throwable: Throwable?){

        }

        fun e(msg: String){
            e(TAG,msg)
        }
        fun e(tag: String, msg: String){
            e(TAG,msg,null)
        }
        fun e(tag: String, msg: String,throwable: Throwable?){

        }
    }
}