package app.somnus.com.androidfactorydemo.bean

import app.somnus.com.androidfactorydemo.`interface`.IComputer

/**
 * Created by Somnus on 2018/7/10.
 *
 */
class XiaoMiComputer : IComputer {
    override fun computer() {
        System.out.println("小米笔记本")
    }
}

class HuaWeiComputer : IComputer {
    override fun computer() {
        System.out.println("华为笔记本")
    }
}