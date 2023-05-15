package com.arijitsapplication.app.modules.finddocwebview.ui

import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityFindDocWebviewBinding
import com.arijitsapplication.app.modules.finddocwebview.`data`.viewmodel.FindDocWebviewVM
import kotlin.String
import kotlin.Unit

class FindDocWebviewActivity :
    BaseActivity<ActivityFindDocWebviewBinding>(R.layout.activity_find_doc_webview) {
  private val viewModel: FindDocWebviewVM by viewModels<FindDocWebviewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.findDocWebviewVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FIND_DOC_WEBVIEW_ACTIVITY"

  }
}
