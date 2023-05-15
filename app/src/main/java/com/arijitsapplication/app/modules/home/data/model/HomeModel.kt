package com.arijitsapplication.app.modules.home.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFortisEscorts: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fortis_escorts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloKunal: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello_kunal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeRemedyfor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_home_remedy_fo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_cure_pneumonia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFindDoctor: String? = MyApp.getInstance().resources.getString(R.string.lbl_find_doctor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReport: String? = MyApp.getInstance().resources.getString(R.string.lbl_report)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHospital: String? = MyApp.getInstance().resources.getString(R.string.lbl_hospital)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmbulance: String? = MyApp.getInstance().resources.getString(R.string.lbl_ambulance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_recommended_doc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrNarayan: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_s_narayan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGeneralPulmono: String? =
      MyApp.getInstance().resources.getString(R.string.msg_general_pulmono)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_08_00_16_00)

)
