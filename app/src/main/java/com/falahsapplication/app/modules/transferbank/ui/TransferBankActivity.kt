package com.falahsapplication.app.modules.transferbank.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityTransferBankBinding
import com.falahsapplication.app.modules.kwitansi.ui.KwitansiActivity
import com.falahsapplication.app.modules.transferbank.`data`.viewmodel.TransferBankVM
import kotlin.String
import kotlin.Unit

class TransferBankActivity :
    BaseActivity<ActivityTransferBankBinding>(R.layout.activity_transfer_bank) {
  private val viewModel: TransferBankVM by viewModels<TransferBankVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.transferBankVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGoToKwitasni.setOnClickListener {
      val destIntent = KwitansiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TRANSFER_BANK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TransferBankActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
