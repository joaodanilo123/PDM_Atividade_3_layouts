package uri.pdm.atividade_3_layouts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val buttons : List<Button> = loadButtons()

    }

    private fun loadButtons() : List<Button> {
        val buttons = ArrayList<Button>();

        val gotoConstraintLayoutButton = findViewById<Button>(R.id.goto_constraint_layout_activity)
        val gotoTableLayoutButton = findViewById<Button>(R.id.goto_table_layout_activity)
        val gotoRelativeLayoutButton = findViewById<Button>(R.id.goto_relative_layout_activity)

        fun defineButtonTargetActivity(button: Button, activity: Class<*>) {
            val intent = Intent(this, activity)
            button.setOnClickListener() {
                startActivity(intent)
            }
        }

        defineButtonTargetActivity(gotoTableLayoutButton, TableLayoutActivity::class.java)
        defineButtonTargetActivity(gotoRelativeLayoutButton, RelativeLayoutActivity::class.java)
        defineButtonTargetActivity(gotoConstraintLayoutButton, ConstraintLayoutActivity::class.java)

        buttons.add(gotoTableLayoutButton)
        buttons.add(gotoRelativeLayoutButton)
        buttons.add(gotoConstraintLayoutButton)

        return buttons
    }

}