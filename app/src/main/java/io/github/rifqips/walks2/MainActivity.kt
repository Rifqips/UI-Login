package io.github.rifqips.walks2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.material_login_button)

        btnIntent.setOnClickListener(this)



    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.material_login_button -> run {
                val ReciveActivity = Intent(this@MainActivity, ReceiveActivity::class.java)
                startActivity(ReciveActivity)
                Toast.makeText(this, "Enjoy The Trip !", Toast.LENGTH_SHORT).show()
            }
        }
    }


}