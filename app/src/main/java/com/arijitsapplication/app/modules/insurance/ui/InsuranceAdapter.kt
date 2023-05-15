package com.arijitsapplication.app.modules.insurance.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arijitsapplication.app.R
import com.arijitsapplication.app.databinding.RowInsuranceBinding
import com.arijitsapplication.app.modules.insurance.`data`.model.InsuranceRowModel
import kotlin.Int
import kotlin.collections.List

class InsuranceAdapter(
  var list: List<InsuranceRowModel>
) : RecyclerView.Adapter<InsuranceAdapter.RowInsuranceVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowInsuranceVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_insurance,parent,false)
    return RowInsuranceVH(view)
  }

  override fun onBindViewHolder(holder: RowInsuranceVH, position: Int) {
    val insuranceRowModel = InsuranceRowModel()
    // TODO uncomment following line after integration with data source
    // val insuranceRowModel = list[position]
    holder.binding.insuranceRowModel = insuranceRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<InsuranceRowModel>) {
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
      item: InsuranceRowModel
    ) {
    }
  }

  inner class RowInsuranceVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowInsuranceBinding = RowInsuranceBinding.bind(itemView)
  }
}
