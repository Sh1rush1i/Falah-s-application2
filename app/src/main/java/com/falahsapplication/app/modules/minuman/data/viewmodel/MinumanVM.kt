package com.falahsapplication.app.modules.minuman.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.minuman.`data`.model.MinumanModel
import com.falahsapplication.app.modules.minuman.`data`.model.MinumanRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MinumanVM : ViewModel(), KoinComponent {
  val minumanModel: MutableLiveData<MinumanModel> = MutableLiveData(MinumanModel())

  var navArguments: Bundle? = null

  val minumanList: MutableLiveData<MutableList<MinumanRowModel>> = MutableLiveData(mutableListOf())
}
