package com.falahsapplication.app.modules.outsideone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityOutsideoneBinding
import com.falahsapplication.app.modules.menumakanan.ui.MenuMakananActivity
import com.falahsapplication.app.modules.outsideone.`data`.viewmodel.OutsideoneVM
import kotlin.String
import kotlin.Unit

class OutsideoneActivity : BaseActivity<ActivityOutsideoneBinding>(R.layout.activity_outsideone) {
  private val viewModel: OutsideoneVM by viewModels<OutsideoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.outsideoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBookNow.setOnClickListener {
      val destIntent = MenuMakananActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OUTSIDEONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OutsideoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
