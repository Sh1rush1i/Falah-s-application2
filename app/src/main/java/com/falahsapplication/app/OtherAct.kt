package com.falahsapplication.app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.falahsapplication.app.modules.menumakanan.ui.MenuMakananActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.ncorti.slidetoact.SlideToActView

class OtherAct  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other)

        WindowCompat.setDecorFitsSystemWindows(
            window, false
        )

        val contactBtn = findViewById<Button>(R.id.contatcBtn)
        contactBtn.setOnClickListener {
            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.bottomsheetview, null)
            dialog.setContentView(view)
            dialog.show()
        }

        val backBtn = findViewById<ImageView>(R.id.backBtn)
        backBtn.setOnClickListener {
            val intent = Intent(this, MenuMakananActivity::class.java)
            startActivity(intent)
            finish()
        }

        val slide = findViewById<SlideToActView>(R.id.sliderbro)
        slide.animDuration = 600
        slide.bumpVibration = 500
        slide.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                // Start the TabLayoutActivity
                val intent = Intent(this@OtherAct, TabLAct::class.java)
                startActivity(intent)
                finish()
            }
        }

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.img_rectangle19, "Food 1", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.img_rectangle20, "Food 2", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.img_rectangle21, "Lounge", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.img_rectangle22, "Studio", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.img_rectangle23, "Other entertainment", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.img_rectangle24, "Drinks", ScaleTypes.CENTER_CROP))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
    }

    companion object {
        const val TAG: String = "OTHERACT_ACTIVITY"

        fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, OtherAct::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
        }
    }
}