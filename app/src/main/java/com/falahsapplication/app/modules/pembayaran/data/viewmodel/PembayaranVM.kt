package com.falahsapplication.app.modules.pembayaran.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.pembayaran.`data`.model.PembayaranModel
import org.koin.core.KoinComponent

class PembayaranVM : ViewModel(), KoinComponent {
  val pembayaranModel: MutableLiveData<PembayaranModel> = MutableLiveData(PembayaranModel())

  var navArguments: Bundle? = null
}
