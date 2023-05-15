package com.arijitsapplication.app.modules.messagedetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.messagedetails.`data`.model.MessageDetailsModel
import org.koin.core.KoinComponent

class MessageDetailsVM : ViewModel(), KoinComponent {
  val messageDetailsModel: MutableLiveData<MessageDetailsModel> =
      MutableLiveData(MessageDetailsModel())

  var navArguments: Bundle? = null
}
