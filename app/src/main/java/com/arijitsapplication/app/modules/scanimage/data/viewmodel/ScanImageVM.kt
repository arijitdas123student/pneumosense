package com.arijitsapplication.app.modules.scanimage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanimage.`data`.model.ScanImageModel
import org.koin.core.KoinComponent

class ScanImageVM : ViewModel(), KoinComponent {
  val scanImageModel: MutableLiveData<ScanImageModel> = MutableLiveData(ScanImageModel())

  var navArguments: Bundle? = null
}
