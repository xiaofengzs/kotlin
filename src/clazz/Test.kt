package clazz

// 在kotlin中使用class关键字来声明一个类
// 一个类可以有一个主构造器，一个或者多个从构造器。
// 主构造器是类头的一部分
class Person constructor(firstName: String) { /*...*/ }

// 如果主构造器没有任何修饰符，可以省略constructor
class Person2 (firstName: String) { /*...*/ }

//主构造器中不能包含任何代码，所以初始化代码必须放在初始化块中
//初始化代码块使用init来声明，init代码快按照声明顺序执行
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

// 次级构造器
class Person3 {
    // 定义一个属性
    var children: MutableList<Person3> = mutableListOf<Person3>();
    // 次级构造器由constructor引导
    constructor(parent: Person3) {
        parent.children.add(this)
    }
}

// 如果一个类中有主构造器，有次级构造器，次级构造器必须将部分初始化任务代理给从构造器
class Person4(val name: String) {
    var children: MutableList<Person4> = mutableListOf<Person4>();
    constructor(name: String, parent: Person4) : this(name) {
        parent.children.add(this)
    }
}

// 初始化代码块是主构造器的一部分
// 及时一个类中没有现式的调用主构造器，代理也会隐式的发生
class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor")
    }
}

fun main() {
    // 初始化一个对象
    val constructors = Constructors(1)
}
