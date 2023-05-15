package com.arijitsapplication.app.modules.scanimage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanImageBinding
import com.arijitsapplication.app.modules.home.ui.HomeActivity
import com.arijitsapplication.app.modules.insurance.ui.InsuranceActivity
import com.arijitsapplication.app.modules.location.ui.LocationActivity
import com.arijitsapplication.app.modules.message.ui.MessageActivity
import com.arijitsapplication.app.modules.savedreports.ui.SavedReportsActivity
import com.arijitsapplication.app.modules.scanimage.`data`.viewmodel.ScanImageVM
import com.arijitsapplication.app.modules.uploadimage.ui.UploadImageActivity
import kotlin.String
import kotlin.Unit

class ScanImageActivity : BaseActivity<ActivityScanImageBinding>(R.layout.activity_scan_image) {
  private val viewModel: ScanImageVM by viewModels<ScanImageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanImageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUploadImage.setOnClickListener {
      val destIntent = UploadImageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearBotNav.setOnClickListener {
      val destIntent = MessageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowcontainer.setOnClickListener {
      val destIntent = SavedReportsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCheckmark.setOnClickListener {
      val destIntent = InsuranceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnUser.setOnClickListener {
      val destIntent = LocationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCAN_IMAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanImageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
