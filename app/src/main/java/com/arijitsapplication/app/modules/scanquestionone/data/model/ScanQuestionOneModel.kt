package com.arijitsapplication.app.modules.scanquestionone.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScanQuestionOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScanReport: String? = MyApp.getInstance().resources.getString(R.string.lbl_scan_report)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreyouhaving: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_having)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_10)

)
