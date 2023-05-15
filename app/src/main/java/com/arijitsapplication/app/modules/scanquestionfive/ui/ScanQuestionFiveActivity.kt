package com.arijitsapplication.app.modules.scanquestionfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionFiveBinding
import com.arijitsapplication.app.modules.scanquestionfifteen.ui.ScanQuestionFifteenActivity
import com.arijitsapplication.app.modules.scanquestionfive.`data`.viewmodel.ScanQuestionFiveVM
import com.arijitsapplication.app.modules.scanquestionsix.ui.ScanQuestionSixActivity
import kotlin.String
import kotlin.Unit

class ScanQuestionFiveActivity :
    BaseActivity<ActivityScanQuestionFiveBinding>(R.layout.activity_scan_question_five) {
  private val viewModel: ScanQuestionFiveVM by viewModels<ScanQuestionFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnYesOne.setOnClickListener {
      val destIntent = ScanQuestionSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNo.setOnClickListener {
      val destIntent = ScanQuestionFifteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQuestionFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
