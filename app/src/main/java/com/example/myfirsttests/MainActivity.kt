package com.example.myfirsttests

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirsttests.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private val emailValidator = EmailValidator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        with(binding){
            this?.emailInput?.addTextChangedListener(emailValidator)

            this?.saveButton?.setOnClickListener{
                if (emailValidator.isValid) {
                    Toast.makeText(this@MainActivity, getString(R.string.valid_email), Toast.LENGTH_SHORT).show()
                } else {
                    val errorEmail = getString(R.string.invalid_email)
                    emailInput.error = errorEmail
                    Toast.makeText(this@MainActivity, errorEmail, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}