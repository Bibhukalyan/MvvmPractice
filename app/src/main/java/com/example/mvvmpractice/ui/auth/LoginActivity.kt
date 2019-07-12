package com.example.mvvmpractice.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmpractice.R
import com.example.mvvmpractice.databinding.ActivityLoginBinding
import com.example.mvvmpractice.util.toast

class LoginActivity : AppCompatActivity(),AuthListener {

    lateinit var binding:ActivityLoginBinding
    lateinit var viewModel:AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)

        binding.viewmodel = viewModel

        viewModel.authListener = this@LoginActivity


    }

    override fun onStrated() {
        toast("started")
    }

    override fun onSuccess() {
        toast("success")
    }

    override fun onFailed(message: String) {
        toast(message)
    }
}
