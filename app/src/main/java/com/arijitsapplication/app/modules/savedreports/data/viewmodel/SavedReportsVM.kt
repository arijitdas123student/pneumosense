package com.arijitsapplication.app.modules.savedreports.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.savedreports.`data`.model.SavedReportsModel
import org.koin.core.KoinComponent

class SavedReportsVM : ViewModel(), KoinComponent {
  val savedReportsModel: MutableLiveData<SavedReportsModel> = MutableLiveData(SavedReportsModel())

  var navArguments: Bundle? = null
}
