package com.falahsapplication.app.modules.transferbank.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.transferbank.`data`.model.TransferBankModel
import org.koin.core.KoinComponent

class TransferBankVM : ViewModel(), KoinComponent {
  val transferBankModel: MutableLiveData<TransferBankModel> = MutableLiveData(TransferBankModel())

  var navArguments: Bundle? = null
}
