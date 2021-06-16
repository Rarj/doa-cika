package skripsi.cika.doaharianpaud.admin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import skripsi.cika.doaharianpaud.databinding.ItemDoaBinding
import skripsi.cika.doaharianpaud.repo.listdoa.DoaModel

class AdminMainAdapter(
  private val listDoa: List<DoaModel>,
  private val clickListener: (doaModel: DoaModel) -> Unit
) : RecyclerView.Adapter<AdminMainViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdminMainViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val viewDataBinding = ItemDoaBinding.inflate(inflater, parent, false)
    return AdminMainViewHolder(viewDataBinding)
  }

  override fun getItemCount(): Int {
    return listDoa.size
  }

  override fun onBindViewHolder(holder: AdminMainViewHolder, position: Int) {
    holder.bind(listDoa[position], clickListener)
  }

}