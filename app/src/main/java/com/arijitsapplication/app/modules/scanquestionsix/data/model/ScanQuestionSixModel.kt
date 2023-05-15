package com.arijitsapplication.app.modules.scanquestionsix.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScanQuestionSixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScanReport: String? = MyApp.getInstance().resources.getString(R.string.lbl_scan_report)
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
  var txtAreyouexperieOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_experie4)
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
  var etFrameTwentySevenValue: String? = null
)
