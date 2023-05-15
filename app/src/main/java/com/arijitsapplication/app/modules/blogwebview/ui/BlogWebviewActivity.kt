package com.arijitsapplication.app.modules.blogwebview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityBlogWebviewBinding
import com.arijitsapplication.app.modules.blogwebview.`data`.viewmodel.BlogWebviewVM
import com.arijitsapplication.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class BlogWebviewActivity : BaseActivity<ActivityBlogWebviewBinding>(R.layout.activity_blog_webview)
    {
  private val viewModel: BlogWebviewVM by viewModels<BlogWebviewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.blogWebviewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtDone.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BLOG_WEBVIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BlogWebviewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
