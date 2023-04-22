package com.ralvez.myapplicationlayout002
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.ralvez.myapplicationlayout002.databinding.ActivitySignupBinding


class SignupActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySignupBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignup.setOnClickListener {

            val name= binding.etName.text.toString()
            val email= binding.etEmail.text.toString()

            Intent(this, SuccessRActivity::class.java).also {
                it.putExtra("EXTRA_NAME",name)
                it.putExtra("EXTRA_EMAIL",email)
            startActivity(it)
            }
        }
        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Back"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true


    }


}


