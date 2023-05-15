package com.arijitsapplication.app.modules.cameraview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.cameraview.`data`.model.CameraViewModel
import org.koin.core.KoinComponent

class CameraViewVM : ViewModel(), KoinComponent {
  val cameraViewModel: MutableLiveData<CameraViewModel> = MutableLiveData(CameraViewModel())

  var navArguments: Bundle? = null
}
