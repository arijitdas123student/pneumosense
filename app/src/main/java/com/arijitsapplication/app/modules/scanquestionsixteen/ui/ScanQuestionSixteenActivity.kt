package com.arijitsapplication.app.modules.scanquestionsixteen.ui

import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionSixteenBinding
import com.arijitsapplication.app.modules.scanquestionsixteen.`data`.viewmodel.ScanQuestionSixteenVM
import com.arijitsapplication.app.modules.scanquestionthree.ui.ScanQuestionThreeActivity
import com.arijitsapplication.app.modules.scanquestiontwelve.ui.ScanQuestionTwelveActivity
import kotlin.String
import kotlin.Unit

class ScanQuestionSixteenActivity :
    BaseActivity<ActivityScanQuestionSixteenBinding>(R.layout.activity_scan_question_sixteen) {
  private val viewModel: ScanQuestionSixteenVM by viewModels<ScanQuestionSixteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionSixteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnYes.setOnClickListener {
      val destIntent = ScanQuestionThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNoOne.setOnClickListener {
      val destIntent = ScanQuestionTwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_SIXTEEN_ACTIVITY"

  }
}
