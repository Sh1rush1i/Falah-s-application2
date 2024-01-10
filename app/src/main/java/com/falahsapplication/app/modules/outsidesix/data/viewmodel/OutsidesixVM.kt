package com.falahsapplication.app.modules.outsidesix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.outsidesix.`data`.model.OutsidesixModel
import org.koin.core.KoinComponent

class OutsidesixVM : ViewModel(), KoinComponent {
  val outsidesixModel: MutableLiveData<OutsidesixModel> = MutableLiveData(OutsidesixModel())

  var navArguments: Bundle? = null
}
