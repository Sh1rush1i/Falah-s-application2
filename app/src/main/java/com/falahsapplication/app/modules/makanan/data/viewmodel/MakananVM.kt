package com.falahsapplication.app.modules.makanan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.makanan.`data`.model.MakananModel
import org.koin.core.KoinComponent

class MakananVM : ViewModel(), KoinComponent {
  val makananModel: MutableLiveData<MakananModel> = MutableLiveData(MakananModel())

  var navArguments: Bundle? = null
}
