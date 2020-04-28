package collectionoperators

fun main() {
    val numbers = arrayListOf<String>("1", "2", "3", "4", "5", "6","6","6", "7", "8", "9", "10")

    // map 它将给定的lambda函数应用于每个后续元素，并返回lambda结果列表。
    // filter 会将满足lambda表达式的元素过滤出来，并返回结果
    // find 会从集合中找到一个满足lambda表达式的元素，并返回
    val filter = numbers.map {
        it.toInt()
    }.filter {
        it > 5
    }.find {
        it == 6
    }

    println(filter)
}
