package com.arijitsapplication.app.modules.scanquestionten.ui

import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionTenBinding
import com.arijitsapplication.app.modules.scanquestionten.`data`.viewmodel.ScanQuestionTenVM
import kotlin.String
import kotlin.Unit

class ScanQuestionTenActivity :
    BaseActivity<ActivityScanQuestionTenBinding>(R.layout.activity_scan_question_ten) {
  private val viewModel: ScanQuestionTenVM by viewModels<ScanQuestionTenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionTenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_TEN_ACTIVITY"

  }
}
