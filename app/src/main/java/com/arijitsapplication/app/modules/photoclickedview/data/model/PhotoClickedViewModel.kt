package com.arijitsapplication.app.modules.photoclickedview.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PhotoClickedViewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRetake: String? = MyApp.getInstance().resources.getString(R.string.lbl_retake)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsePhoto: String? = MyApp.getInstance().resources.getString(R.string.lbl_use_photo)

)
