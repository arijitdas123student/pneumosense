package com.arijitsapplication.app.modules.scanquestionseventeen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionseventeen.`data`.model.ScanQuestionSeventeenModel
import org.koin.core.KoinComponent

class ScanQuestionSeventeenVM : ViewModel(), KoinComponent {
  val scanQuestionSeventeenModel: MutableLiveData<ScanQuestionSeventeenModel> =
      MutableLiveData(ScanQuestionSeventeenModel())

  var navArguments: Bundle? = null
}
