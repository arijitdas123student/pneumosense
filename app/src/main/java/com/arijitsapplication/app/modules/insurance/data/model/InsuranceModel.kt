package com.arijitsapplication.app.modules.insurance.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InsuranceModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInsuranceProte: String? =
      MyApp.getInstance().resources.getString(R.string.msg_insurance_prote)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourHealthOur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_health_our)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetmorebenefi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_get_more_benefi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStartfrom: String? = MyApp.getInstance().resources.getString(R.string.lbl_start_from)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_rs_799_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonth: String? = MyApp.getInstance().resources.getString(R.string.lbl_month)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeensurebest: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_ensure_best)

)
