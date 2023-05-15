package com.arijitsapplication.app.modules.scanquestionsix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionSixBinding
import com.arijitsapplication.app.modules.scanquestionseven.ui.ScanQuestionSevenActivity
import com.arijitsapplication.app.modules.scanquestionseventeen.ui.ScanQuestionSeventeenActivity
import com.arijitsapplication.app.modules.scanquestionsix.`data`.viewmodel.ScanQuestionSixVM
import kotlin.String
import kotlin.Unit

class ScanQuestionSixActivity :
    BaseActivity<ActivityScanQuestionSixBinding>(R.layout.activity_scan_question_six) {
  private val viewModel: ScanQuestionSixVM by viewModels<ScanQuestionSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnYesOne.setOnClickListener {
      val destIntent = ScanQuestionSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNo.setOnClickListener {
      val destIntent = ScanQuestionSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_SIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQuestionSixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
