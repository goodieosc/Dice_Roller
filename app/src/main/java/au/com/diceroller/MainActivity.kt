package au.com.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    //Declare variable with no value before onCreate. Improves performance.
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Define variable before running in function so it does not run each time rollButton is clicked.
        diceImage = findViewById(R.id.dice_image)

        // Creating a binding object for the main_activity.xml layout
        //var binding = ActivityMainBinding.inflate(layoutInflater)

        val rollButton: Button = findViewById(R.id.roll_button)

        // Create a reference to the roll button
        rollButton.text = "Let's Roll"


        rollButton.setOnClickListener {
            //Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_5
        }
        diceImage.setImageResource(drawableResource)
    }
}