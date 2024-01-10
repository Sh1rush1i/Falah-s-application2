package com.falahsapplication.app.modules.keranjang.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class KeranjangModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourgroceries: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_your_groceries)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNote: String? = MyApp.getInstance().resources.getString(R.string.lbl_note)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtType: String? = MyApp.getInstance().resources.getString(R.string.lbl_type)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp_120_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBacktomenu: String? = MyApp.getInstance().resources.getString(R.string.lbl_back_to_menu)

)
