package com.arijitsapplication.app.modules.uploadimage.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class UploadImageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScanReport: String? = MyApp.getInstance().resources.getString(R.string.lbl_scan_report)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMrTGupta: String? = MyApp.getInstance().resources.getString(R.string.lbl_mr_t_gupta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_42_y_male)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt71B: String? = MyApp.getInstance().resources.getString(R.string.lbl_71_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_42_am_12_feb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCamera: String? = MyApp.getInstance().resources.getString(R.string.lbl_camera)

)
