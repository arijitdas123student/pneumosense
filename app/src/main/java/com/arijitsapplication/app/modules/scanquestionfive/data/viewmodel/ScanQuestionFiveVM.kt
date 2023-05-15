package com.arijitsapplication.app.modules.scanquestionfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionfive.`data`.model.ScanQuestionFiveModel
import org.koin.core.KoinComponent

class ScanQuestionFiveVM : ViewModel(), KoinComponent {
  val scanQuestionFiveModel: MutableLiveData<ScanQuestionFiveModel> =
      MutableLiveData(ScanQuestionFiveModel())

  var navArguments: Bundle? = null
}
