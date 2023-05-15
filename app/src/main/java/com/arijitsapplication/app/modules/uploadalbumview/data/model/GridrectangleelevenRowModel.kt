package com.arijitsapplication.app.modules.uploadalbumview.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GridrectangleelevenRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecents: String? = MyApp.getInstance().resources.getString(R.string.lbl_recents)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOneHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_100)

)
