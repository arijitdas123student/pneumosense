package com.arijitsapplication.app.modules.uploadalbumview.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arijitsapplication.app.R
import com.arijitsapplication.app.databinding.RowGridrectangleelevenBinding
import com.arijitsapplication.app.modules.uploadalbumview.`data`.model.GridrectangleelevenRowModel
import kotlin.Int
import kotlin.collections.List

class GridrectangleelevenAdapter(
  var list: List<GridrectangleelevenRowModel>
) : RecyclerView.Adapter<GridrectangleelevenAdapter.RowGridrectangleelevenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridrectangleelevenVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridrectangleeleven,parent,false)
    return RowGridrectangleelevenVH(view)
  }

  override fun onBindViewHolder(holder: RowGridrectangleelevenVH, position: Int) {
    val gridrectangleelevenRowModel = GridrectangleelevenRowModel()
    // TODO uncomment following line after integration with data source
    // val gridrectangleelevenRowModel = list[position]
    holder.binding.gridrectangleelevenRowModel = gridrectangleelevenRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridrectangleelevenRowModel>) {
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
      item: GridrectangleelevenRowModel
    ) {
    }
  }

  inner class RowGridrectangleelevenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridrectangleelevenBinding = RowGridrectangleelevenBinding.bind(itemView)
    init {
      binding.linearColumnrectangleeleven.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, GridrectangleelevenRowModel())
      }
    }
  }
}
