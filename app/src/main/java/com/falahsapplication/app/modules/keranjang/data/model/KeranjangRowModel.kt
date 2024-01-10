package com.falahsapplication.app.modules.keranjang.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class KeranjangRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSalmonChilli: String? = MyApp.getInstance().resources.getString(R.string.lbl_salmon_chilli)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_100_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
