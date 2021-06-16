package skripsi.cika.doaharianpaud.inputnilai

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import skripsi.cika.doaharianpaud.R
import skripsi.cika.doaharianpaud.databinding.ActivityInputNilaiMuridBinding
import skripsi.cika.doaharianpaud.model.UserModel

class InputNilaiMuridActivity : AppCompatActivity() {
  private val databaseReference = FirebaseDatabase.getInstance()

  private val userList = arrayListOf<UserModel>()
  private lateinit var binding: ActivityInputNilaiMuridBinding
  private val adapter by lazy {
    InputNilaiMuridAdapter(userList)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_input_nilai_murid)

    databaseReference.reference.child("Users").addValueEventListener(object : ValueEventListener {
      override fun onDataChange(snapshot: DataSnapshot) {

        snapshot.children.forEach {
          val user = it.getValue(UserModel::class.java)
          if (user != null) {
            userList.add(user)
          }

          binding.recyclerUser.apply {
            layoutManager = LinearLayoutManager(this@InputNilaiMuridActivity)
            adapter = this@InputNilaiMuridActivity.adapter
          }
          adapter.notifyDataSetChanged()
        }
      }

      override fun onCancelled(error: DatabaseError) {

      }
    })
  }
}