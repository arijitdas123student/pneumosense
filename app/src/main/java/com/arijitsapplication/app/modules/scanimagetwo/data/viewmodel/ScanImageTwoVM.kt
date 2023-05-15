package com.arijitsapplication.app.modules.scanimagetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanimagetwo.`data`.model.ScanImageTwoModel
import org.koin.core.KoinComponent

class ScanImageTwoVM : ViewModel(), KoinComponent {
  val scanImageTwoModel: MutableLiveData<ScanImageTwoModel> = MutableLiveData(ScanImageTwoModel())

  var navArguments: Bundle? = null
}
