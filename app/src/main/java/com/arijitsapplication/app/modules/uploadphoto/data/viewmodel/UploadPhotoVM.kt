package com.arijitsapplication.app.modules.uploadphoto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.uploadphoto.`data`.model.UploadPhotoModel
import com.arijitsapplication.app.modules.uploadphoto.`data`.model.UploadPhotoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class UploadPhotoVM : ViewModel(), KoinComponent {
  val uploadPhotoModel: MutableLiveData<UploadPhotoModel> = MutableLiveData(UploadPhotoModel())

  var navArguments: Bundle? = null

  val uploadPhotoList: MutableLiveData<MutableList<UploadPhotoRowModel>> =
      MutableLiveData(mutableListOf())
}
