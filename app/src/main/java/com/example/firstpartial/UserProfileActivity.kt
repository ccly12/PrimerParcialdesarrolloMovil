package com.example.firstpartial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.firstpartial.databinding.ActivityUserProfileBinding

class UserProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityUserProfileBinding = DataBindingUtil.setContentView(this, R.layout.activity_user_profile)

        val user: User? = intent.getParcelableExtra("USER_DATA")

        user?.let {
            binding.tvUsername.text = "User Name: ${it.username}"
            binding.tvName.text = "Name: ${it.name}"
            val it = null
            binding.tvPhone.text = "Phone: ${it.phone}"
            binding.tvAge.text = "Age: ${it.age}"
        }

        binding.btnUpdate.setOnClickListener {
            binding.tvName.text = "Updated Name: ${user?.name} (actualizado)"
        }
    }
}
