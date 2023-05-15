package com.arijitsapplication.app.modules.sharereport.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ShareReportModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReport: String? = MyApp.getInstance().resources.getString(R.string.lbl_report)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMrRaviGupta: String? = MyApp.getInstance().resources.getString(R.string.lbl_mr_ravi_gupta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_age_73_y_gend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_ravi_gupta_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtURL: String? = MyApp.getInstance().resources.getString(R.string.lbl_pneumosense)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAirDropOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_airdrop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_rajeev)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_family)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeopleCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_people)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_youtube)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAction: String? = MyApp.getInstance().resources.getString(R.string.msg_add_to_reading)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSFSymbol: String? = MyApp.getInstance().resources.getString(R.string.lbl15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActionOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_bookmark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSFSymbolOne: String? = MyApp.getInstance().resources.getString(R.string.lbl16)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActionTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_add_to_favorite)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSFSymbolTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl17)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActionThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_find_on_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSFSymbolThree: String? = MyApp.getInstance().resources.getString(R.string.lbl18)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditActions: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_actions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etShareActionRowValue: String? = null
)
