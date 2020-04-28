package visibilitymodifiers

// kotlin中的访问修饰符又四种访问修饰符
// private 表示这个类中的所有成员都是类私有的
// protected 表示这个类以及它的继承都可以访问到
// public 表示这个类以及其他类都可以访问
// internal 是kotlin中特有的，表示一个模块中都可以访问到，跨模块不可以访问

class Test {
    private fun sayHello() {}
}

class Test2 {
    protected fun sayHello() {}
}

class Test3 {
    public fun sayHello() {}
}
