package com.arijitsapplication.app.modules.scanimageone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.scanimageone.`data`.model.ScanImageOneModel
import org.koin.core.KoinComponent

class ScanImageOneVM : ViewModel(), KoinComponent {
  val scanImageOneModel: MutableLiveData<ScanImageOneModel> = MutableLiveData(ScanImageOneModel())

  var navArguments: Bundle? = null
}
