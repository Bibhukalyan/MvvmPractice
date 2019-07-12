package com.example.mvvmpractice.ui.auth

interface AuthListener {
    fun onStrated()
    fun onSuccess()
    fun onFailed(message : String)
}