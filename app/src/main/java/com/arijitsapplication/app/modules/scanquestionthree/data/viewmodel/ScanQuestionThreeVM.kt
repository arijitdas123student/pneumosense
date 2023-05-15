package com.arijitsapplication.app.modules.scanquestionthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionthree.`data`.model.ScanQuestionThreeModel
import org.koin.core.KoinComponent

class ScanQuestionThreeVM : ViewModel(), KoinComponent {
  val scanQuestionThreeModel: MutableLiveData<ScanQuestionThreeModel> =
      MutableLiveData(ScanQuestionThreeModel())

  var navArguments: Bundle? = null
}
