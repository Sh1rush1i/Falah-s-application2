package com.falahsapplication.app.modules.makanan.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityMakananBinding
import com.falahsapplication.app.modules.makanan.`data`.viewmodel.MakananVM
import kotlin.String
import kotlin.Unit

class MakananActivity : BaseActivity<ActivityMakananBinding>(R.layout.activity_makanan) {
  private val viewModel: MakananVM by viewModels<MakananVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.makananVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MAKANAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MakananActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
