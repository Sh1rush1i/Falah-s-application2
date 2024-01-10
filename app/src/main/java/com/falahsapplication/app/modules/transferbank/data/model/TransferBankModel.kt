package com.falahsapplication.app.modules.transferbank.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TransferBankModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTransferBank: String? = MyApp.getInstance().resources.getString(R.string.lbl_transfer_bank)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_kode)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoldenStickBi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_golden_stick_bi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_7854)

)
