package skripsi.cika.doaharianpaud.login

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.firebase.auth.FirebaseAuth
import skripsi.cika.doaharianpaud.R
import skripsi.cika.doaharianpaud.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

  private lateinit var binding: ActivityLoginBinding

  private val firebaseAuth = FirebaseAuth.getInstance()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

    binding.buttonLogin.setOnClickListener {
      val isAdmin = binding.inputEmail.text.toString().equals("admin", ignoreCase = true) &&
            binding.inputPassword.text.toString().equals("admin", ignoreCase = true)

      if (isAdmin) {
        Toast.makeText(this, "show admin screen", Toast.LENGTH_SHORT).show()
        return@setOnClickListener
      }

      val isEmailBlank = binding.inputEmail.text.toString().isBlank()
      val isPwdBlank = binding.inputPassword.text.toString().isBlank()
      if (isEmailBlank || isPwdBlank) {
        Toast.makeText(this, "Masukkan email atau password dengan benar", Toast.LENGTH_SHORT).show()
        return@setOnClickListener
      }

      loginUser()
    }
  }

  private fun loginUser() {
    firebaseAuth.signInWithEmailAndPassword(
      binding.inputEmail.text.toString(),
      binding.inputPassword.text.toString(),
    ).addOnSuccessListener {
      if (it.user != null) {
        Toast.makeText(this, "Berhasil login sebagain user ${it.user?.email}", Toast.LENGTH_SHORT).show()
      }
    }.addOnFailureListener {
      Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
    }
  }
}