package com.arijitsapplication.app.modules.message.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListcontainerFiveRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrNSingh: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_n_singh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_45)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoureimprovin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_re_improvin)

)
