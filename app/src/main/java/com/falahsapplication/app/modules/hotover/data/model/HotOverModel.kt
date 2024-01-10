package com.falahsapplication.app.modules.hotover.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HotOverModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHOTOVER: String? = MyApp.getInstance().resources.getString(R.string.lbl_hot_over2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrink: String? = MyApp.getInstance().resources.getString(R.string.lbl_drink)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSnacks: String? = MyApp.getInstance().resources.getString(R.string.lbl_snacks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBacktomenu: String? = MyApp.getInstance().resources.getString(R.string.lbl_back_to_menu)

)
