package com.arijitsapplication.app.modules.uploadphoto.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityUploadPhotoBinding
import com.arijitsapplication.app.modules.uploadphoto.`data`.model.UploadPhotoRowModel
import com.arijitsapplication.app.modules.uploadphoto.`data`.viewmodel.UploadPhotoVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class UploadPhotoActivity : BaseActivity<ActivityUploadPhotoBinding>(R.layout.activity_upload_photo)
    {
  private val viewModel: UploadPhotoVM by viewModels<UploadPhotoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val uploadPhotoAdapter =
    UploadPhotoAdapter(viewModel.uploadPhotoList.value?:mutableListOf())
    binding.recyclerUploadPhoto.adapter = uploadPhotoAdapter
    uploadPhotoAdapter.setOnItemClickListener(
    object : UploadPhotoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : UploadPhotoRowModel) {
        onClickRecyclerUploadPhoto(view, position, item)
      }
    }
    )
    viewModel.uploadPhotoList.observe(this) {
      uploadPhotoAdapter.updateData(it)
    }
    binding.uploadPhotoVM = viewModel
    setUpSearchViewLightSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerUploadPhoto(
    view: View,
    position: Int,
    item: UploadPhotoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewLightSearchListener(): Unit {
    binding.searchViewLightSearch.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "UPLOAD_PHOTO_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, UploadPhotoActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
