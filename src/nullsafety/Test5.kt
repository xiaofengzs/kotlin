package nullsafety

fun main() {
    // !! 操作符
    //第三种选择是为 NPE 爱好者准备的：非空断言运算符（!!）将任何值转换为非空类型，若该值为空则抛出异常。
    // 我们可以写 b!! ，这会返回一个非空的 b 值 （例如：在我们例子中的 String）或者如果 b 为空，就会抛出一个 NPE 异常：
    val b: String? = "abc"
    val l = b!!.length
    //因此，如果你想要一个 NPE，你可以得到它，但是你必须显式要求它，否则它不会不期而至。
}