package companionobject

// 伴生对象
// 使用伴生对象可以定义静态方法
// 伴生对象必须定义在一个类里面
class StringUtils {
    // 使用companion object关键字来引导
    companion object {
        fun isEmpty(str: String): Boolean {
            return "" == str
        }
    }
}

// 使用companion object实现单例对象
class Single private constructor() {
    companion object {
        fun get(): Single {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = Single()
    }
}

fun main() {
    //调用方法
    StringUtils.isEmpty("zxf")

    // 获得单例对象
    val single = Single.get()
}
