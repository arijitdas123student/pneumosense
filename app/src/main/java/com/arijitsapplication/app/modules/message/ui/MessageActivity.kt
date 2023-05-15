package com.arijitsapplication.app.modules.message.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.arijitsapplication.app.R
import com.arijitsapplication.app.appcomponents.base.BaseActivity
import com.arijitsapplication.app.databinding.ActivityMessageBinding
import com.arijitsapplication.app.modules.home.ui.HomeActivity
import com.arijitsapplication.app.modules.insurance.ui.InsuranceActivity
import com.arijitsapplication.app.modules.location.ui.LocationActivity
import com.arijitsapplication.app.modules.message.`data`.model.ContactsRowModel
import com.arijitsapplication.app.modules.message.`data`.model.ListcontainerFiveRowModel
import com.arijitsapplication.app.modules.message.`data`.viewmodel.MessageVM
import com.arijitsapplication.app.modules.messagedetails.ui.MessageDetailsActivity
import com.arijitsapplication.app.modules.scanquestiononecontainer.ui.ScanQuestionOneContainerActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MessageActivity : BaseActivity<ActivityMessageBinding>(R.layout.activity_message) {
  private val viewModel: MessageVM by viewModels<MessageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val contactsAdapter = ContactsAdapter(viewModel.contactsList.value?:mutableListOf())
    binding.recyclerContacts.adapter = contactsAdapter
    contactsAdapter.setOnItemClickListener(
    object : ContactsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ContactsRowModel) {
        onClickRecyclerContacts(view, position, item)
      }
    }
    )
    viewModel.contactsList.observe(this) {
      contactsAdapter.updateData(it)
    }
    val listcontainerFiveAdapter =
    ListcontainerFiveAdapter(viewModel.listcontainerFiveList.value?:mutableListOf())
    binding.recyclerListcontainerFive.adapter = listcontainerFiveAdapter
    listcontainerFiveAdapter.setOnItemClickListener(
    object : ListcontainerFiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListcontainerFiveRowModel) {
        onClickRecyclerListcontainerFive(view, position, item)
      }
    }
    )
    viewModel.listcontainerFiveList.observe(this) {
      listcontainerFiveAdapter.updateData(it)
    }
    binding.messageVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.linearBotNav.setOnClickListener {
      val destIntent = ScanQuestionOneContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnUser.setOnClickListener {
      val destIntent = LocationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCheckmark.setOnClickListener {
      val destIntent = InsuranceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerContacts(
    view: View,
    position: Int,
    item: ContactsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListcontainerFive(
    view: View,
    position: Int,
    item: ListcontainerFiveRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowcontainer -> {
        val destIntent = MessageDetailsActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "MESSAGE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, MessageActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
