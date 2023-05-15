package com.arijitsapplication.app.modules.photoclickedview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.photoclickedview.`data`.model.PhotoClickedViewModel
import org.koin.core.KoinComponent

class PhotoClickedViewVM : ViewModel(), KoinComponent {
  val photoClickedViewModel: MutableLiveData<PhotoClickedViewModel> =
      MutableLiveData(PhotoClickedViewModel())

  var navArguments: Bundle? = null
}
