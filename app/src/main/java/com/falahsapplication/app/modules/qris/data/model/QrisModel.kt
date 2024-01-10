package com.falahsapplication.app.modules.qris.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class QrisModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtQris: String? = MyApp.getInstance().resources.getString(R.string.lbl_qris)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScanHere: String? = MyApp.getInstance().resources.getString(R.string.lbl_scan_here)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGazzabarkery: String? = MyApp.getInstance().resources.getString(R.string.lbl_gazza_barkery)

)
