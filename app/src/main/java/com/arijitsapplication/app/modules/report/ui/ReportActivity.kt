package com.arijitsapplication.app.modules.report.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityReportBinding
import com.arijitsapplication.app.modules.report.`data`.viewmodel.ReportVM
import com.arijitsapplication.app.modules.sharereport.ui.ShareReportActivity
import kotlin.String
import kotlin.Unit

class ReportActivity : BaseActivity<ActivityReportBinding>(R.layout.activity_report) {
  private val viewModel: ReportVM by viewModels<ReportVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.reportVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageUpload.setOnClickListener {
      val destIntent = ShareReportActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REPORT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReportActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
