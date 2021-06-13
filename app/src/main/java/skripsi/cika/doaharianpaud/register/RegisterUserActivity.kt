package skripsi.cika.doaharianpaud.register

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.firebase.auth.FirebaseAuth
import skripsi.cika.doaharianpaud.R
import skripsi.cika.doaharianpaud.databinding.ActivityRegisterUserBinding
import skripsi.cika.doaharianpaud.showToast

class RegisterUserActivity : AppCompatActivity() {

  private lateinit var binding: ActivityRegisterUserBinding

  private val firebaseAuth = FirebaseAuth.getInstance()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_register_user)

  }

  private fun registerNewUser(email: String, pwd: String) {
    firebaseAuth.createUserWithEmailAndPassword(email, pwd)
      .addOnSuccessListener {
        showToast("${it.user?.displayName}")
      }
      .addOnFailureListener {
        showToast("$it")
      }
  }
}