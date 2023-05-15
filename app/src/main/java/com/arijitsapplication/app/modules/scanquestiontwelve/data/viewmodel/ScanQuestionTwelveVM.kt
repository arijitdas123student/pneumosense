package com.arijitsapplication.app.modules.scanquestiontwelve.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestiontwelve.`data`.model.ScanQuestionTwelveModel
import org.koin.core.KoinComponent

class ScanQuestionTwelveVM : ViewModel(), KoinComponent {
  val scanQuestionTwelveModel: MutableLiveData<ScanQuestionTwelveModel> =
      MutableLiveData(ScanQuestionTwelveModel())

  var navArguments: Bundle? = null
}
