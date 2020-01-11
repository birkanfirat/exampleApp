package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otaliastudios.cameraview.controls.Mode
import kotlinx.android.synthetic.main.activity_video.*

class VideoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
       // runOnUiThread { camera1.setLifecycleOwner(this) }
        camera1.mode = Mode.VIDEO

    }

    override fun onResume() {
        super.onResume()
        camera1.clearCameraListeners()
        camera1.clearFrameProcessors()
        camera1.open()
    }

    override fun onPause() {
        super.onPause()
        camera1.close()

    }

    override fun onDestroy() {
        super.onDestroy()
        camera1.destroy()

    }
}
