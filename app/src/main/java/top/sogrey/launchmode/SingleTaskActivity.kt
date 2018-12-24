package top.sogrey.launchmode

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_content.*

class SingleTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)
        txt_activity_id.text = this@SingleTaskActivity.toString()
        btn_standard.setOnClickListener {
            startActivity(Intent(this@SingleTaskActivity, StandardActivity::class.java))
        }
        btn_singleTop.setOnClickListener {
            startActivity(Intent(this@SingleTaskActivity, SingleTopActivity::class.java))
        }
        btn_singleTask.setOnClickListener {
            startActivity(Intent(this@SingleTaskActivity, SingleTaskActivity::class.java))
        }
        btn_singleInstance.setOnClickListener {
            startActivity(Intent(this@SingleTaskActivity, SingleInstanceActivity::class.java))
        }
    }
}
