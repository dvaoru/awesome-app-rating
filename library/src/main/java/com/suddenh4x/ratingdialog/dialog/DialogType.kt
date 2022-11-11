package com.suddenh4x.ratingdialog.dialog

import android.os.Parcelable
import java.io.Serializable
import kotlinx.android.parcel.Parcelize

@Parcelize
enum class DialogType : Parcelable {
    RATING_OVERVIEW, RATING_STORE, FEEDBACK_MAIL, FEEDBACK_CUSTOM
}
