package com.arijitsapplication.app.modules.nearbyhospitals.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.nearbyhospitals.`data`.model.NearbyHospitalsModel
import org.koin.core.KoinComponent

class NearbyHospitalsVM : ViewModel(), KoinComponent {
  val nearbyHospitalsModel: MutableLiveData<NearbyHospitalsModel> =
      MutableLiveData(NearbyHospitalsModel())

  var navArguments: Bundle? = null
}
