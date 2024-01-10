package com.falahsapplication.app.modules.bookingtable.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityBookingTableBinding
import com.falahsapplication.app.modules.bookingtable.`data`.viewmodel.BookingTableVM
import com.falahsapplication.app.modules.outsidefive.ui.OutsidefiveActivity
import com.falahsapplication.app.modules.outsidefour.ui.OutsidefourActivity
import com.falahsapplication.app.modules.outsideone.ui.OutsideoneActivity
import com.falahsapplication.app.modules.outsidethree.ui.OutsidethreeActivity
import com.falahsapplication.app.modules.outsidetwo.ui.OutsidetwoActivity
import kotlin.String
import kotlin.Unit

class BookingTableActivity :
    BaseActivity<ActivityBookingTableBinding>(R.layout.activity_booking_table) {
  private val viewModel: BookingTableVM by viewModels<BookingTableVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookingTableVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearColumnromandinner.setOnClickListener {
      val destIntent = OutsidefiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumntheskybar.setOnClickListener {
      val destIntent = OutsidefourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnrooftopcafe.setOnClickListener {
      val destIntent = OutsidethreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnindoorroom.setOnClickListener {
      val destIntent = OutsidetwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnoutsideroom.setOnClickListener {
      val destIntent = OutsideoneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BOOKING_TABLE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BookingTableActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
