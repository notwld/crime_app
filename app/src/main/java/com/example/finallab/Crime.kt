package com.example.finallab

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Crime(
    val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean
)  : Parcelable
