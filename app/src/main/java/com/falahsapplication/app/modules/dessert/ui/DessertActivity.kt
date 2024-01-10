package com.falahsapplication.app.modules.dessert.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityDessertBinding
import com.falahsapplication.app.modules.dessert.`data`.viewmodel.DessertVM
import kotlin.String
import kotlin.Unit

class DessertActivity : BaseActivity<ActivityDessertBinding>(R.layout.activity_dessert) {
  private val viewModel: DessertVM by viewModels<DessertVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dessertVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DESSERT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DessertActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
