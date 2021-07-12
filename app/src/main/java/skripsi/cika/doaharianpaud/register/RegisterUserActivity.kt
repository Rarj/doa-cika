package skripsi.cika.doaharianpaud.register

import android.os.Bundle
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import skripsi.cika.doaharianpaud.R
import skripsi.cika.doaharianpaud.databinding.ActivityRegisterUserBinding
import skripsi.cika.doaharianpaud.model.UserModel
import skripsi.cika.doaharianpaud.showToast

class RegisterUserActivity : AppCompatActivity() {

  private lateinit var binding: ActivityRegisterUserBinding

  private val firebaseAuth = FirebaseAuth.getInstance()
  private val databaseReference = FirebaseDatabase.getInstance().reference

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_register_user)

    binding.toolbar.setNavigationOnClickListener { finish() }

    binding.buttonRegister.setOnClickListener {
      if (binding.inputEmail.text.toString().isNotEmpty() &&
        Patterns.EMAIL_ADDRESS.matcher(binding.inputEmail.text.toString()).matches()
      ) {
        registerNewUser(
          binding.inputEmail.text.toString(),
          binding.inputPassword.text.toString(),
        )
      } else {
        showToast("Isi semua field dengan benar")
      }

    }

  }

  private fun registerNewUser(email: String, pwd: String) {
    firebaseAuth.createUserWithEmailAndPassword(email, pwd)
      .addOnSuccessListener {
        if (it.user != null) {
          databaseReference.child("Users").child(it.user?.uid.toString())
            .setValue(
              UserModel(
                it.user?.uid.toString(),
                binding.inputStudentName.text.toString(),
                binding.inputStudentDateOfBirth.text.toString(),
                binding.inputParentName.text.toString(),
                binding.inputAddress.text.toString(),
                binding.inputPhoneNumber.text.toString(),
                binding.inputEmail.text.toString()
              )
            )
            .addOnSuccessListener {
              showToast("Sukses Mendaftarkan Siswa Baru")
              finish()
            }
            .addOnFailureListener {
              showToast("Terjadi kesalahan. Silahkan ulangi proses pendaftaran.")
            }
        }
      }
      .addOnFailureListener {
        showToast("Terjadi kesalahan. Silahkan ulangi proses pendaftaran.")
      }
  }
}