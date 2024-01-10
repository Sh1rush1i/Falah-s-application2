package com.falahsapplication.app.modules.menumakanan.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityMenuMakananBinding
import com.falahsapplication.app.modules.dessert.ui.DessertActivity
import com.falahsapplication.app.modules.keranjang.ui.KeranjangActivity
import com.falahsapplication.app.modules.makanan.ui.MakananActivity
import com.falahsapplication.app.modules.menumakanan.`data`.viewmodel.MenuMakananVM
import com.falahsapplication.app.modules.menuutama.ui.MenuUtamaActivity
import com.falahsapplication.app.modules.minuman.ui.MinumanActivity
import kotlin.String
import kotlin.Unit

class MenuMakananActivity : BaseActivity<ActivityMenuMakananBinding>(R.layout.activity_menu_makanan)
    {
  private val viewModel: MenuMakananVM by viewModels<MenuMakananVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuMakananVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNineteen.setOnClickListener {
      val destIntent = MakananActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageRectangleTwentySix.setOnClickListener {
      val destIntent = DessertActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleTwentyThree.setOnClickListener {
      val destIntent = MinumanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleTwentyFour.setOnClickListener {
      val destIntent = MinumanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleTwentyOne.setOnClickListener {
      val destIntent = MakananActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleTwentyFive.setOnClickListener {
      val destIntent = MinumanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleTwentyTwo.setOnClickListener {
      val destIntent = MakananActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleTwentyEight.setOnClickListener {
      val destIntent = DessertActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleTwentySeven.setOnClickListener {
      val destIntent = DessertActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackcart.setOnClickListener {
      val destIntent = KeranjangActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLanguage.setOnClickListener {
      val destIntent = MenuUtamaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MENU_MAKANAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenuMakananActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
