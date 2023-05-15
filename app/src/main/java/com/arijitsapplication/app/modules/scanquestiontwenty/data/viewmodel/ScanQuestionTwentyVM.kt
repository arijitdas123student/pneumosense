package com.arijitsapplication.app.modules.scanquestiontwenty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestiontwenty.`data`.model.ScanQuestionTwentyModel
import org.koin.core.KoinComponent

class ScanQuestionTwentyVM : ViewModel(), KoinComponent {
  val scanQuestionTwentyModel: MutableLiveData<ScanQuestionTwentyModel> =
      MutableLiveData(ScanQuestionTwentyModel())

  var navArguments: Bundle? = null
}
