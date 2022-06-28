package com.example.fragmentsdos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentsdos.databinding.ActivityResultBinding
import com.example.fragmentsdos.fragments.FifthFragment
import com.example.fragmentsdos.fragments.FourthFragment
import com.example.fragmentsdos.fragments.ThirdFragment

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fragment3 = ThirdFragment()
        val fragment4 = FourthFragment()
        val fragment5 = FifthFragment()

        binding.btnFragment3.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, fragment3)
                addToBackStack(null)
                commit()
            }
        }
        binding.btnFragment4.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, fragment4)
                addToBackStack(null)
                commit()
            }
        }
        binding.btnFragment5.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,fragment5)
                addToBackStack(null)
                commit()
            }
        }
        binding.btnFragment3.setOnClickListener {  supportFragmentManager.beginTransaction()
            .addToBackStack(null).setCustomAnimations(
                R.anim.slide_in,
                R.anim.fade_out,
                R.anim.fade_in,
                R.anim.slide_out
            )
            .replace(R.id.fragmentContainerView,fragment3)
            .commit()}

        binding.btnFragment4.setOnClickListener {supportFragmentManager.beginTransaction()
            .addToBackStack(null).setCustomAnimations(
                R.anim.slide_in,
                R.anim.fade_out,
                R.anim.fade_in,
                R.anim.slide_out
            )
            .replace(R.id.fragmentContainerView,fragment4)
            .commit()}

        binding.btnFragment5.setOnClickListener {supportFragmentManager.beginTransaction()
            .addToBackStack(null).setCustomAnimations(
                R.anim.slide_in,
                R.anim.fade_out,
                R.anim.fade_in,
                R.anim.slide_out
            )
            .replace(R.id.fragmentContainerView,fragment5)
            .commit()}
    }
}
