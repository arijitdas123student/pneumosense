package com.arijitsapplication.app.modules.uploadrecentview.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class UploadRecentViewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLargeTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_upload_image)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadImage: String? = MyApp.getInstance().resources.getString(R.string.lbl_upload_image)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbums: String? = MyApp.getInstance().resources.getString(R.string.lbl_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_recents)

)
