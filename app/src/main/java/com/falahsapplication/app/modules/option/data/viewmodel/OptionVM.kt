package com.falahsapplication.app.modules.option.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.option.`data`.model.OptionModel
import org.koin.core.KoinComponent

class OptionVM : ViewModel(), KoinComponent {
  val optionModel: MutableLiveData<OptionModel> = MutableLiveData(OptionModel())

  var navArguments: Bundle? = null
}
