package nullsafety

fun main() {
    // Elvis 操作符
    //当我们有一个可空的引用 b 时，我们可以说“如果 b 非空，我使用它；否则使用某个非空的值”：
    val b: String = "abc"
    val l: Int = if (b != null) b.length else -1
    //除了完整的 if-表达式，这还可以通过 Elvis 操作符表达，写作 ?:：
    val l2 = b?.length ?: -1
    //如果 ?: 左侧表达式非空，elvis 操作符就返回其左侧表达式，否则返回右侧表达式。 请注意，当且仅当左侧为空时，才会对右侧表达式求值。
}
