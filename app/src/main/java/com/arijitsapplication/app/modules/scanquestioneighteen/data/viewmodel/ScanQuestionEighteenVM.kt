package com.arijitsapplication.app.modules.scanquestioneighteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestioneighteen.`data`.model.ScanQuestionEighteenModel
import org.koin.core.KoinComponent

class ScanQuestionEighteenVM : ViewModel(), KoinComponent {
  val scanQuestionEighteenModel: MutableLiveData<ScanQuestionEighteenModel> =
      MutableLiveData(ScanQuestionEighteenModel())

  var navArguments: Bundle? = null
}
