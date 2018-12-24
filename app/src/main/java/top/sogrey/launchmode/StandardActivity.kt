package top.sogrey.launchmode

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_content.*

class StandardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)
        txt_activity_id.text = this@StandardActivity.toString()
        btn_standard.setOnClickListener {
            startActivity(Intent(this@StandardActivity, StandardActivity::class.java))
        }
        btn_singleTop.setOnClickListener {
            startActivity(Intent(this@StandardActivity, SingleTopActivity::class.java))
        }
        btn_singleTask.setOnClickListener {
            startActivity(Intent(this@StandardActivity, SingleTaskActivity::class.java))
        }
        btn_singleInstance.setOnClickListener {
            startActivity(Intent(this@StandardActivity, SingleInstanceActivity::class.java))
        }
    }
}
