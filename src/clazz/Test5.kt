package clazz

//使用interface定义一个接口，接口默认是open，
interface Shape3 {
    //接口中的属性以及方法必须被子类实现
    val vertexCount: Int
    fun draw()
}

class Rectangle3 : Shape3 {
    // 实现接口中的属性以及方法
    override val vertexCount = 4
    override fun draw() { }
}

// 继承一个类并且实现一个接口，继承的类写在前面，接口写在口面
class Test5: Shape(), Shape3 {
    override val vertexCount: Int = 1
    override fun draw() {}
}
