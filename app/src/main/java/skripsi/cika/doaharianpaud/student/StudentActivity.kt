package skripsi.cika.doaharianpaud.student

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import skripsi.cika.doaharianpaud.BR
import skripsi.cika.doaharianpaud.R
import skripsi.cika.doaharianpaud.databinding.ActivityStudentBinding
import skripsi.cika.doaharianpaud.login.LoginActivity
import skripsi.cika.doaharianpaud.model.UserModel
import skripsi.cika.doaharianpaud.uploadtugas.UploadTugasActivity

class StudentActivity : AppCompatActivity() {

  private val firebaseDatabase = FirebaseDatabase.getInstance().getReference("Users")
  private lateinit var binding: ActivityStudentBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_student)
    binding.lifecycleOwner = this

    loadDataStudent()
    listener()
  }

  private fun listener() {
    binding.toolbar.setNavigationOnClickListener { finish() }

    binding.toolbar.setOnMenuItemClickListener {
      when (it.itemId) {
        R.id.logout -> {
          getSharedPreferences("IS_USER_LOGIN", Context.MODE_PRIVATE)
            .edit()
            .remove("username")
            .apply()
          FirebaseAuth.getInstance().signOut()
          startActivity(Intent(this, LoginActivity::class.java))
          finishAffinity()
        }
      }
      return@setOnMenuItemClickListener true
    }

    binding.buttonUpload.setOnClickListener {
      startActivity(Intent(this, UploadTugasActivity::class.java))
    }
  }

  private fun loadDataStudent() {
    val uid = getSharedPreferences("IS_USER_LOGIN", MODE_PRIVATE).getString("username", "")
    firebaseDatabase.child(uid.toString())
      .addValueEventListener(object : ValueEventListener {
        override fun onDataChange(snapshot: DataSnapshot) {
          val user = snapshot.getValue(UserModel::class.java)
          binding.setVariable(BR.userModel, user)
        }

        override fun onCancelled(error: DatabaseError) {

        }
      })
  }
}