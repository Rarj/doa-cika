package skripsi.cika.doaharianpaud.inputnilai

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import skripsi.cika.doaharianpaud.BR
import skripsi.cika.doaharianpaud.databinding.ItemUserBinding
import skripsi.cika.doaharianpaud.model.UserModel

class InputNilaiMuridAdapter(
  private val userList: ArrayList<UserModel>
) : RecyclerView.Adapter<InputNilaiMuridAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    val viewDataBinding = ItemUserBinding.inflate(inflater, parent, false)
    return ViewHolder(viewDataBinding)
  }

  override fun getItemCount(): Int {
    return userList.size
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(userList[position])
  }

  class ViewHolder(private val viewDataBinding: ItemUserBinding) :
    RecyclerView.ViewHolder(viewDataBinding.root) {
    fun bind(model: UserModel) {
      viewDataBinding.setVariable(BR.userModel, model)
      viewDataBinding.executePendingBindings()
    }
  }

}