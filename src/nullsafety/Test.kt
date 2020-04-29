package nullsafety

// kotlin使用空安全来消除来自代码空引用的危险

fun main() {

    //定义一个不可为空的引用
    var a: String = "abc"
//    a = null //编译错误

    //定义一个可以为空的引用, 在类型后面加?表示可为空
    var b: String? = "abc"
    b = null //ok
    println(b)

    // 调用a引用中的属性，因为a不可为空，所有不会发生NPE
    val l1 = a.length
    // 直接调用可为空的b引用的中的方法，会报编译错误，因为b引用有可能为空，可能会发生NPE
//    val l2 = b.length // 编译错误
}
