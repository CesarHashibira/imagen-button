package com.cesar.imgaenbutton
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer1: MediaPlayer
    private lateinit var mediaPlayer2: MediaPlayer
    private lateinit var mediaPlayer3: MediaPlayer
    private lateinit var mediaPlayer4: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar los MediaPlayers con los sonidos respectivos
        mediaPlayer1 = MediaPlayer.create(this, R.raw.sound1)
        mediaPlayer2 = MediaPlayer.create(this, R.raw.sound2)
        mediaPlayer3 = MediaPlayer.create(this, R.raw.sound3)
        mediaPlayer4 = MediaPlayer.create(this, R.raw.sound4)
    }

    fun playSound1(view: View) {
        mediaPlayer1.start()
    }

    fun playSound2(view: View) {
        mediaPlayer2.start()
    }

    fun playSound3(view: View) {
        mediaPlayer3.start()
    }

    fun playSound4(view: View) {
        mediaPlayer4.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer1.release()
        mediaPlayer2.release()
        mediaPlayer3.release()
        mediaPlayer4.release()
    }
}
