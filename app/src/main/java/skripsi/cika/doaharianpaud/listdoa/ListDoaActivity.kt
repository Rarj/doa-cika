package skripsi.cika.doaharianpaud.listdoa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import skripsi.cika.doaharianpaud.R
import skripsi.cika.doaharianpaud.databinding.ActivityListDoaBinding
import skripsi.cika.doaharianpaud.repo.listdoa.DoaModel
import skripsi.cika.doaharianpaud.repo.listdoa.DoaRepository

class ListDoaActivity : AppCompatActivity() {
  private lateinit var listDoa: List<DoaModel>

  private val adapter by lazy {
    ListDoaAdapter(listDoa = this.listDoa) {

    }
  }

  private lateinit var binding: ActivityListDoaBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_list_doa)

    listDoa = DoaRepository().getListDoa()

    binding.recyclerDoa.apply {
      layoutManager = LinearLayoutManager(this@ListDoaActivity)
      adapter = this@ListDoaActivity.adapter
    }
  }
}