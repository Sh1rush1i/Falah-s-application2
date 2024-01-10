package com.falahsapplication.app.modules.outsidethree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityOutsidethreeBinding
import com.falahsapplication.app.modules.menumakanan.ui.MenuMakananActivity
import com.falahsapplication.app.modules.outsidethree.`data`.viewmodel.OutsidethreeVM
import kotlin.String
import kotlin.Unit

class OutsidethreeActivity :
    BaseActivity<ActivityOutsidethreeBinding>(R.layout.activity_outsidethree) {
  private val viewModel: OutsidethreeVM by viewModels<OutsidethreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.outsidethreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBookNow.setOnClickListener {
      val destIntent = MenuMakananActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OUTSIDETHREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OutsidethreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
