package com.falahsapplication.app.modules.outsidetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.outsidetwo.`data`.model.OutsidetwoModel
import org.koin.core.KoinComponent

class OutsidetwoVM : ViewModel(), KoinComponent {
  val outsidetwoModel: MutableLiveData<OutsidetwoModel> = MutableLiveData(OutsidetwoModel())

  var navArguments: Bundle? = null
}
