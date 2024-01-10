package com.falahsapplication.app.modules.createaccount.`data`.model

import com.falahsapplication.app.R
import com.falahsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CreateAccountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateyourAcc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_your_acc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrsignsupwit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_signs_up_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyEightValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentySixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyThreeValue: String? = null
)
