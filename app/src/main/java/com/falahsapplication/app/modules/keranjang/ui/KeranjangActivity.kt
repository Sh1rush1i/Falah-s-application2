package com.falahsapplication.app.modules.keranjang.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityKeranjangBinding
import com.falahsapplication.app.modules.keranjang.`data`.model.KeranjangRowModel
import com.falahsapplication.app.modules.keranjang.`data`.viewmodel.KeranjangVM
import com.falahsapplication.app.modules.menumakanan.ui.MenuMakananActivity
import com.falahsapplication.app.modules.pembayaran.ui.PembayaranActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class KeranjangActivity : BaseActivity<ActivityKeranjangBinding>(R.layout.activity_keranjang) {
  private val viewModel: KeranjangVM by viewModels<KeranjangVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val keranjangAdapter = KeranjangAdapter(viewModel.keranjangList.value?:mutableListOf())
    binding.recyclerKeranjang.adapter = keranjangAdapter
    keranjangAdapter.setOnItemClickListener(
    object : KeranjangAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : KeranjangRowModel) {
        onClickRecyclerKeranjang(view, position, item)
      }
    }
    )
    viewModel.keranjangList.observe(this) {
      keranjangAdapter.updateData(it)
    }
    binding.keranjangVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnPay.setOnClickListener {
      val destIntent = PembayaranActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtBacktomenu.setOnClickListener {
      val destIntent = MenuMakananActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerKeranjang(
    view: View,
    position: Int,
    item: KeranjangRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "KERANJANG_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KeranjangActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
