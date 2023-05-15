package com.arijitsapplication.app.modules.scanquestiontwo.ui

import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionTwoBinding
import com.arijitsapplication.app.modules.scanquestionthree.ui.ScanQuestionThreeActivity
import com.arijitsapplication.app.modules.scanquestiontwelve.ui.ScanQuestionTwelveActivity
import com.arijitsapplication.app.modules.scanquestiontwo.`data`.viewmodel.ScanQuestionTwoVM
import kotlin.String
import kotlin.Unit

class ScanQuestionTwoActivity :
    BaseActivity<ActivityScanQuestionTwoBinding>(R.layout.activity_scan_question_two) {
  private val viewModel: ScanQuestionTwoVM by viewModels<ScanQuestionTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnYesOne.setOnClickListener {
      val destIntent = ScanQuestionThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNo.setOnClickListener {
      val destIntent = ScanQuestionTwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_TWO_ACTIVITY"

  }
}
