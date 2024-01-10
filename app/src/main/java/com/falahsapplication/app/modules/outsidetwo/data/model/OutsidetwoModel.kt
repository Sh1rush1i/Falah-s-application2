package com.falahsapplication.app.modules.outsidetwo.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OutsidetwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIndoorRoom: String? = MyApp.getInstance().resources.getString(R.string.lbl_indoor_room)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_indoor_room_ada)

)
