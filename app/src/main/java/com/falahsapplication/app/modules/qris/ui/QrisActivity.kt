package com.falahsapplication.app.modules.qris.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityQrisBinding
import com.falahsapplication.app.modules.kwitansi.ui.KwitansiActivity
import com.falahsapplication.app.modules.qris.`data`.viewmodel.QrisVM
import kotlin.String
import kotlin.Unit

class QrisActivity : BaseActivity<ActivityQrisBinding>(R.layout.activity_qris) {
  private val viewModel: QrisVM by viewModels<QrisVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.qrisVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGoToKwitasni.setOnClickListener {
      val destIntent = KwitansiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "QRIS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, QrisActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
