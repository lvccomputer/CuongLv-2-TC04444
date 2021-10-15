package com.devlv.cuonglvtc04444.ui.main

import android.view.View
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun onClick(view: View?) {
        view?.let {
            onViewClick(it.id)
        }
    }

    fun onViewClick(vId: Int) {
        when (vId) {
            R.id.btnTest -> {
                getApplication().toast("Test")
            }
            R.id.btnShowLoading -> {
                eventLoading.post(true)
            }
            R.id.btnCancelLoading -> {
                eventLoading.post(false)
            }
            R.id.btnListFragment -> {
                navigationListener?.navigateTo(R.id.action_homeFragment_to_listFragment)
            }
            R.id.btnBaseAdapter -> {
                navigationListener?.navigateTo(R.id.action_homeFragment_to_baseAdapterFragment)
            }
            R.id.btnMediaDemo -> {
                val activity = (navigationListener?.getParentActivity() as MainActivity?)
                activity?.grantPermission {
                    navigationListener?.navigateTo(R.id.action_homeFragment_to_mediaFragment)
                }
            }
            R.id.btnLiveObjectDemo -> {
                navigationListener?.navigateTo(R.id.action_homeFragment_to_listObjectLiveFragment)
            }
            R.id.btnPagerDemo -> {
                navigationListener?.navigateTo(R.id.action_homeFragment_to_pagerTestFragment)
            }
        }
    }
}