package com.arijitsapplication.app.modules.uploadrecentview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityUploadRecentViewBinding
import com.arijitsapplication.app.modules.uploadalbumview.ui.UploadAlbumViewActivity
import com.arijitsapplication.app.modules.uploadrecentview.`data`.model.StaggeredrectangleRowModel
import com.arijitsapplication.app.modules.uploadrecentview.`data`.viewmodel.UploadRecentViewVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class UploadRecentViewActivity :
    BaseActivity<ActivityUploadRecentViewBinding>(R.layout.activity_upload_recent_view) {
  private val viewModel: UploadRecentViewVM by viewModels<UploadRecentViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredrectangleAdapter =
    StaggeredrectangleAdapter(viewModel.staggeredrectangleList.value?:mutableListOf())
    binding.recyclerStaggeredrectangle.adapter = staggeredrectangleAdapter
    staggeredrectangleAdapter.setOnItemClickListener(
    object : StaggeredrectangleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : StaggeredrectangleRowModel) {
        onClickRecyclerStaggeredrectangle(view, position, item)
      }
    }
    )
    viewModel.staggeredrectangleList.observe(this) {
      staggeredrectangleAdapter.updateData(it)
    }
    binding.uploadRecentViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleftOne.setOnClickListener {
      finish()
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowarrowleftOne.setOnClickListener {
      val destIntent = UploadAlbumViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggeredrectangle(
    view: View,
    position: Int,
    item: StaggeredrectangleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "UPLOAD_RECENT_VIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UploadRecentViewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
