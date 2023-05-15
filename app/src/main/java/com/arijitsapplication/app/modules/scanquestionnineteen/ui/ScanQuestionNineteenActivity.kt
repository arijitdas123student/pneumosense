package com.arijitsapplication.app.modules.scanquestionnineteen.ui

import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionNineteenBinding
import com.arijitsapplication.app.modules.scanimageone.ui.ScanImageOneActivity
import com.arijitsapplication.app.modules.scanquestionnineteen.`data`.viewmodel.ScanQuestionNineteenVM
import kotlin.String
import kotlin.Unit

class ScanQuestionNineteenActivity :
    BaseActivity<ActivityScanQuestionNineteenBinding>(R.layout.activity_scan_question_nineteen) {
  private val viewModel: ScanQuestionNineteenVM by viewModels<ScanQuestionNineteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionNineteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSend.setOnClickListener {
      val destIntent = ScanImageOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_NINETEEN_ACTIVITY"

  }
}
