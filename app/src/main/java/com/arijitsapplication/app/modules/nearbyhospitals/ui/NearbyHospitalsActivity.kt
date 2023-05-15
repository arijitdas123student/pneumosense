package com.arijitsapplication.app.modules.nearbyhospitals.ui

import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityNearbyHospitalsBinding
import com.arijitsapplication.app.modules.nearbyhospitals.`data`.viewmodel.NearbyHospitalsVM
import kotlin.String
import kotlin.Unit

class NearbyHospitalsActivity :
    BaseActivity<ActivityNearbyHospitalsBinding>(R.layout.activity_nearby_hospitals) {
  private val viewModel: NearbyHospitalsVM by viewModels<NearbyHospitalsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.nearbyHospitalsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NEARBY_HOSPITALS_ACTIVITY"

  }
}
