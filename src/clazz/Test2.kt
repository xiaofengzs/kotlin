package clazz

// 继承
// 在kotlin中所有的类都有一个超类 Any
class Example // 隐式的继承Any

// Any中定义了三个方法 equals(), hashCode(), toString(), 所以在任何类中有具有它们

// 默认情况下定义的类是final，也就是不可继承的
// 添加open关键词，类就可以继承
open class Base(p: Int)

// 定义一个类，并继承Base类，继承类写在Class header后面
// 如果子类有主构造器，那么父类必须在子类的class header初始化
class Derived(p: Int) : Base(p)

// 如果子类中没有主构造器，那么每一个从构造器必须初始化父类使用super关键字
// 或者将初始化任务代理给这样做的其他从构造器
class Derived2 : Base{
    constructor(p: Int) : super(p)

    constructor(p: Int, k: Int) : this(p)
}


