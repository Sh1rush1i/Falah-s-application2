package com.falahsapplication.app.modules.dessert.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DessertModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTarCake: String? = MyApp.getInstance().resources.getString(R.string.lbl_tar_cake)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPencucimuluti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pencuci_mulut_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPanCake: String? = MyApp.getInstance().resources.getString(R.string.lbl_pan_cake)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPancakeadalah: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pancake_adalah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheseeCake: String? = MyApp.getInstance().resources.getString(R.string.lbl_chesee_cake)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_dipadunya_keju)

)
