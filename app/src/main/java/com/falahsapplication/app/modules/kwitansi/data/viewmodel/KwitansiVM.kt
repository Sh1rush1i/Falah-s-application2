package com.falahsapplication.app.modules.kwitansi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.kwitansi.`data`.model.KwitansiModel
import org.koin.core.KoinComponent

class KwitansiVM : ViewModel(), KoinComponent {
  val kwitansiModel: MutableLiveData<KwitansiModel> = MutableLiveData(KwitansiModel())

  var navArguments: Bundle? = null
}
