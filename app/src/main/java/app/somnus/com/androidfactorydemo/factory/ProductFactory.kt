package app.somnus.com.androidfactorydemo.factory

import app.somnus.com.androidfactorydemo.`interface`.IComputer
import app.somnus.com.androidfactorydemo.`interface`.IPhone

/**
 * Created by Somnus on 2018/7/10.
 */
abstract class ProductFactory {
    //创建手机
    abstract fun createPhone(): IPhone

    //创建笔记本
    abstract fun createComputer(): IComputer

}