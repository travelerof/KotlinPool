package com.example.kotlinpool

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import com.hyg.permission.HPermission
import com.hyg.permission.OnRequestPermissionListener
import com.hyg.permission.PermissionType

class PermissionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)
    }

    fun normal(view: android.view.View) {
        HPermission.with(this)
            .requestCode(1010)
            .permissions(Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.CALL_PHONE)
            .listener(object : OnRequestPermissionListener{
                override fun onSucceed(requestCode: Int) {

                }

                override fun onFailed(requestCode: Int, permissions: Array<String>) {

                }

            })
            .request()
    }
    fun special(view: android.view.View) {
        HPermission.with(this,PermissionType.SPECIAL)
            .requestCode(1010)
            .permissions(Settings.ACTION_MANAGE_OVERLAY_PERMISSION)
            .listener(object : OnRequestPermissionListener{
                override fun onSucceed(requestCode: Int) {
                    //http:22.11.31.76/cbsp-app-ios/kj_flutter.git
                }

                override fun onFailed(requestCode: Int, permissions: Array<String>) {

                }
            })
            .request()
    }
}