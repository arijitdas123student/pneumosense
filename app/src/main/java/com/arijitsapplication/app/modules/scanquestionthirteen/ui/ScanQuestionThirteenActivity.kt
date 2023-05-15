package com.arijitsapplication.app.modules.scanquestionthirteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionThirteenBinding
import com.arijitsapplication.app.modules.scanquestionfive.ui.ScanQuestionFiveActivity
import com.arijitsapplication.app.modules.scanquestionfourteen.ui.ScanQuestionFourteenActivity
import com.arijitsapplication.app.modules.scanquestionthirteen.`data`.viewmodel.ScanQuestionThirteenVM
import kotlin.String
import kotlin.Unit

class ScanQuestionThirteenActivity :
    BaseActivity<ActivityScanQuestionThirteenBinding>(R.layout.activity_scan_question_thirteen) {
  private val viewModel: ScanQuestionThirteenVM by viewModels<ScanQuestionThirteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionThirteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnYes.setOnClickListener {
      val destIntent = ScanQuestionFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNoOne.setOnClickListener {
      val destIntent = ScanQuestionFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_THIRTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQuestionThirteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
