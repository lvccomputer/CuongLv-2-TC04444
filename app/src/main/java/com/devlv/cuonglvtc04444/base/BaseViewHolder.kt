package com.devlv.cuonglvtc04444.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class BaseViewHolder : RecyclerView.ViewHolder {
    val binding: ViewDataBinding

    constructor(itemView: ViewDataBinding) : super(itemView.root) {
        this.binding = itemView
    }
}