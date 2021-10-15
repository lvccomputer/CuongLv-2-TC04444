package com.devlv.cuonglvtc04444.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<BD : ViewDataBinding> : AppCompatActivity() {

    private lateinit var binding: BD
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = DataBindingUtil.setContentView(this, getLayoutActivityResource())
        binding.lifecycleOwner = this
        initView()
    }

    abstract fun getLayoutActivityResource(): Int;
    abstract fun initView();
}