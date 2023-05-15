package com.arijitsapplication.app.modules.callerid.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CallerIdRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNine: String? = MyApp.getInstance().resources.getString(R.string.lbl7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEffects: String? = MyApp.getInstance().resources.getString(R.string.lbl_effects)

)
