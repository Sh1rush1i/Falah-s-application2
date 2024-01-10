package com.falahsapplication.app.modules.kwitansi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityKwitansiBinding
import com.falahsapplication.app.modules.kwitansi.`data`.viewmodel.KwitansiVM
import com.falahsapplication.app.modules.menuutama.ui.MenuUtamaActivity
import kotlin.String
import kotlin.Unit

class KwitansiActivity : BaseActivity<ActivityKwitansiBinding>(R.layout.activity_kwitansi) {
  private val viewModel: KwitansiVM by viewModels<KwitansiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.kwitansiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackMenu.setOnClickListener {
      val destIntent = MenuUtamaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "KWITANSI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KwitansiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
