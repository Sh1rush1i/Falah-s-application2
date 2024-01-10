package com.falahsapplication.app.modules.outsidefour.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OutsidefourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkyBar: String? = MyApp.getInstance().resources.getString(R.string.lbl_sky_bar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkybaradalah: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sky_bar_adalah)

)
