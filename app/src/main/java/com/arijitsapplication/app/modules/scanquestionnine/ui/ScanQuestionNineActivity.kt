package com.arijitsapplication.app.modules.scanquestionnine.ui

import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionNineBinding
import com.arijitsapplication.app.modules.scanquestionnine.`data`.viewmodel.ScanQuestionNineVM
import kotlin.String
import kotlin.Unit

class ScanQuestionNineActivity :
    BaseActivity<ActivityScanQuestionNineBinding>(R.layout.activity_scan_question_nine) {
  private val viewModel: ScanQuestionNineVM by viewModels<ScanQuestionNineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionNineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_NINE_ACTIVITY"

  }
}
