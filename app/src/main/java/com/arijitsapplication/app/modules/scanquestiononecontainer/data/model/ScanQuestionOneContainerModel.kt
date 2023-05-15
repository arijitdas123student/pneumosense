package com.arijitsapplication.app.modules.scanquestiononecontainer.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScanQuestionOneContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTypeamessage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_type_a_message)

)
