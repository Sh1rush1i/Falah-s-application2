package com.falahsapplication.app.modules.outsidethree.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OutsidethreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRooftopCafe: String? = MyApp.getInstance().resources.getString(R.string.lbl_rooftop_cafe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRooftopcafeme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rooftop_cafe_me)

)
