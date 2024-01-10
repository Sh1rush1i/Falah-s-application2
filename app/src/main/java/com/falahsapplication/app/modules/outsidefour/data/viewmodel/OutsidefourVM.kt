package com.falahsapplication.app.modules.outsidefour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.outsidefour.`data`.model.OutsidefourModel
import org.koin.core.KoinComponent

class OutsidefourVM : ViewModel(), KoinComponent {
  val outsidefourModel: MutableLiveData<OutsidefourModel> = MutableLiveData(OutsidefourModel())

  var navArguments: Bundle? = null
}
