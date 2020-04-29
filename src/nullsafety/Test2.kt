package nullsafety

// 不可为空的引用，我们可以直接调用它的方法或者属性
// 可为空的引用不能直接调用它的方法或者属性，但是我们还需要访问
fun main() {
    val b: String? = "abc"
    // 在条件中检测null
    // 使用if显示的检测b是否为null
    val l = if (b != null) b.length else -1

    val b2: String? = "bcd"
    // 使用if检测是否为空
    if (b2 != null && b2.length >0) {
        println("String of length is ${b2.length}")
    } else {
        println("Empty Stirng")
    }
}
