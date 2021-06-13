package skripsi.cika.doaharianpaud.listdoa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import skripsi.cika.doaharianpaud.R
import skripsi.cika.doaharianpaud.databinding.ActivityAdminMainBinding
import skripsi.cika.doaharianpaud.detaildoa.DetailDoaActivity
import skripsi.cika.doaharianpaud.repo.listdoa.DoaModel
import skripsi.cika.doaharianpaud.repo.listdoa.DoaRepository
import skripsi.cika.doaharianpaud.showToast

class AdminMainActivity : AppCompatActivity() {
  private lateinit var listDoa: List<DoaModel>

  private val adapter by lazy {
    AdminMainAdapter(listDoa = this.listDoa) {
      val intent = Intent(this, DetailDoaActivity::class.java)
      intent.putExtra("INTENT_KEY", it)
      startActivity(intent)
    }
  }

  private lateinit var binding: ActivityAdminMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_admin_main)

    listDoa = DoaRepository().getListDoa()

    binding.toolbar.setOnMenuItemClickListener {
      when (it.itemId) {
        R.id.add_new_user -> {
          showToast("add new user")
        }
        R.id.input_nilai -> {
          showToast("input nilai murid")
        }
      }
      return@setOnMenuItemClickListener true
    }

    binding.recyclerDoa.apply {
      layoutManager = LinearLayoutManager(this@AdminMainActivity)
      adapter = this@AdminMainActivity.adapter
    }
  }
}