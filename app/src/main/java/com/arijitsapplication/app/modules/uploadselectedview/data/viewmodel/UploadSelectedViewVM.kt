package com.arijitsapplication.app.modules.uploadselectedview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.uploadselectedview.`data`.model.UploadSelectedViewModel
import org.koin.core.KoinComponent

class UploadSelectedViewVM : ViewModel(), KoinComponent {
  val uploadSelectedViewModel: MutableLiveData<UploadSelectedViewModel> =
      MutableLiveData(UploadSelectedViewModel())

  var navArguments: Bundle? = null
}
