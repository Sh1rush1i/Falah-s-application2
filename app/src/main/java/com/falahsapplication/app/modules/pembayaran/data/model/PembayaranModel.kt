package com.falahsapplication.app.modules.pembayaran.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PembayaranModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCash: String? = MyApp.getInstance().resources.getString(R.string.lbl_cash)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQris: String? = MyApp.getInstance().resources.getString(R.string.lbl_qris)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransferBank: String? = MyApp.getInstance().resources.getString(R.string.lbl_transfer_bank)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBacktoPayment: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_back_to_payment)

)
