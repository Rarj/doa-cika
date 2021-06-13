package skripsi.cika.doaharianpaud.listdoa

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import skripsi.cika.doaharianpaud.databinding.ItemDoaBinding
import skripsi.cika.doaharianpaud.repo.listdoa.DoaModel

class ListDoaAdapter(
  private val listDoa: List<DoaModel>,
  private val clickListener: (doaModel: DoaModel) -> Unit
) : RecyclerView.Adapter<ListDoaViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListDoaViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val viewDataBinding = ItemDoaBinding.inflate(inflater, parent, false)
    return ListDoaViewHolder(viewDataBinding)
  }

  override fun getItemCount(): Int {
    return listDoa.size
  }

  override fun onBindViewHolder(holder: ListDoaViewHolder, position: Int) {
    holder.bind(listDoa[position], clickListener)
  }

}