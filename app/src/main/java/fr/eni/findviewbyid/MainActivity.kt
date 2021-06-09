package fr.eni.findviewbyid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.tv_titre)
        val editText = findViewById<EditText>(R.id.et_info_edit_text)
        val ratingBar = findViewById<RatingBar>(R.id.rb_une_note)

        textView.text = "Hello";
        editText.setText("Comment allez vous ??")
        ratingBar.rating = 3F;
    }
}