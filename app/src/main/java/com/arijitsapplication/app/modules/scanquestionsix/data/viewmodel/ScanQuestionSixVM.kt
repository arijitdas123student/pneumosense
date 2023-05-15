package com.arijitsapplication.app.modules.scanquestionsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionsix.`data`.model.ScanQuestionSixModel
import org.koin.core.KoinComponent

class ScanQuestionSixVM : ViewModel(), KoinComponent {
  val scanQuestionSixModel: MutableLiveData<ScanQuestionSixModel> =
      MutableLiveData(ScanQuestionSixModel())

  var navArguments: Bundle? = null
}
