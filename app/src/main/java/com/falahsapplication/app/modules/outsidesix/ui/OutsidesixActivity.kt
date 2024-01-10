package com.falahsapplication.app.modules.outsidesix.ui

import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityOutsidesixBinding
import com.falahsapplication.app.modules.outsidesix.`data`.viewmodel.OutsidesixVM
import kotlin.String
import kotlin.Unit

class OutsidesixActivity : BaseActivity<ActivityOutsidesixBinding>(R.layout.activity_outsidesix) {
  private val viewModel: OutsidesixVM by viewModels<OutsidesixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.outsidesixVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "OUTSIDESIX_ACTIVITY"

  }
}
