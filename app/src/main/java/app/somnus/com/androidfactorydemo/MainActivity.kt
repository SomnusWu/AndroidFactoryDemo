package app.somnus.com.androidfactorydemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import app.somnus.com.androidfactorydemo.bean.HuaWei
import app.somnus.com.androidfactorydemo.bean.XiaoMi


/**
 *-------------------------------------------------------------
 * 工厂模式
 *-------------------------------------------------------------
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mXiaoMi = XiaoMi()
        mXiaoMi.createPhone().phone()       //System.out: 小米手机
        mXiaoMi.createComputer().computer() //System.out: 小米笔记本

        val mHuaWei = HuaWei()
        mHuaWei.createPhone().phone()       //System.out: 华为手机
        mHuaWei.createComputer().computer() //System.out: 华为电脑


    }
}
