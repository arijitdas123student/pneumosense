package com.arijitsapplication.app.modules.location.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LocationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseselecty: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_select_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortisEscorts: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fortis_escorts2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRohiniNewDel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rohini_new_del)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_2km_away)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt24xSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_24x7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_minutes)

)
