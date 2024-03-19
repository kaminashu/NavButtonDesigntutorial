package www.uzmd.tutorialbuttonnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import www.uzmd.tutorialbuttonnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}