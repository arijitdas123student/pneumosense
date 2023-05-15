package com.arijitsapplication.app.modules.scanquestionthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionThreeBinding
import com.arijitsapplication.app.modules.scanquestionfour.ui.ScanQuestionFourActivity
import com.arijitsapplication.app.modules.scanquestionthirteen.ui.ScanQuestionThirteenActivity
import com.arijitsapplication.app.modules.scanquestionthree.`data`.viewmodel.ScanQuestionThreeVM
import kotlin.String
import kotlin.Unit

class ScanQuestionThreeActivity :
    BaseActivity<ActivityScanQuestionThreeBinding>(R.layout.activity_scan_question_three) {
  private val viewModel: ScanQuestionThreeVM by viewModels<ScanQuestionThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnYesOne.setOnClickListener {
      val destIntent = ScanQuestionFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNo.setOnClickListener {
      val destIntent = ScanQuestionThirteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQuestionThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
