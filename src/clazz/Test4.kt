package clazz

// 重写属性
open class Shape1 {
    // 使用open关键字表示该属性可以被重写
    open val vertexCount: Int = 0
}

class Rectangle1 : Shape1() {
    // 使用override关键字表示重写父类属性
    override val vertexCount = 4
}
