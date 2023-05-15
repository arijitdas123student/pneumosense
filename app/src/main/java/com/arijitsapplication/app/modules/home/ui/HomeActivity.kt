package com.arijitsapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityHomeBinding
import com.arijitsapplication.app.modules.blogwebview.ui.BlogWebviewActivity
import com.arijitsapplication.app.modules.home.`data`.viewmodel.HomeVM
import com.arijitsapplication.app.modules.insurance.ui.InsuranceActivity
import com.arijitsapplication.app.modules.location.ui.LocationActivity
import com.arijitsapplication.app.modules.message.ui.MessageActivity
import com.arijitsapplication.app.modules.messagedetails.ui.MessageDetailsActivity
import com.arijitsapplication.app.modules.scanquestiononecontainer.ui.ScanQuestionOneContainerActivity
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackcontainer.setOnClickListener {
      val destIntent = BlogWebviewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnMessages.setOnClickListener {
      val destIntent = MessageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowiconcolor.setOnClickListener {
      val destIntent = LocationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnUser.setOnClickListener {
      val destIntent = MessageDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBotNav1.setOnClickListener {
      val destIntent = MessageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCheckmark.setOnClickListener {
      val destIntent = InsuranceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBotNav.setOnClickListener {
      val destIntent = ScanQuestionOneContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
