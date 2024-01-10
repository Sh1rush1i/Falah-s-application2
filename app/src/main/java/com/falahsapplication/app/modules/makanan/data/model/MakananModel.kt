package com.falahsapplication.app.modules.makanan.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MakananModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChikenMeryland: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_chiken_meryland)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_chiken_marylan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSalmonChilli: String? = MyApp.getInstance().resources.getString(R.string.lbl_salmon_chilli)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_salmon_chilli_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTunaMeryland: String? = MyApp.getInstance().resources.getString(R.string.lbl_tuna_meryland)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tuna_meryland_a)

)
