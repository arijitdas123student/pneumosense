package com.arijitsapplication.app.modules.uploadalbumview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.uploadalbumview.`data`.model.GridrectangleelevenRowModel
import com.arijitsapplication.app.modules.uploadalbumview.`data`.model.UploadAlbumViewModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class UploadAlbumViewVM : ViewModel(), KoinComponent {
  val uploadAlbumViewModel: MutableLiveData<UploadAlbumViewModel> =
      MutableLiveData(UploadAlbumViewModel())

  var navArguments: Bundle? = null

  val gridrectangleelevenList: MutableLiveData<MutableList<GridrectangleelevenRowModel>> =
      MutableLiveData(mutableListOf())
}
