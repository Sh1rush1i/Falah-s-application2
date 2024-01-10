package com.falahsapplication.app.modules.minuman.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.base.BaseActivity
import com.falahsapplication.app.databinding.ActivityMinumanBinding
import com.falahsapplication.app.modules.minuman.`data`.model.MinumanRowModel
import com.falahsapplication.app.modules.minuman.`data`.viewmodel.MinumanVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MinumanActivity : BaseActivity<ActivityMinumanBinding>(R.layout.activity_minuman) {
  private val viewModel: MinumanVM by viewModels<MinumanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val minumanAdapter = MinumanAdapter(viewModel.minumanList.value?:mutableListOf())
    binding.recyclerMinuman.adapter = minumanAdapter
    minumanAdapter.setOnItemClickListener(
    object : MinumanAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MinumanRowModel) {
        onClickRecyclerMinuman(view, position, item)
      }
    }
    )
    viewModel.minumanList.observe(this) {
      minumanAdapter.updateData(it)
    }
    binding.minumanVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerMinuman(
    view: View,
    position: Int,
    item: MinumanRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MINUMAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MinumanActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
