package skripsi.cika.doaharianpaud.repo.listdoa

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DoaModel(
  val id: String,
  val doaName: String,
  val arabic: String,
  val translate: String,
  val meaning: String
) : Parcelable