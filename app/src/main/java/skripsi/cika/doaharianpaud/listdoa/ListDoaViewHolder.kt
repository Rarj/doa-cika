package skripsi.cika.doaharianpaud.listdoa

import androidx.recyclerview.widget.RecyclerView
import skripsi.cika.doaharianpaud.databinding.ItemDoaBinding
import skripsi.cika.doaharianpaud.repo.listdoa.DoaModel

class ListDoaViewHolder(private val binding: ItemDoaBinding) :
  RecyclerView.ViewHolder(binding.root) {
  fun bind(model: DoaModel, clickListener: (id: String) -> Unit) {
    binding.doaModel = model

    binding.root.setOnClickListener { clickListener(model.id) }
  }
}
