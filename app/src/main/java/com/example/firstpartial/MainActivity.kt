import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.firstpartial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val username = "rgonzaleza"
    private val password = "rgonzaleza"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnLogin.setOnClickListener {
            val inputUsername = binding.etUsername.text.toString()
            val inputPassword = binding.etPassword.text.toString()

            if (inputUsername == username && inputPassword == password) {

                val intent = Intent(this, UserProfileActivity::class.java).apply {
                    putExtra("USER_DATA", user)
                }
                startActivity(intent)
            } else {
                binding.tvLoginTitle.text = "Login Failed. Try again."
            }
        }
    }
}
