package com.arijitsapplication.app.modules.scanquestioneighteen.ui

import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionEighteenBinding
import com.arijitsapplication.app.modules.scanquestioneighteen.`data`.viewmodel.ScanQuestionEighteenVM
import kotlin.String
import kotlin.Unit

class ScanQuestionEighteenActivity :
    BaseActivity<ActivityScanQuestionEighteenBinding>(R.layout.activity_scan_question_eighteen) {
  private val viewModel: ScanQuestionEighteenVM by viewModels<ScanQuestionEighteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionEighteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_EIGHTEEN_ACTIVITY"

  }
}
