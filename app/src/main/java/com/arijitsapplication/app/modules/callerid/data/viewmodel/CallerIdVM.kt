package com.arijitsapplication.app.modules.callerid.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.callerid.`data`.model.CallerIdModel
import com.arijitsapplication.app.modules.callerid.`data`.model.CallerIdRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CallerIdVM : ViewModel(), KoinComponent {
  val callerIdModel: MutableLiveData<CallerIdModel> = MutableLiveData(CallerIdModel())

  var navArguments: Bundle? = null

  val callerIdList: MutableLiveData<MutableList<CallerIdRowModel>> =
      MutableLiveData(mutableListOf())
}
