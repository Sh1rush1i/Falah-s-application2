package com.falahsapplication.app.modules.minuman.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.falahsapplication.app.R
import com.falahsapplication.app.databinding.RowMinumanBinding
import com.falahsapplication.app.modules.minuman.`data`.model.MinumanRowModel
import kotlin.Int
import kotlin.collections.List

class MinumanAdapter(
  var list: List<MinumanRowModel>
) : RecyclerView.Adapter<MinumanAdapter.RowMinumanVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMinumanVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_minuman,parent,false)
    return RowMinumanVH(view)
  }

  override fun onBindViewHolder(holder: RowMinumanVH, position: Int) {
    val minumanRowModel = MinumanRowModel()
    // TODO uncomment following line after integration with data source
    // val minumanRowModel = list[position]
    holder.binding.minumanRowModel = minumanRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MinumanRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: MinumanRowModel
    ) {
    }
  }

  inner class RowMinumanVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMinumanBinding = RowMinumanBinding.bind(itemView)
  }
}
