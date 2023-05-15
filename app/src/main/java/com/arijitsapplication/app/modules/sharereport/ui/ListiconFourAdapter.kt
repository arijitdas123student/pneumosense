package com.arijitsapplication.app.modules.sharereport.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arijitsapplication.app.R
import com.arijitsapplication.app.databinding.RowListiconFourBinding
import com.arijitsapplication.app.modules.sharereport.`data`.model.ListiconFourRowModel
import kotlin.Int
import kotlin.collections.List

class ListiconFourAdapter(
  var list: List<ListiconFourRowModel>
) : RecyclerView.Adapter<ListiconFourAdapter.RowListiconFourVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListiconFourVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listicon_four,parent,false)
    return RowListiconFourVH(view)
  }

  override fun onBindViewHolder(holder: RowListiconFourVH, position: Int) {
    val listiconFourRowModel = ListiconFourRowModel()
    // TODO uncomment following line after integration with data source
    // val listiconFourRowModel = list[position]
    holder.binding.listiconFourRowModel = listiconFourRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListiconFourRowModel>) {
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
      item: ListiconFourRowModel
    ) {
    }
  }

  inner class RowListiconFourVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListiconFourBinding = RowListiconFourBinding.bind(itemView)
  }
}
