package com.arijitsapplication.app.modules.scanquestionthirteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionthirteen.`data`.model.ScanQuestionThirteenModel
import org.koin.core.KoinComponent

class ScanQuestionThirteenVM : ViewModel(), KoinComponent {
  val scanQuestionThirteenModel: MutableLiveData<ScanQuestionThirteenModel> =
      MutableLiveData(ScanQuestionThirteenModel())

  var navArguments: Bundle? = null
}
