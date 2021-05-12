package skripsi.cika.doaharianpaud

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import skripsi.cika.doaharianpaud.databinding.ActivityMainBinding
import skripsi.cika.doaharianpaud.listdoa.ListDoaActivity

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    binding.buttonDoa.setOnClickListener {
      val intent = Intent(this, ListDoaActivity::class.java)
      startActivity(intent)
    }

  }
}