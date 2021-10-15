package com.devlv.cuonglvtc04444.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class BaseAdapter<T : Any>(@LayoutRes private val resLayout: Int) :
    RecyclerView.Adapter<BaseViewHolder>() {
    private lateinit var layoutInflater: LayoutInflater;


    var data: List<T>? = null
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    var listener: ListItemListener? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        if (!::layoutInflater.isInitialized)
            layoutInflater = LayoutInflater.from(parent.context)
        val viewBinding =
            DataBindingUtil.inflate<ViewDataBinding>(layoutInflater, resLayout, parent, false)
        return BaseViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        bind(holder, position)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int, payloads: MutableList<Any>) {
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, position, payloads)
        } else bind(holder, position)
    }

    open fun bind(holder: BaseViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return data?.size ?: 0
    }

}