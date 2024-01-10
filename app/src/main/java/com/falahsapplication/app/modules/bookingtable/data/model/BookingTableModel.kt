package com.falahsapplication.app.modules.bookingtable.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BookingTableModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCHOOSEYOURRoo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_your_ro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOutsideRoom: String? = MyApp.getInstance().resources.getString(R.string.lbl_outside_room)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndoorRoom: String? = MyApp.getInstance().resources.getString(R.string.lbl_indoor_room)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRooftopCafe: String? = MyApp.getInstance().resources.getString(R.string.lbl_rooftop_cafe2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheskyBar: String? = MyApp.getInstance().resources.getString(R.string.lbl_the_sky_bar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRomanDinner: String? = MyApp.getInstance().resources.getString(R.string.lbl_roman_dinner2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_italy_call2)

)
