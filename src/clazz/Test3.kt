package clazz

// 重写方法
open class Shape {
    // 使用open关键表示这个方法可以被重写
    open fun draw() {}
    fun fill() {}
}

class Circle() : Shape() {
    // 使用override关键字表示重写父类中的方法
    override fun draw() {
        // 使用super关键字调用父类的方法
        super.draw()
    }
}

open class Rectangle() : Shape() {
    // 使用final关键字表示该方法不可被重写
    final override fun draw() {}
}

