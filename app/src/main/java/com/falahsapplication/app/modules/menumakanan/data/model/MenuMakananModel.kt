package com.falahsapplication.app.modules.menumakanan.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuMakananModel(
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
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)

)
