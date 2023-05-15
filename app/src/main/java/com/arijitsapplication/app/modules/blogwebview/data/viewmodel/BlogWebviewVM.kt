package com.arijitsapplication.app.modules.blogwebview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.blogwebview.`data`.model.BlogWebviewModel
import org.koin.core.KoinComponent

class BlogWebviewVM : ViewModel(), KoinComponent {
  val blogWebviewModel: MutableLiveData<BlogWebviewModel> = MutableLiveData(BlogWebviewModel())

  var navArguments: Bundle? = null
}
