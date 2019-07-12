package com.example.mvvmpractice.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    var email : String? = null
    var password : String? = null

    var authListener : AuthListener? = null

    fun onLoginButtonClicked(view : View) {
        authListener?.onStrated()
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailed("Invalid login email or password")

            return
        }
        authListener?.onSuccess()
    }

}