package com.arijitsapplication.app.modules.insurance.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InsuranceRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHealthInsuranc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_health_insuranc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProvidingtheb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_providing_the_b)

)
