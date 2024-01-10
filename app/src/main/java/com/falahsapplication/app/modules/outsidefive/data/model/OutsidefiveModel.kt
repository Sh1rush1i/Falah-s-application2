package com.falahsapplication.app.modules.outsidefive.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OutsidefiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRomandinner: String? = MyApp.getInstance().resources.getString(R.string.lbl_roman_dinner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_outside_room_ad)

)
