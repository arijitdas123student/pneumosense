package com.arijitsapplication.app.modules.scanimageone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanImageOneBinding
import com.arijitsapplication.app.modules.scanimageone.`data`.viewmodel.ScanImageOneVM
import kotlin.String
import kotlin.Unit

class ScanImageOneActivity :
    BaseActivity<ActivityScanImageOneBinding>(R.layout.activity_scan_image_one) {
  private val viewModel: ScanImageOneVM by viewModels<ScanImageOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanImageOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_IMAGE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanImageOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
