package com.chairunissa.recyclerview.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val username: String? = null,
    val phoneNumber:    Long? = null
): Parcelable