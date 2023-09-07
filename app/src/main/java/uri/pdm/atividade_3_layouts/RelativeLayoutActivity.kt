package uri.pdm.atividade_3_layouts

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RelativeLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout)

        val goBackButton = findViewById<Button>(R.id.goBackButton)

        goBackButton.setOnClickListener() {
            this.finish()
        }
    }
}