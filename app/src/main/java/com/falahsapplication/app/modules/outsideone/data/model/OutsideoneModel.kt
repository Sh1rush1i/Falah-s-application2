package com.falahsapplication.app.modules.outsideone.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OutsideoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOutsideRoom: String? = MyApp.getInstance().resources.getString(R.string.lbl_outside_room)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_outside_room_ad)

)
