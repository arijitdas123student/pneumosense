package com.arijitsapplication.app.modules.uploadrecentview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.uploadrecentview.`data`.model.StaggeredrectangleRowModel
import com.arijitsapplication.app.modules.uploadrecentview.`data`.model.UploadRecentViewModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class UploadRecentViewVM : ViewModel(), KoinComponent {
  val uploadRecentViewModel: MutableLiveData<UploadRecentViewModel> =
      MutableLiveData(UploadRecentViewModel())

  var navArguments: Bundle? = null

  val staggeredrectangleList: MutableLiveData<MutableList<StaggeredrectangleRowModel>> =
      MutableLiveData(mutableListOf())
}
