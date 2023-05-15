package com.arijitsapplication.app.modules.scanquestioneleven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestioneleven.`data`.model.ScanQuestionElevenModel
import org.koin.core.KoinComponent

class ScanQuestionElevenVM : ViewModel(), KoinComponent {
  val scanQuestionElevenModel: MutableLiveData<ScanQuestionElevenModel> =
      MutableLiveData(ScanQuestionElevenModel())

  var navArguments: Bundle? = null
}
