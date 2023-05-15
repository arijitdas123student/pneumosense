package com.arijitsapplication.app.modules.scanquestionsixteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanquestionsixteen.`data`.model.ScanQuestionSixteenModel
import org.koin.core.KoinComponent

class ScanQuestionSixteenVM : ViewModel(), KoinComponent {
  val scanQuestionSixteenModel: MutableLiveData<ScanQuestionSixteenModel> =
      MutableLiveData(ScanQuestionSixteenModel())

  var navArguments: Bundle? = null
}
