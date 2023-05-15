package com.arijitsapplication.app.modules.scanquestionseventeen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionSeventeenBinding
import com.arijitsapplication.app.modules.scanquestioneight.ui.ScanQuestionEightActivity
import com.arijitsapplication.app.modules.scanquestionseventeen.`data`.viewmodel.ScanQuestionSeventeenVM
import kotlin.String
import kotlin.Unit

class ScanQuestionSeventeenActivity :
    BaseActivity<ActivityScanQuestionSeventeenBinding>(R.layout.activity_scan_question_seventeen) {
  private val viewModel: ScanQuestionSeventeenVM by viewModels<ScanQuestionSeventeenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionSeventeenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowicon.setOnClickListener {
      val destIntent = ScanQuestionEightActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_SEVENTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQuestionSeventeenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
