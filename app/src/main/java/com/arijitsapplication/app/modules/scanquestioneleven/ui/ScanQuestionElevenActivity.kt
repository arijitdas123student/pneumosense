package com.arijitsapplication.app.modules.scanquestioneleven.ui

import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionElevenBinding
import com.arijitsapplication.app.modules.scanimageone.ui.ScanImageOneActivity
import com.arijitsapplication.app.modules.scanquestioneleven.`data`.viewmodel.ScanQuestionElevenVM
import kotlin.String
import kotlin.Unit

class ScanQuestionElevenActivity :
    BaseActivity<ActivityScanQuestionElevenBinding>(R.layout.activity_scan_question_eleven) {
  private val viewModel: ScanQuestionElevenVM by viewModels<ScanQuestionElevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionElevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnSend.setOnClickListener {
      val destIntent = ScanImageOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_ELEVEN_ACTIVITY"

  }
}
