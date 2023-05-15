package com.arijitsapplication.app.modules.sharereport.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arijitsapplication.app.R
import com.arijitsapplication.app.databinding.RowListphotoFiveBinding
import com.arijitsapplication.app.modules.sharereport.`data`.model.ListphotoFiveRowModel
import kotlin.Int
import kotlin.collections.List

class ListphotoFiveAdapter(
  var list: List<ListphotoFiveRowModel>
) : RecyclerView.Adapter<ListphotoFiveAdapter.RowListphotoFiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListphotoFiveVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listphoto_five,parent,false)
    return RowListphotoFiveVH(view)
  }

  override fun onBindViewHolder(holder: RowListphotoFiveVH, position: Int) {
    val listphotoFiveRowModel = ListphotoFiveRowModel()
    // TODO uncomment following line after integration with data source
    // val listphotoFiveRowModel = list[position]
    holder.binding.listphotoFiveRowModel = listphotoFiveRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListphotoFiveRowModel>) {
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
      item: ListphotoFiveRowModel
    ) {
    }
  }

  inner class RowListphotoFiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListphotoFiveBinding = RowListphotoFiveBinding.bind(itemView)
  }
}
