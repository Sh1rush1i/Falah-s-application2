package com.falahsapplication.app.modules.outsidethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.outsidethree.`data`.model.OutsidethreeModel
import org.koin.core.KoinComponent

class OutsidethreeVM : ViewModel(), KoinComponent {
  val outsidethreeModel: MutableLiveData<OutsidethreeModel> = MutableLiveData(OutsidethreeModel())

  var navArguments: Bundle? = null
}
