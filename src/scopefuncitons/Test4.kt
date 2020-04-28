package scopefuncitons

fun main(args: Array<String>) {
    val client = Client("zxf", 123)
    // takeIf 的闭包返回一个判断结果，为false时，takeIf函数会返回空
    // 重复执行当前闭包
    repeat(5) {
        println(client)
        println(it)
    }
    //通过看源代码可是，with是一个顶层函数，可以对一个输入对象添加一个闭包代码块
    with(client) {
        this.postalCode = 888
        println(this)
    }
}
