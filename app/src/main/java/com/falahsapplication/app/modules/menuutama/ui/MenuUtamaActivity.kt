package com.falahsapplication.app.modules.menuutama.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityMenuUtamaBinding
import com.falahsapplication.app.modules.bookingtable.ui.BookingTableActivity
import com.falahsapplication.app.modules.hotover.ui.HotOverActivity
import com.falahsapplication.app.modules.keranjang.ui.KeranjangActivity
import com.falahsapplication.app.modules.menumakanan.ui.MenuMakananActivity
import com.falahsapplication.app.modules.menuutama.`data`.viewmodel.MenuUtamaVM
import kotlin.String
import kotlin.Unit

class MenuUtamaActivity : BaseActivity<ActivityMenuUtamaBinding>(R.layout.activity_menu_utama) {
  private val viewModel: MenuUtamaVM by viewModels<MenuUtamaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuUtamaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleTwenty.setOnClickListener {
      val destIntent = MenuMakananActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleTwentyThree.setOnClickListener {
      val destIntent = HotOverActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleTwentyOne.setOnClickListener {
      val destIntent = BookingTableActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleTwentyTwo.setOnClickListener {
      val destIntent = KeranjangActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MENU_UTAMA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuUtamaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
