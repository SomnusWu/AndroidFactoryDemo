package app.somnus.com.androidfactorydemo.bean

import app.somnus.com.androidfactorydemo.`interface`.IComputer
import app.somnus.com.androidfactorydemo.`interface`.IPhone
import app.somnus.com.androidfactorydemo.factory.ProductFactory

/**
 * Created by Somnus on 2018/7/10.
 */
class XiaoMi : ProductFactory() {
    override fun createPhone(): IPhone {
        return XiaoMiPhone()
    }

    override fun createComputer(): IComputer {
        return XiaoMiComputer()
    }
}