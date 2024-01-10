package com.falahsapplication.app.modules.bookingtable.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.falahsapplication.app.modules.bookingtable.`data`.model.BookingTableModel
import org.koin.core.KoinComponent

class BookingTableVM : ViewModel(), KoinComponent {
  val bookingTableModel: MutableLiveData<BookingTableModel> = MutableLiveData(BookingTableModel())

  var navArguments: Bundle? = null
}
