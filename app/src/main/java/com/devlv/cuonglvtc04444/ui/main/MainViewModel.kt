package com.devlv.cuonglvtc04444.ui.main

import android.view.View
import androidx.lifecycle.ViewModel
import com.devlv.cuonglvtc04444.R

class MainViewModel : ViewModel() {

    fun onClick(view: View?) {
        view?.let {
            onViewClick(it.id)
        }
    }

    fun onViewClick(vId: Int) {
        when (vId) {
            R.id.btnEx1 -> {

            }
            R.id.btnEx2 -> {

            }
            R.id.btnx3 -> {

            }

        }
    }
}