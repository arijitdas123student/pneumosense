package com.arijitsapplication.app.modules.photoclickedview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityPhotoClickedViewBinding
import com.arijitsapplication.app.modules.cameraview.ui.CameraViewActivity
import com.arijitsapplication.app.modules.photoclickedview.`data`.viewmodel.PhotoClickedViewVM
import com.arijitsapplication.app.modules.scanimagetwo.ui.ScanImageTwoActivity
import kotlin.String
import kotlin.Unit

class PhotoClickedViewActivity :
    BaseActivity<ActivityPhotoClickedViewBinding>(R.layout.activity_photo_clicked_view) {
  private val viewModel: PhotoClickedViewVM by viewModels<PhotoClickedViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.photoClickedViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtUsePhoto.setOnClickListener {
      val destIntent = ScanImageTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtRetake.setOnClickListener {
      val destIntent = CameraViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PHOTO_CLICKED_VIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PhotoClickedViewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
