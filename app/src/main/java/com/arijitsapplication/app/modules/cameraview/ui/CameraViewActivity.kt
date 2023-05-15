package com.arijitsapplication.app.modules.cameraview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.arijitsapplication.app.databinding.ActivityCameraViewBinding
import com.arijitsapplication.app.modules.cameraview.`data`.viewmodel.CameraViewVM
import com.arijitsapplication.app.modules.photoclickedview.ui.PhotoClickedViewActivity
import com.arijitsapplication.app.modules.uploadimage.ui.UploadImageActivity
import kotlin.String
import kotlin.Unit

class CameraViewActivity : BaseActivity<ActivityCameraViewBinding>(R.layout.activity_camera_view) {
  private val viewModel: CameraViewVM by viewModels<CameraViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cameraViewVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.linearColumnellipsetwo.setOnClickListener {
      val destIntent = PhotoClickedViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtCancel.setOnClickListener {
      val destIntent = UploadImageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CAMERA_VIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CameraViewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
