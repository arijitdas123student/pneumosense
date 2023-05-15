package com.arijitsapplication.app.modules.savedreports.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivitySavedReportsBinding
import com.arijitsapplication.app.modules.home.ui.HomeActivity
import com.arijitsapplication.app.modules.insurance.ui.InsuranceActivity
import com.arijitsapplication.app.modules.location.ui.LocationActivity
import com.arijitsapplication.app.modules.message.ui.MessageActivity
import com.arijitsapplication.app.modules.savedreports.`data`.viewmodel.SavedReportsVM
import kotlin.String
import kotlin.Unit

class SavedReportsActivity :
    BaseActivity<ActivitySavedReportsBinding>(R.layout.activity_saved_reports) {
  private val viewModel: SavedReportsVM by viewModels<SavedReportsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.savedReportsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCheckmark.setOnClickListener {
      val destIntent = InsuranceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBotNav.setOnClickListener {
      val destIntent = MessageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnUser.setOnClickListener {
      val destIntent = LocationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SAVED_REPORTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SavedReportsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
