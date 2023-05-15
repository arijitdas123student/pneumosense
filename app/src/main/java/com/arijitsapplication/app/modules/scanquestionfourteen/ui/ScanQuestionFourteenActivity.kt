package com.arijitsapplication.app.modules.scanquestionfourteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionFourteenBinding
import com.arijitsapplication.app.modules.scanquestionfifteen.ui.ScanQuestionFifteenActivity
import com.arijitsapplication.app.modules.scanquestionfourteen.`data`.viewmodel.ScanQuestionFourteenVM
import com.arijitsapplication.app.modules.scanquestionsix.ui.ScanQuestionSixActivity
import kotlin.String
import kotlin.Unit

class ScanQuestionFourteenActivity :
    BaseActivity<ActivityScanQuestionFourteenBinding>(R.layout.activity_scan_question_fourteen) {
  private val viewModel: ScanQuestionFourteenVM by viewModels<ScanQuestionFourteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionFourteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnYes.setOnClickListener {
      val destIntent = ScanQuestionSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNoOne.setOnClickListener {
      val destIntent = ScanQuestionFifteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_FOURTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQuestionFourteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
