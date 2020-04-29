package nullsafety

fun main() {
    val b: String? = "bcd"
    // 使用安全调用操作符 ?.
    // b 非空，就返回 b.length，否则返回 null，这个表达式的类型是 Int?
    val length = b?.length

    //安全调用在链式调用中很有用。例如，如果一个员工 Bob 可能会（或者不会）分配给一个部门， 并且可能有另外一个员工是该部门的负责人，那么获取 Bob 所在部门负责人（如果有的话）的名字，我们写作：
    //bob?.department?.head?.name
    //如果任意一个属性（环节）为空，这个链式调用就会返回 null。
}
