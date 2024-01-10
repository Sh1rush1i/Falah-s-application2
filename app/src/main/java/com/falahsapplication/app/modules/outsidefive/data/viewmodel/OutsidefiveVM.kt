package com.falahsapplication.app.modules.outsidefive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.outsidefive.`data`.model.OutsidefiveModel
import org.koin.core.KoinComponent

class OutsidefiveVM : ViewModel(), KoinComponent {
  val outsidefiveModel: MutableLiveData<OutsidefiveModel> = MutableLiveData(OutsidefiveModel())

  var navArguments: Bundle? = null
}
