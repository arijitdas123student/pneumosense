package com.arijitsapplication.app.modules.callerid.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CallerIdModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnd: String? = MyApp.getInstance().resources.getString(R.string.lbl_end)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFourteen: String? = MyApp.getInstance().resources.getString(R.string.lbl11)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCameraOff: String? = MyApp.getInstance().resources.getString(R.string.lbl_camera_off)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifteen: String? = MyApp.getInstance().resources.getString(R.string.lbl12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpeaker: String? = MyApp.getInstance().resources.getString(R.string.lbl_speaker)

)
