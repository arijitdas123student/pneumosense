package com.arijitsapplication.app.modules.scanquestionseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionSevenBinding
import com.arijitsapplication.app.modules.scanquestioneight.ui.ScanQuestionEightActivity
import com.arijitsapplication.app.modules.scanquestionseven.`data`.viewmodel.ScanQuestionSevenVM
import kotlin.String
import kotlin.Unit

class ScanQuestionSevenActivity :
    BaseActivity<ActivityScanQuestionSevenBinding>(R.layout.activity_scan_question_seven) {
  private val viewModel: ScanQuestionSevenVM by viewModels<ScanQuestionSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowicon.setOnClickListener {
      val destIntent = ScanQuestionEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_SEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQuestionSevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
