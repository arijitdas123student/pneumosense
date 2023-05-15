package com.arijitsapplication.app.modules.scanquestioneight.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScanQuestionEightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScanReport: String? = MyApp.getInstance().resources.getString(R.string.lbl_scan_report)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreyouexperie: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_experie4)
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
  var txtHaveyouvisite: String? =
      MyApp.getInstance().resources.getString(R.string.msg_have_you_visite)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeventeen: String? = MyApp.getInstance().resources.getString(R.string.lbl13)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameTwentySevenValue: String? = null
)
