package uri.pdm.atividade_3_layouts

import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ConstraintLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_layout)

        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)

        seekBar?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {}
            override fun onStartTrackingTouch(seek: SeekBar) {}

            override fun onStopTrackingTouch(seek: SeekBar) {
                progressBar.progress = seekBar.progress
                Toast.makeText(this@ConstraintLayoutActivity, seekBar.progress.toString(), Toast.LENGTH_SHORT).show()
            }
        })

        val goBackButton = findViewById<Button>(R.id.goBackButton)
        goBackButton.setOnClickListener() {
            this.finish()
        }
    }
}