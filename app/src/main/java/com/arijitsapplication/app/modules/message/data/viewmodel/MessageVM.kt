package com.arijitsapplication.app.modules.message.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arijitsapplication.app.modules.message.`data`.model.ContactsRowModel
import com.arijitsapplication.app.modules.message.`data`.model.ListcontainerFiveRowModel
import com.arijitsapplication.app.modules.message.`data`.model.MessageModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MessageVM : ViewModel(), KoinComponent {
  val messageModel: MutableLiveData<MessageModel> = MutableLiveData(MessageModel())

  var navArguments: Bundle? = null

  val contactsList: MutableLiveData<MutableList<ContactsRowModel>> =
      MutableLiveData(mutableListOf())

  val listcontainerFiveList: MutableLiveData<MutableList<ListcontainerFiveRowModel>> =
      MutableLiveData(mutableListOf())
}
