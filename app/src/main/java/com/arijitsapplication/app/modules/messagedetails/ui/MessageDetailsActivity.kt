package com.arijitsapplication.app.modules.messagedetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityMessageDetailsBinding
import com.arijitsapplication.app.modules.messagedetails.`data`.viewmodel.MessageDetailsVM
import kotlin.String
import kotlin.Unit

class MessageDetailsActivity :
    BaseActivity<ActivityMessageDetailsBinding>(R.layout.activity_message_details) {
  private val viewModel: MessageDetailsVM by viewModels<MessageDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.messageDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MESSAGE_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MessageDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
