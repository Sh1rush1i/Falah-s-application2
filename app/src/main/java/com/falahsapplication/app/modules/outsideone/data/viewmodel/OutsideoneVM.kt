package com.falahsapplication.app.modules.outsideone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.outsideone.`data`.model.OutsideoneModel
import org.koin.core.KoinComponent

class OutsideoneVM : ViewModel(), KoinComponent {
  val outsideoneModel: MutableLiveData<OutsideoneModel> = MutableLiveData(OutsideoneModel())

  var navArguments: Bundle? = null
}
