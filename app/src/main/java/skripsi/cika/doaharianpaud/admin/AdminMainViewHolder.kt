package skripsi.cika.doaharianpaud.admin

import androidx.recyclerview.widget.RecyclerView
import skripsi.cika.doaharianpaud.databinding.ItemDoaBinding
import skripsi.cika.doaharianpaud.repo.listdoa.DoaModel

class AdminMainViewHolder(private val binding: ItemDoaBinding) :
  RecyclerView.ViewHolder(binding.root) {
  fun bind(model: DoaModel, clickListener: (doaModel: DoaModel) -> Unit) {
    binding.doaModel = model

    binding.root.setOnClickListener { clickListener(model) }
  }
}
