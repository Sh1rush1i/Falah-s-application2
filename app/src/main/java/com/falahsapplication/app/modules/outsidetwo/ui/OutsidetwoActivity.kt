package com.falahsapplication.app.modules.outsidetwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityOutsidetwoBinding
import com.falahsapplication.app.modules.menumakanan.ui.MenuMakananActivity
import com.falahsapplication.app.modules.outsidetwo.`data`.viewmodel.OutsidetwoVM
import kotlin.String
import kotlin.Unit

class OutsidetwoActivity : BaseActivity<ActivityOutsidetwoBinding>(R.layout.activity_outsidetwo) {
  private val viewModel: OutsidetwoVM by viewModels<OutsidetwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.outsidetwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBookNow.setOnClickListener {
      val destIntent = MenuMakananActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OUTSIDETWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OutsidetwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
