package com.victorhugo.calculadoraflexvh.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.victorhugo.calculadoraflexvh.R
import com.victorhugo.calculadoraflexvh.ui.form.FormActivity
import com.victorhugo.calculadoraflexvh.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    private val TEMPO_AGAURDO_SPLASHSCREEN = 3500L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        carregar()
    }

    private fun carregar() {
//        Carrega a Animação
        val anim = AnimationUtils.loadAnimation(this, R.anim.animacao_splash)
        anim.reset()
        ivLogo.clearAnimation()
//        Roda a Animação
        ivLogo.startAnimation(anim)
//        Chama a próxima tela após 3.5 segundos definifido no splashScreen
        Handler().postDelayed({
            val proxima_tela = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(proxima_tela)
            finish()
        },TEMPO_AGAURDO_SPLASHSCREEN)
    }

}
