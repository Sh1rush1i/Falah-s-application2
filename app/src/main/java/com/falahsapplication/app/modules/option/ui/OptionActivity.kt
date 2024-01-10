package com.falahsapplication.app.modules.option.ui

import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityOptionBinding
import com.falahsapplication.app.modules.login.ui.LoginActivity
import com.falahsapplication.app.modules.option.`data`.viewmodel.OptionVM
import kotlin.String
import kotlin.Unit

class OptionActivity : BaseActivity<ActivityOptionBinding>(R.layout.activity_option) {
  private val viewModel: OptionVM by viewModels<OptionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.optionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etGroupNine.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "OPTION_ACTIVITY"

  }
}
