package com.arijitsapplication.app.modules.scanquestiontwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestiontwo.`data`.model.ScanQuestionTwoModel
import org.koin.core.KoinComponent

class ScanQuestionTwoVM : ViewModel(), KoinComponent {
  val scanQuestionTwoModel: MutableLiveData<ScanQuestionTwoModel> =
      MutableLiveData(ScanQuestionTwoModel())

  var navArguments: Bundle? = null
}
