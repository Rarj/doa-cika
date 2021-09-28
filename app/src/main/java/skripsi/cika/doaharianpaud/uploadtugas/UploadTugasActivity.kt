package skripsi.cika.doaharianpaud.uploadtugas

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import skripsi.cika.doaharianpaud.R
import skripsi.cika.doaharianpaud.databinding.ActivityUploadTugasBinding
import java.io.File

class UploadTugasActivity : AppCompatActivity() {

  private lateinit var binding: ActivityUploadTugasBinding

  private val AUDIO_CODE: Int = 2
  lateinit var uri: Uri
  var mStorage: StorageReference = FirebaseStorage.getInstance().getReference("Tugas")

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_upload_tugas)

    binding.buttonPickFile.setOnClickListener { pickFile() }

    binding.buttonUpload.setOnClickListener { upload() }
  }

  private fun pickFile() {
    val intent = Intent()
    intent.type = "audio/*"
    intent.action = Intent.ACTION_GET_CONTENT
    startActivityForResult(Intent.createChooser(intent, "Pilih Tugas"), AUDIO_CODE)
  }

  private fun upload() {
    val mReference = uri.lastPathSegment?.let { mStorage.child(it) }
    try {
      mReference?.putFile(uri)?.addOnSuccessListener {
        Toast.makeText(this, "Berhasil upload tugas", Toast.LENGTH_LONG).show()
        finish()
      }
    } catch (e: Exception) {
      Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show()
    }

  }

  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)

    if (resultCode == RESULT_OK) {
      if (requestCode == AUDIO_CODE) {
        uri = data?.data!!
        val file = File(uri.path)
        val fileName = file.name
        binding.textFile.text = fileName
      }
    }
  }
}