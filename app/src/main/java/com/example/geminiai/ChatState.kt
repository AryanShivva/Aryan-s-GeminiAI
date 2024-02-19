package com.example.geminiai

import android.graphics.Bitmap
import com.example.geminiai.data.Chat

data class ChatState (

    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null

)