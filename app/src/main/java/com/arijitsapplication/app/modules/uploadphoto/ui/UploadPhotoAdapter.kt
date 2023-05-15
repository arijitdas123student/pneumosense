package com.arijitsapplication.app.modules.uploadphoto.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arijitsapplication.app.R
import com.arijitsapplication.app.databinding.RowUploadPhotoBinding
import com.arijitsapplication.app.modules.uploadphoto.`data`.model.UploadPhotoRowModel
import kotlin.Int
import kotlin.collections.List

class UploadPhotoAdapter(
  var list: List<UploadPhotoRowModel>
) : RecyclerView.Adapter<UploadPhotoAdapter.RowUploadPhotoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowUploadPhotoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_upload_photo,parent,false)
    return RowUploadPhotoVH(view)
  }

  override fun onBindViewHolder(holder: RowUploadPhotoVH, position: Int) {
    val uploadPhotoRowModel = UploadPhotoRowModel()
    // TODO uncomment following line after integration with data source
    // val uploadPhotoRowModel = list[position]
    holder.binding.uploadPhotoRowModel = uploadPhotoRowModel
  }

  override fun getItemCount(): Int = 15
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<UploadPhotoRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: UploadPhotoRowModel
    ) {
    }
  }

  inner class RowUploadPhotoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowUploadPhotoBinding = RowUploadPhotoBinding.bind(itemView)
  }
}
