package com.example.kotlinpool

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * @Author 韩永刚
 * @Date 2021/11/27
 * @Desc
 */
class MainAdapter(private val context: Context) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    private val data = mutableListOf<CustomModel>(
        CustomModel("CustomBottomBar", BottomBarActivity::class.java),
        CustomModel("Permission", PermissionActivity::class.java)
    )
    private var onRecyclerViewItemClickListener: OnRecyclerViewItemClickListener? = null

    fun setOnRecyclerViewItemClickListener(onRecyclerViewItemClickListener: OnRecyclerViewItemClickListener){
        this.onRecyclerViewItemClickListener = onRecyclerViewItemClickListener
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_main_adapter, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.tv.text = data[position].text
        holder.tv.setOnClickListener {
            onRecyclerViewItemClickListener?.onItemClick(data[position].clazz)
        }
    }

    override fun getItemCount(): Int = data.size

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv = itemView.findViewById<TextView>(R.id.adapter_tv)
    }

    interface OnRecyclerViewItemClickListener {
        fun onItemClick(clazz: Class<*>)
    }
}