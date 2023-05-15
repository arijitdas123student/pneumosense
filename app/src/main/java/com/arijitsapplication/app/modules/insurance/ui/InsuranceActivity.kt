package com.arijitsapplication.app.modules.insurance.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityInsuranceBinding
import com.arijitsapplication.app.modules.home.ui.HomeActivity
import com.arijitsapplication.app.modules.insurance.`data`.model.InsuranceRowModel
import com.arijitsapplication.app.modules.insurance.`data`.viewmodel.InsuranceVM
import com.arijitsapplication.app.modules.location.ui.LocationActivity
import com.arijitsapplication.app.modules.message.ui.MessageActivity
import com.arijitsapplication.app.modules.scanquestiononecontainer.ui.ScanQuestionOneContainerActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InsuranceActivity : BaseActivity<ActivityInsuranceBinding>(R.layout.activity_insurance) {
  private val viewModel: InsuranceVM by viewModels<InsuranceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val insuranceAdapter = InsuranceAdapter(viewModel.insuranceList.value?:mutableListOf())
    binding.recyclerInsurance.adapter = insuranceAdapter
    insuranceAdapter.setOnItemClickListener(
    object : InsuranceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : InsuranceRowModel) {
        onClickRecyclerInsurance(view, position, item)
      }
    }
    )
    viewModel.insuranceList.observe(this) {
      insuranceAdapter.updateData(it)
    }
    binding.insuranceVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUser.setOnClickListener {
      val destIntent = LocationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBotNav1.setOnClickListener {
      val destIntent = MessageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBotNav.setOnClickListener {
      val destIntent = ScanQuestionOneContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerInsurance(
    view: View,
    position: Int,
    item: InsuranceRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "INSURANCE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InsuranceActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
