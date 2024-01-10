package com.falahsapplication.app.modules.menuutama.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuUtamaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMENU: String? = MyApp.getInstance().resources.getString(R.string.lbl_menu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtROOMLIST: String? = MyApp.getInstance().resources.getString(R.string.lbl_room_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHOTOVER: String? = MyApp.getInstance().resources.getString(R.string.lbl_hot_over)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_keranjang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_keranjang)

)
