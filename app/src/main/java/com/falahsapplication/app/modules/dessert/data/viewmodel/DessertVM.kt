package com.falahsapplication.app.modules.dessert.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.dessert.`data`.model.DessertModel
import org.koin.core.KoinComponent

class DessertVM : ViewModel(), KoinComponent {
  val dessertModel: MutableLiveData<DessertModel> = MutableLiveData(DessertModel())

  var navArguments: Bundle? = null
}
