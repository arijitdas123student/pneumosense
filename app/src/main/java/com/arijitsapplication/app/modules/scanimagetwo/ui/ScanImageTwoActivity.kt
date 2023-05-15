package com.arijitsapplication.app.modules.scanimagetwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanImageTwoBinding
import com.arijitsapplication.app.modules.home.ui.HomeActivity
import com.arijitsapplication.app.modules.insurance.ui.InsuranceActivity
import com.arijitsapplication.app.modules.location.ui.LocationActivity
import com.arijitsapplication.app.modules.message.ui.MessageActivity
import com.arijitsapplication.app.modules.report.ui.ReportActivity
import com.arijitsapplication.app.modules.savedreports.ui.SavedReportsActivity
import com.arijitsapplication.app.modules.scanimagetwo.`data`.viewmodel.ScanImageTwoVM
import kotlin.String
import kotlin.Unit

class ScanImageTwoActivity :
    BaseActivity<ActivityScanImageTwoBinding>(R.layout.activity_scan_image_two) {
  private val viewModel: ScanImageTwoVM by viewModels<ScanImageTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanImageTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCheckmark.setOnClickListener {
      val destIntent = InsuranceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBotNav.setOnClickListener {
      val destIntent = MessageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnUser.setOnClickListener {
      val destIntent = LocationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowcontainer.setOnClickListener {
      val destIntent = SavedReportsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnGenerateReportOne.setOnClickListener {
      val destIntent = ReportActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_IMAGE_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanImageTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
