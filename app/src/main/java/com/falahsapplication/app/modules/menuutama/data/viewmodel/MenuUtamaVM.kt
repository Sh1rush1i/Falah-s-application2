package com.falahsapplication.app.modules.menuutama.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.menuutama.`data`.model.MenuUtamaModel
import org.koin.core.KoinComponent

class MenuUtamaVM : ViewModel(), KoinComponent {
  val menuUtamaModel: MutableLiveData<MenuUtamaModel> = MutableLiveData(MenuUtamaModel())

  var navArguments: Bundle? = null
}
