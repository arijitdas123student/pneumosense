package com.arijitsapplication.app.modules.uploadselectedview.ui

import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityUploadSelectedViewBinding
import com.arijitsapplication.app.modules.scanimagetwo.ui.ScanImageTwoActivity
import com.arijitsapplication.app.modules.uploadrecentview.ui.UploadRecentViewActivity
import com.arijitsapplication.app.modules.uploadselectedview.`data`.viewmodel.UploadSelectedViewVM
import kotlin.String
import kotlin.Unit

class UploadSelectedViewActivity :
    BaseActivity<ActivityUploadSelectedViewBinding>(R.layout.activity_upload_selected_view) {
  private val viewModel: UploadSelectedViewVM by viewModels<UploadSelectedViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.uploadSelectedViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtCancel.setOnClickListener {
      val destIntent = UploadRecentViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtChoose.setOnClickListener {
      val destIntent = ScanImageTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "UPLOAD_SELECTED_VIEW_ACTIVITY"

  }
}
