package com.arijitsapplication.app.modules.message.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arijitsapplication.app.R
import com.arijitsapplication.app.databinding.RowListcontainerFiveBinding
import com.arijitsapplication.app.modules.message.`data`.model.ListcontainerFiveRowModel
import kotlin.Int
import kotlin.collections.List

class ListcontainerFiveAdapter(
  var list: List<ListcontainerFiveRowModel>
) : RecyclerView.Adapter<ListcontainerFiveAdapter.RowListcontainerFiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcontainerFiveVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcontainer_five,parent,false)
    return RowListcontainerFiveVH(view)
  }

  override fun onBindViewHolder(holder: RowListcontainerFiveVH, position: Int) {
    val listcontainerFiveRowModel = ListcontainerFiveRowModel()
    // TODO uncomment following line after integration with data source
    // val listcontainerFiveRowModel = list[position]
    holder.binding.listcontainerFiveRowModel = listcontainerFiveRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListcontainerFiveRowModel>) {
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
      item: ListcontainerFiveRowModel
    ) {
    }
  }

  inner class RowListcontainerFiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcontainerFiveBinding = RowListcontainerFiveBinding.bind(itemView)
    init {
      binding.linearRowcontainer.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListcontainerFiveRowModel())
      }
    }
  }
}
