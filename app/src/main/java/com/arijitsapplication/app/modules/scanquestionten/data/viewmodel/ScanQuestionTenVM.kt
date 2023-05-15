package com.arijitsapplication.app.modules.scanquestionten.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionten.`data`.model.ScanQuestionTenModel
import org.koin.core.KoinComponent

class ScanQuestionTenVM : ViewModel(), KoinComponent {
  val scanQuestionTenModel: MutableLiveData<ScanQuestionTenModel> =
      MutableLiveData(ScanQuestionTenModel())

  var navArguments: Bundle? = null
}
