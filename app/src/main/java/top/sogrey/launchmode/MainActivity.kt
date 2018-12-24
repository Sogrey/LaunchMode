package top.sogrey.launchmode

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_activity_id.text = "MAIN Activity"
        btn_standard.setOnClickListener {
            startActivity(Intent(this@MainActivity, StandardActivity::class.java))
        }
        btn_singleTop.setOnClickListener {
            startActivity(Intent(this@MainActivity, SingleTopActivity::class.java))
        }
        btn_singleTask.setOnClickListener {
            startActivity(Intent(this@MainActivity, SingleTaskActivity::class.java))
        }
        btn_singleInstance.setOnClickListener {
            startActivity(Intent(this@MainActivity, SingleInstanceActivity::class.java))
        }
    }
}
