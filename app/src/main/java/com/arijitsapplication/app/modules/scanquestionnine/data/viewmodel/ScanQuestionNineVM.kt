package com.arijitsapplication.app.modules.scanquestionnine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionnine.`data`.model.ScanQuestionNineModel
import org.koin.core.KoinComponent

class ScanQuestionNineVM : ViewModel(), KoinComponent {
  val scanQuestionNineModel: MutableLiveData<ScanQuestionNineModel> =
      MutableLiveData(ScanQuestionNineModel())

  var navArguments: Bundle? = null
}
