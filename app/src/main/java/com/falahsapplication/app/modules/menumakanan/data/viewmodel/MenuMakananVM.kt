package com.falahsapplication.app.modules.menumakanan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.menumakanan.`data`.model.MenuMakananModel
import org.koin.core.KoinComponent

class MenuMakananVM : ViewModel(), KoinComponent {
  val menuMakananModel: MutableLiveData<MenuMakananModel> = MutableLiveData(MenuMakananModel())

  var navArguments: Bundle? = null
}
