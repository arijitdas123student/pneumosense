package com.arijitsapplication.app.modules.insurance.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.insurance.`data`.model.InsuranceModel
import com.arijitsapplication.app.modules.insurance.`data`.model.InsuranceRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class InsuranceVM : ViewModel(), KoinComponent {
  val insuranceModel: MutableLiveData<InsuranceModel> = MutableLiveData(InsuranceModel())

  var navArguments: Bundle? = null

  val insuranceList: MutableLiveData<MutableList<InsuranceRowModel>> =
      MutableLiveData(mutableListOf())
}
