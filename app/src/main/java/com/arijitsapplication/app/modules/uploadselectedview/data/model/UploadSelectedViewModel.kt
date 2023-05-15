package com.arijitsapplication.app.modules.uploadselectedview.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class UploadSelectedViewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChoose: String? = MyApp.getInstance().resources.getString(R.string.lbl_choose)

)
