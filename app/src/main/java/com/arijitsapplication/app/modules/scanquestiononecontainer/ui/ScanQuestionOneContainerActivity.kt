package com.arijitsapplication.app.modules.scanquestiononecontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityScanQuestionOneContainerBinding
import com.arijitsapplication.app.extensions.loadFragment
import com.arijitsapplication.app.modules.scanquestionone.ui.ScanQuestionOneFragment
import com.arijitsapplication.app.modules.scanquestiononecontainer.`data`.viewmodel.ScanQuestionOneContainerVM
import kotlin.String
import kotlin.Unit

class ScanQuestionOneContainerActivity :
    BaseActivity<ActivityScanQuestionOneContainerBinding>(R.layout.activity_scan_question_one_container)
    {
  private val viewModel: ScanQuestionOneContainerVM by viewModels<ScanQuestionOneContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanQuestionOneContainerVM = viewModel
    val destFragment = ScanQuestionOneFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = ScanQuestionOneFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearRowlightbulb.setOnClickListener {
      val destFragment = ScanQuestionOneFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = ScanQuestionOneFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_ONE_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScanQuestionOneContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
