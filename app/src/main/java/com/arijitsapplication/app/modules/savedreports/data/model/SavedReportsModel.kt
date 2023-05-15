package com.arijitsapplication.app.modules.savedreports.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SavedReportsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrNSingh: String? = MyApp.getInstance().resources.getString(R.string.lbl_saved_report)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_42_am_12_feb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMrTanmayGupt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mr_tanmay_gupt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_age_42_y_gend)

)
