package com.arijitsapplication.app.modules.scanquestionfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionFourBinding
import com.arijitsapplication.app.modules.scanquestionfive.ui.ScanQuestionFiveActivity
import com.arijitsapplication.app.modules.scanquestionfour.`data`.viewmodel.ScanQuestionFourVM
import com.arijitsapplication.app.modules.scanquestionfourteen.ui.ScanQuestionFourteenActivity
import kotlin.String
import kotlin.Unit

class ScanQuestionFourActivity :
    BaseActivity<ActivityScanQuestionFourBinding>(R.layout.activity_scan_question_four) {
  private val viewModel: ScanQuestionFourVM by viewModels<ScanQuestionFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnYesOne.setOnClickListener {
      val destIntent = ScanQuestionFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnNo.setOnClickListener {
      val destIntent = ScanQuestionFourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQuestionFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
