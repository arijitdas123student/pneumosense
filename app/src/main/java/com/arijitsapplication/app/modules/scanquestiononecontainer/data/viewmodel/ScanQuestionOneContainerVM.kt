package com.arijitsapplication.app.modules.scanquestiononecontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestiononecontainer.`data`.model.ScanQuestionOneContainerModel
import org.koin.core.KoinComponent

class ScanQuestionOneContainerVM : ViewModel(), KoinComponent {
  val scanQuestionOneContainerModel: MutableLiveData<ScanQuestionOneContainerModel> =
      MutableLiveData(ScanQuestionOneContainerModel())

  var navArguments: Bundle? = null
}
