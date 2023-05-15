package com.arijitsapplication.app.modules.scanquestioneight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestioneight.`data`.model.ScanQuestionEightModel
import org.koin.core.KoinComponent

class ScanQuestionEightVM : ViewModel(), KoinComponent {
  val scanQuestionEightModel: MutableLiveData<ScanQuestionEightModel> =
      MutableLiveData(ScanQuestionEightModel())

  var navArguments: Bundle? = null
}
