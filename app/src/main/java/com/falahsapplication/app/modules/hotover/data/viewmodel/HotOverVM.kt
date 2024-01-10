package com.falahsapplication.app.modules.hotover.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.hotover.`data`.model.HotOverModel
import org.koin.core.KoinComponent

class HotOverVM : ViewModel(), KoinComponent {
  val hotOverModel: MutableLiveData<HotOverModel> = MutableLiveData(HotOverModel())

  var navArguments: Bundle? = null
}
