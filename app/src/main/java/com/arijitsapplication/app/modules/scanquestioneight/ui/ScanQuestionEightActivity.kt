package com.arijitsapplication.app.modules.scanquestioneight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionEightBinding
import com.arijitsapplication.app.modules.scanquestioneight.`data`.viewmodel.ScanQuestionEightVM
import kotlin.String
import kotlin.Unit

class ScanQuestionEightActivity :
    BaseActivity<ActivityScanQuestionEightBinding>(R.layout.activity_scan_question_eight) {
  private val viewModel: ScanQuestionEightVM by viewModels<ScanQuestionEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_EIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQuestionEightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
