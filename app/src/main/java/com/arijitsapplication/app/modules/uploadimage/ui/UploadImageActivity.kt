package com.arijitsapplication.app.modules.uploadimage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityUploadImageBinding
import com.arijitsapplication.app.modules.cameraview.ui.CameraViewActivity
import com.arijitsapplication.app.modules.scanimage.ui.ScanImageActivity
import com.arijitsapplication.app.modules.uploadimage.`data`.viewmodel.UploadImageVM
import com.arijitsapplication.app.modules.uploadphoto.ui.UploadPhotoActivity
import kotlin.String
import kotlin.Unit

class UploadImageActivity : BaseActivity<ActivityUploadImageBinding>(R.layout.activity_upload_image)
    {
  private val viewModel: UploadImageVM by viewModels<UploadImageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.uploadImageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnPhotoGallery.setOnClickListener {
      val destIntent = UploadPhotoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCancel.setOnClickListener {
      val destIntent = ScanImageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearColumnlineone.setOnClickListener {
      val destIntent = CameraViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "UPLOAD_IMAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UploadImageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
