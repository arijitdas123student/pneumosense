package com.arijitsapplication.app.modules.scanquestionfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionfour.`data`.model.ScanQuestionFourModel
import org.koin.core.KoinComponent

class ScanQuestionFourVM : ViewModel(), KoinComponent {
  val scanQuestionFourModel: MutableLiveData<ScanQuestionFourModel> =
      MutableLiveData(ScanQuestionFourModel())

  var navArguments: Bundle? = null
}
