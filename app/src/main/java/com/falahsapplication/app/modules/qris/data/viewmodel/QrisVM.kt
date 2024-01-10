package com.falahsapplication.app.modules.qris.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.qris.`data`.model.QrisModel
import org.koin.core.KoinComponent

class QrisVM : ViewModel(), KoinComponent {
  val qrisModel: MutableLiveData<QrisModel> = MutableLiveData(QrisModel())

  var navArguments: Bundle? = null
}
