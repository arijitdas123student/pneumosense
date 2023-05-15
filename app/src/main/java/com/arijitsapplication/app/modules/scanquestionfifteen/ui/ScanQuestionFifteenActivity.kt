package com.arijitsapplication.app.modules.scanquestionfifteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionFifteenBinding
import com.arijitsapplication.app.modules.scanquestionfifteen.`data`.viewmodel.ScanQuestionFifteenVM
import com.arijitsapplication.app.modules.scanquestionseven.ui.ScanQuestionSevenActivity
import com.arijitsapplication.app.modules.scanquestionseventeen.ui.ScanQuestionSeventeenActivity
import kotlin.String
import kotlin.Unit

class ScanQuestionFifteenActivity :
    BaseActivity<ActivityScanQuestionFifteenBinding>(R.layout.activity_scan_question_fifteen) {
  private val viewModel: ScanQuestionFifteenVM by viewModels<ScanQuestionFifteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionFifteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnYes.setOnClickListener {
      val destIntent = ScanQuestionSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNoOne.setOnClickListener {
      val destIntent = ScanQuestionSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_FIFTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQuestionFifteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
