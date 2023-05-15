package com.arijitsapplication.app.modules.scanquestiontwelve.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionTwelveBinding
import com.arijitsapplication.app.modules.scanquestionfour.ui.ScanQuestionFourActivity
import com.arijitsapplication.app.modules.scanquestionthirteen.ui.ScanQuestionThirteenActivity
import com.arijitsapplication.app.modules.scanquestiontwelve.`data`.viewmodel.ScanQuestionTwelveVM
import kotlin.String
import kotlin.Unit

class ScanQuestionTwelveActivity :
    BaseActivity<ActivityScanQuestionTwelveBinding>(R.layout.activity_scan_question_twelve) {
  private val viewModel: ScanQuestionTwelveVM by viewModels<ScanQuestionTwelveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionTwelveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNoOne.setOnClickListener {
      val destIntent = ScanQuestionThirteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnYes.setOnClickListener {
      val destIntent = ScanQuestionFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_TWELVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQuestionTwelveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
