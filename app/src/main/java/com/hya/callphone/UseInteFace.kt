package com.hya.callphone

class UseInteFace {

    fun useI(){
        dosss({},{})
        dosss(i = object : aaa(){
            override fun method2(b: String) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun method3() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun method1(a: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
        dosss(object :InteFace{
            override fun method1(a: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun method2(b: String) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun method3() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }

    fun dosss(i : ()->Unit,j:()->Unit) {

    }

    fun dosss(i : InteFace) {
        i.method1(1)
        i.method2("s")
        i.method3()
    }
}

abstract class aaa : InteFace{


}