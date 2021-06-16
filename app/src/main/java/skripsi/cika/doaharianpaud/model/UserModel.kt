package skripsi.cika.doaharianpaud.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserModel(
  val uid: String,
  val studentDateOfBirth: String,
  val parentName: String,
  val address: String,
  val parentPhoneNumber: String,
  val email: String
) : Parcelable