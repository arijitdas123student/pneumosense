package com.arijitsapplication.app.modules.scanquestionnineteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionnineteen.`data`.model.ScanQuestionNineteenModel
import org.koin.core.KoinComponent

class ScanQuestionNineteenVM : ViewModel(), KoinComponent {
  val scanQuestionNineteenModel: MutableLiveData<ScanQuestionNineteenModel> =
      MutableLiveData(ScanQuestionNineteenModel())

  var navArguments: Bundle? = null
}
