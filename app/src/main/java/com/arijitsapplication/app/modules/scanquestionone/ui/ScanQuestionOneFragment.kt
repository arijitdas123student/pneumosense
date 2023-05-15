package com.arijitsapplication.app.modules.scanquestionone.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseFragment
import com.arijitsapplication.app.databinding.FragmentScanQuestionOneBinding
import com.arijitsapplication.app.modules.scanquestionone.`data`.viewmodel.ScanQuestionOneVM
import kotlin.String
import kotlin.Unit

class ScanQuestionOneFragment :
    BaseFragment<FragmentScanQuestionOneBinding>(R.layout.fragment_scan_question_one) {
  private val viewModel: ScanQuestionOneVM by viewModels<ScanQuestionOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.scanQuestionOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "SCAN_QUESTION_ONE_FRAGMENT"


    fun getInstance(bundle: Bundle?): ScanQuestionOneFragment {
      val fragment = ScanQuestionOneFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
