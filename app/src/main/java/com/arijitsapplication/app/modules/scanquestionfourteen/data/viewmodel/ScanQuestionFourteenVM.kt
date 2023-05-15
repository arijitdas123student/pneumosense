package com.arijitsapplication.app.modules.scanquestionfourteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionfourteen.`data`.model.ScanQuestionFourteenModel
import org.koin.core.KoinComponent

class ScanQuestionFourteenVM : ViewModel(), KoinComponent {
  val scanQuestionFourteenModel: MutableLiveData<ScanQuestionFourteenModel> =
      MutableLiveData(ScanQuestionFourteenModel())

  var navArguments: Bundle? = null
}
