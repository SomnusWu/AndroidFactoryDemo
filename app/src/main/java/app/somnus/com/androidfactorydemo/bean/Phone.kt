package app.somnus.com.androidfactorydemo.bean

import app.somnus.com.androidfactorydemo.`interface`.IPhone

/**
 * Created by Somnus on 2018/7/10.
 */
class XiaoMiPhone : IPhone {

    override fun phone() {
        System.out.println("小米手机")
    }
}

class HuaWeiPhone : IPhone {
    override fun phone() {
        System.out.println("华为手机")
    }
}