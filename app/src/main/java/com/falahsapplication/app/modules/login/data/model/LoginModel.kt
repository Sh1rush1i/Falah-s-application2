package com.falahsapplication.app.modules.login.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogintoyourA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_to_your_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_forget_your_pas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrsignsinwit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_signs_in_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtyThreeValue: String? = null
)
