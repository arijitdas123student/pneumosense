package com.arijitsapplication.app.modules.sharereport.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityShareReportBinding
import com.arijitsapplication.app.modules.report.ui.ReportActivity
import com.arijitsapplication.app.modules.sharereport.`data`.model.ListiconFourRowModel
import com.arijitsapplication.app.modules.sharereport.`data`.model.ListphotoFiveRowModel
import com.arijitsapplication.app.modules.sharereport.`data`.viewmodel.ShareReportVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ShareReportActivity : BaseActivity<ActivityShareReportBinding>(R.layout.activity_share_report)
    {
  private val viewModel: ShareReportVM by viewModels<ShareReportVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listphotoFiveAdapter =
    ListphotoFiveAdapter(viewModel.listphotoFiveList.value?:mutableListOf())
    binding.recyclerListphotoFive.adapter = listphotoFiveAdapter
    listphotoFiveAdapter.setOnItemClickListener(
    object : ListphotoFiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListphotoFiveRowModel) {
        onClickRecyclerListphotoFive(view, position, item)
      }
    }
    )
    viewModel.listphotoFiveList.observe(this) {
      listphotoFiveAdapter.updateData(it)
    }
    val listiconFourAdapter =
    ListiconFourAdapter(viewModel.listiconFourList.value?:mutableListOf())
    binding.recyclerListiconFour.adapter = listiconFourAdapter
    listiconFourAdapter.setOnItemClickListener(
    object : ListiconFourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListiconFourRowModel) {
        onClickRecyclerListiconFour(view, position, item)
      }
    }
    )
    viewModel.listiconFourList.observe(this) {
      listiconFourAdapter.updateData(it)
    }
    binding.shareReportVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnClose.setOnClickListener {
      val destIntent = ReportActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListphotoFive(
    view: View,
    position: Int,
    item: ListphotoFiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListiconFour(
    view: View,
    position: Int,
    item: ListiconFourRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SHARE_REPORT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ShareReportActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
