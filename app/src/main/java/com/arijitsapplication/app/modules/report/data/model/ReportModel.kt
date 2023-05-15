package com.arijitsapplication.app.modules.report.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ReportModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReport: String? = MyApp.getInstance().resources.getString(R.string.lbl_report)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMrRaviGupta: String? = MyApp.getInstance().resources.getString(R.string.lbl_mr_ravi_gupta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_age_73_y_gend)

)
