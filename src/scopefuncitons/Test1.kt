package scopefuncitons

// 定义一个数据类
// 在Kotlin中数据类能够帮助生成equals() hashCode() toString() copy()方法，不需要手动重写这些方法
data class Client(val name: String, var postalCode: Int)

fun main() {
    val client = Client("zxf", 123)
    // let run 都会返回闭包的执行结果， 区别在于let有闭包参数，而run没有参数
    client.let { client: Client ->
        Client("tristan", client.postalCode)
    }
    // 在kotlin中 lambda中只有一个参数可以省略使用it代替
    var code = client.let {
        Client("tristan", it.postalCode)
    }
    // 输出结果为 Client(name=tristan, postalCode=123)
    println(code)

    //没有闭包参数，所以使用this来代替调用对象
    val tmp = client.run {
        this.postalCode = 333
        "handsome ${client.name}"
    }
    println(tmp)
}
