package com.arijitsapplication.app.modules.uploadalbumview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityUploadAlbumViewBinding
import com.arijitsapplication.app.modules.uploadalbumview.`data`.model.GridrectangleelevenRowModel
import com.arijitsapplication.app.modules.uploadalbumview.`data`.viewmodel.UploadAlbumViewVM
import com.arijitsapplication.app.modules.uploadrecentview.ui.UploadRecentViewActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class UploadAlbumViewActivity :
    BaseActivity<ActivityUploadAlbumViewBinding>(R.layout.activity_upload_album_view) {
  private val viewModel: UploadAlbumViewVM by viewModels<UploadAlbumViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridrectangleelevenAdapter =
    GridrectangleelevenAdapter(viewModel.gridrectangleelevenList.value?:mutableListOf())
    binding.recyclerGridrectangleeleven.adapter = gridrectangleelevenAdapter
    gridrectangleelevenAdapter.setOnItemClickListener(
    object : GridrectangleelevenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridrectangleelevenRowModel) {
        onClickRecyclerGridrectangleeleven(view, position, item)
      }
    }
    )
    viewModel.gridrectangleelevenList.observe(this) {
      gridrectangleelevenAdapter.updateData(it)
    }
    binding.uploadAlbumViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerGridrectangleeleven(
    view: View,
    position: Int,
    item: GridrectangleelevenRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnrectangleeleven -> {
        val destIntent = UploadRecentViewActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "UPLOAD_ALBUM_VIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UploadAlbumViewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
