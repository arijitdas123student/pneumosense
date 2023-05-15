package com.arijitsapplication.app.modules.message.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arijitsapplication.app.R
import com.arijitsapplication.app.databinding.RowContactsBinding
import com.arijitsapplication.app.modules.message.`data`.model.ContactsRowModel
import kotlin.Int
import kotlin.collections.List

class ContactsAdapter(
  var list: List<ContactsRowModel>
) : RecyclerView.Adapter<ContactsAdapter.RowContactsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowContactsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_contacts,parent,false)
    return RowContactsVH(view)
  }

  override fun onBindViewHolder(holder: RowContactsVH, position: Int) {
    val contactsRowModel = ContactsRowModel()
    // TODO uncomment following line after integration with data source
    // val contactsRowModel = list[position]
    holder.binding.contactsRowModel = contactsRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ContactsRowModel>) {
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
      item: ContactsRowModel
    ) {
    }
  }

  inner class RowContactsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowContactsBinding = RowContactsBinding.bind(itemView)
  }
}
