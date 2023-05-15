package com.arijitsapplication.app.modules.scanquestionseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionseven.`data`.model.ScanQuestionSevenModel
import org.koin.core.KoinComponent

class ScanQuestionSevenVM : ViewModel(), KoinComponent {
  val scanQuestionSevenModel: MutableLiveData<ScanQuestionSevenModel> =
      MutableLiveData(ScanQuestionSevenModel())

  var navArguments: Bundle? = null
}
