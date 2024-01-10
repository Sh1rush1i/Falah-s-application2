package com.falahsapplication.app.modules.outsidefour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityOutsidefourBinding
import com.falahsapplication.app.modules.menumakanan.ui.MenuMakananActivity
import com.falahsapplication.app.modules.outsidefour.`data`.viewmodel.OutsidefourVM
import kotlin.String
import kotlin.Unit

class OutsidefourActivity : BaseActivity<ActivityOutsidefourBinding>(R.layout.activity_outsidefour)
    {
  private val viewModel: OutsidefourVM by viewModels<OutsidefourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.outsidefourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBookNow.setOnClickListener {
      val destIntent = MenuMakananActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OUTSIDEFOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OutsidefourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
