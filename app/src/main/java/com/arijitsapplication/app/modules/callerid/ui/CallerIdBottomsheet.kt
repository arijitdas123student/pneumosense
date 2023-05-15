package com.arijitsapplication.app.modules.callerid.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.arijitsapplication.app.databinding.BottomsheetCallerIdBinding
import com.arijitsapplication.app.modules.callerid.`data`.model.CallerIdRowModel
import com.arijitsapplication.app.modules.callerid.`data`.viewmodel.CallerIdVM
import com.arijitsapplication.app.modules.messagedetails.ui.MessageDetailsActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CallerIdBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetCallerIdBinding>(R.layout.bottomsheet_caller_id) {
  private val viewModel: CallerIdVM by viewModels<CallerIdVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val callerIdAdapter = CallerIdAdapter(viewModel.callerIdList.value?:mutableListOf())
    binding.recyclerCallerId.adapter = callerIdAdapter
    callerIdAdapter.setOnItemClickListener(
    object : CallerIdAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CallerIdRowModel) {
        onClickRecyclerCallerId(view, position, item)
      }
    }
    )
    viewModel.callerIdList.observe(requireActivity()) {
      callerIdAdapter.updateData(it)
    }
    binding.callerIdVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearDecline.setOnClickListener {
      val destIntent = MessageDetailsActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
    binding.viewCreatefromfraThree.setOnClickListener {
      val destIntent = MessageDetailsActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      dismiss()
    }
  }

  fun onClickRecyclerCallerId(
    view: View,
    position: Int,
    item: CallerIdRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CALLER_ID_BOTTOMSHEET"

  }
}
