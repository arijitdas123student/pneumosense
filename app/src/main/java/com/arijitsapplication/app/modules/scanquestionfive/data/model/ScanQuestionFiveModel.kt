package com.arijitsapplication.app.modules.scanquestionfive.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScanQuestionFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScanReport: String? = MyApp.getInstance().resources.getString(R.string.lbl_scan_report)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreyouexperie: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_experie3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTypeamessage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_type_a_message)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameTwentySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameTwentySevenOneValue: String? = null
)
