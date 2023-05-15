package com.arijitsapplication.app.modules.finddocwebview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.finddocwebview.`data`.model.FindDocWebviewModel
import org.koin.core.KoinComponent

class FindDocWebviewVM : ViewModel(), KoinComponent {
  val findDocWebviewModel: MutableLiveData<FindDocWebviewModel> =
      MutableLiveData(FindDocWebviewModel())

  var navArguments: Bundle? = null
}
