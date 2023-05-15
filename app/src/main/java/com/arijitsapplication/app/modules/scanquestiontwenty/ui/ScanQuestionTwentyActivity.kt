package com.arijitsapplication.app.modules.scanquestiontwenty.ui

import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionTwentyBinding
import com.arijitsapplication.app.modules.scanquestiontwenty.`data`.viewmodel.ScanQuestionTwentyVM
import kotlin.String
import kotlin.Unit

class ScanQuestionTwentyActivity :
    BaseActivity<ActivityScanQuestionTwentyBinding>(R.layout.activity_scan_question_twenty) {
  private val viewModel: ScanQuestionTwentyVM by viewModels<ScanQuestionTwentyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionTwentyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_TWENTY_ACTIVITY"

  }
}
