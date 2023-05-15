package com.arijitsapplication.app.modules.scanquestionone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionone.`data`.model.ScanQuestionOneModel
import org.koin.core.KoinComponent

class ScanQuestionOneVM : ViewModel(), KoinComponent {
  val scanQuestionOneModel: MutableLiveData<ScanQuestionOneModel> =
      MutableLiveData(ScanQuestionOneModel())

  var navArguments: Bundle? = null
}
