package clazz

open class Polygon {
    open fun draw() {}
}

// 使用abstract定义一个抽象类
// 抽象类中不能还有任何实现
abstract class Rectangle2 : Polygon() {
    abstract override fun draw()
}
