package loop

fun main() {
//     kotlin 中提供了5中循环的方式
//     遍历1到10的数字，包含10
    for (i in 1..10 ) {
        println(i)
    }
println()
    // 遍历1到10的数字，不包含10
    for (i in 1 until 10) {
        println(i)
    }

    println()
    // 遍历10到1的数字，包含10 1
    for (i in 10 downTo 1)  {
        println(i)
    }

    println()
    // 遍历1到10的数字，步长为2
    for (i in 1..10 step 2) {
        println(i)
    }

    println()
    // 遍历10次，从0开始
    repeat(10) {
        println(it)
    }
}
