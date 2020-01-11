package com.example.myapplication

import android.app.TabActivity
import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_add_tab.*

class AddTab : TabActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_tab)

        val tabhost =tabHost // initiate TabHost
        tabhost.setup()

        val tabPhoto = tabhost.newTabSpec("tab2") // Create a new TabSpec using tab host
        tabPhoto.setIndicator("Fotoğraf") // set the “Tab 1” as an indicator
        tabPhoto.setContent(Intent(this@AddTab, PhotoActivity::class.java))
        tabhost.addTab(tabPhoto)

        val tabVideo = tabhost.newTabSpec("tab3") // Create a new TabSpec using tab host
        tabVideo.setIndicator("Video") // set the “Tab 1” as an indicator
        tabVideo.setContent(Intent(this@AddTab, VideoActivity::class.java))
        tabhost.addTab(tabVideo)
    }


}
