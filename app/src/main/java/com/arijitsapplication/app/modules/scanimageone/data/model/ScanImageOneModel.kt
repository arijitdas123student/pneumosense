package com.arijitsapplication.app.modules.scanimageone.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScanImageOneModel(
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
  var txtUploadImage: String? = MyApp.getInstance().resources.getString(R.string.lbl_upload_image)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompleteScanR: String? =
      MyApp.getInstance().resources.getString(R.string.msg_complete_scan_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWevereceived: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_ve_received)

)
