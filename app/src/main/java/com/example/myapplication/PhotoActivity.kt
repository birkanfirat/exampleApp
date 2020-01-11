package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.otaliastudios.cameraview.controls.Mode
import kotlinx.android.synthetic.main.activity_photo.*
import kotlinx.android.synthetic.main.activity_video.*


class PhotoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)
       // runOnUiThread { camera.setLifecycleOwner(this) }

        camera.mode = Mode.PICTURE


    }

    override fun onResume() {
        super.onResume()
        camera.clearCameraListeners()
        camera.clearFrameProcessors()
        camera.open()

    }

    override fun onPause() {
        super.onPause()
        camera.close()

    }
    override fun onDestroy() {
        super.onDestroy()
        camera.destroy()

    }
}
