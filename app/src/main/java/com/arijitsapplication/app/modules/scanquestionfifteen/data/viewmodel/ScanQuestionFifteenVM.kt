package com.arijitsapplication.app.modules.scanquestionfifteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionfifteen.`data`.model.ScanQuestionFifteenModel
import org.koin.core.KoinComponent

class ScanQuestionFifteenVM : ViewModel(), KoinComponent {
  val scanQuestionFifteenModel: MutableLiveData<ScanQuestionFifteenModel> =
      MutableLiveData(ScanQuestionFifteenModel())

  var navArguments: Bundle? = null
}
