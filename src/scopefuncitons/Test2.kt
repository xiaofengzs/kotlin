package scopefuncitons

fun main(args: Array<String>) {
    val client = Client("zxf", 123)
    // also apply 都不会返回闭保的执行结果，区别在于also有必包参数，apply没有闭包参数
    val also = client.also {
        it.postalCode = 999
    }.apply {
        this.postalCode = 888
    }
    // 输出的结果为 Client(name=zxf, postalCode=888)
    // also返回的是调用对象本身
    println(also)
}
