package scopefuncitons

fun main(args: Array<String>) {
    val client = Client("zxf", 123)
    // takeIf 的闭包返回一个判断结果，为false时，takeIf函数会返回空
    // takeUnless与 takeIf相反
    client.takeIf {
        it.name.length > 1
    }?.also { println("name is ${it.name}}") } ?: println("名字长度不足")
    client.takeIf {
        it.name.length > 4
    }?.also { println("name is ${it.name}}") } ?: println("名字长度不足")
}
