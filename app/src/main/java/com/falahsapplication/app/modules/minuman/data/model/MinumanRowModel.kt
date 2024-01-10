package com.falahsapplication.app.modules.minuman.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MinumanRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMargarita: String? = MyApp.getInstance().resources.getString(R.string.lbl_margarita)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinumancocktai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_minuman_cocktai)

)
