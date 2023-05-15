package com.arijitsapplication.app.modules.sharereport.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.sharereport.`data`.model.ListiconFourRowModel
import com.arijitsapplication.app.modules.sharereport.`data`.model.ListphotoFiveRowModel
import com.arijitsapplication.app.modules.sharereport.`data`.model.ShareReportModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ShareReportVM : ViewModel(), KoinComponent {
  val shareReportModel: MutableLiveData<ShareReportModel> = MutableLiveData(ShareReportModel())

  var navArguments: Bundle? = null

  val listphotoFiveList: MutableLiveData<MutableList<ListphotoFiveRowModel>> =
      MutableLiveData(mutableListOf())

  val listiconFourList: MutableLiveData<MutableList<ListiconFourRowModel>> =
      MutableLiveData(mutableListOf())
}
