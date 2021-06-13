package skripsi.cika.doaharianpaud.detaildoa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import skripsi.cika.doaharianpaud.R
import skripsi.cika.doaharianpaud.databinding.ActivityDetailDoaBinding
import skripsi.cika.doaharianpaud.repo.listdoa.DoaModel

class DetailDoaActivity : AppCompatActivity() {

  private lateinit var binding: ActivityDetailDoaBinding

  private val doaModel by lazy {
    intent.getParcelableExtra<DoaModel>("INTENT_KEY")
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_detail_doa)

    binding.toolbar.title = doaModel?.doaName
    binding.textArabic.text = doaModel?.arabic
    binding.textTranslate.text = doaModel?.translate
    binding.textMeaning.text = doaModel?.meaning
  }
}