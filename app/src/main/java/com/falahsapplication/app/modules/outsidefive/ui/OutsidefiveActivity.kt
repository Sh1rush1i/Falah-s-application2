package com.falahsapplication.app.modules.outsidefive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityOutsidefiveBinding
import com.falahsapplication.app.modules.menumakanan.ui.MenuMakananActivity
import com.falahsapplication.app.modules.outsidefive.`data`.viewmodel.OutsidefiveVM
import kotlin.String
import kotlin.Unit

class OutsidefiveActivity : BaseActivity<ActivityOutsidefiveBinding>(R.layout.activity_outsidefive)
    {
  private val viewModel: OutsidefiveVM by viewModels<OutsidefiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.outsidefiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBookNow.setOnClickListener {
      val destIntent = MenuMakananActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OUTSIDEFIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OutsidefiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
