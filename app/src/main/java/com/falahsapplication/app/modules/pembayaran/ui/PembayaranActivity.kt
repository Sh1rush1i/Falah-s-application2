package com.falahsapplication.app.modules.pembayaran.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityPembayaranBinding
import com.falahsapplication.app.modules.keranjang.ui.KeranjangActivity
import com.falahsapplication.app.modules.kwitansi.ui.KwitansiActivity
import com.falahsapplication.app.modules.pembayaran.`data`.viewmodel.PembayaranVM
import com.falahsapplication.app.modules.qris.ui.QrisActivity
import com.falahsapplication.app.modules.transferbank.ui.TransferBankActivity
import kotlin.String
import kotlin.Unit

class PembayaranActivity : BaseActivity<ActivityPembayaranBinding>(R.layout.activity_pembayaran) {
  private val viewModel: PembayaranVM by viewModels<PembayaranVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pembayaranVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBacktoPayment.setOnClickListener {
      val destIntent = KeranjangActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowtransferbank.setOnClickListener {
      val destIntent = TransferBankActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowqris.setOnClickListener {
      val destIntent = QrisActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowcash.setOnClickListener {
      val destIntent = KwitansiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PEMBAYARAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PembayaranActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
