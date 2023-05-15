package com.arijitsapplication.app.modules.uploadalbumview.`data`.model

import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class UploadAlbumViewModel(
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
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhotos: String? = MyApp.getInstance().resources.getString(R.string.lbl_photos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyAlbums: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMediaTypes: String? = MyApp.getInstance().resources.getString(R.string.lbl_media_types)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelfies: String? = MyApp.getInstance().resources.getString(R.string.lbl_selfies)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwelveOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_122)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLivephotos: String? = MyApp.getInstance().resources.getString(R.string.lbl_live_photos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPortraits: String? = MyApp.getInstance().resources.getString(R.string.lbl_portraits)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_45)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScreenshots: String? = MyApp.getInstance().resources.getString(R.string.lbl_screenshots)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_35)

)
