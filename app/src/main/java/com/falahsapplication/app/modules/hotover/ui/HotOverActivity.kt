package com.falahsapplication.app.modules.hotover.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityHotOverBinding
import com.falahsapplication.app.modules.hotover.`data`.viewmodel.HotOverVM
import com.falahsapplication.app.modules.menuutama.ui.MenuUtamaActivity
import kotlin.String
import kotlin.Unit

class HotOverActivity : BaseActivity<ActivityHotOverBinding>(R.layout.activity_hot_over) {
  private val viewModel: HotOverVM by viewModels<HotOverVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.hotOverVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleTwentyNine.setOnClickListener {
      val destIntent = MenuUtamaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOT_OVER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HotOverActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
