package com.marina.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//неявно реализует Serializable
@Parcelize
enum class Level : Parcelable {
    TEST, EASY, NORMAL, HARD
}