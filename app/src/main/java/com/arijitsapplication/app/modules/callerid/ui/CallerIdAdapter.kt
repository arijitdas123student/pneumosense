package com.arijitsapplication.app.modules.callerid.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arijitsapplication.app.R
import com.arijitsapplication.app.databinding.RowCallerIdBinding
import com.arijitsapplication.app.modules.callerid.`data`.model.CallerIdRowModel
import kotlin.Int
import kotlin.collections.List

class CallerIdAdapter(
  var list: List<CallerIdRowModel>
) : RecyclerView.Adapter<CallerIdAdapter.RowCallerIdVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCallerIdVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_caller_id,parent,false)
    return RowCallerIdVH(view)
  }

  override fun onBindViewHolder(holder: RowCallerIdVH, position: Int) {
    val callerIdRowModel = CallerIdRowModel()
    // TODO uncomment following line after integration with data source
    // val callerIdRowModel = list[position]
    holder.binding.callerIdRowModel = callerIdRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CallerIdRowModel>) {
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
      item: CallerIdRowModel
    ) {
    }
  }

  inner class RowCallerIdVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCallerIdBinding = RowCallerIdBinding.bind(itemView)
  }
}
