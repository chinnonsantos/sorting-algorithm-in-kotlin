package commons

class DebugTools {
    companion object {
        fun printIntList(list: MutableList<Int>, swapped: String? = null) {
            print("==> list: $list")
            swapped?.let { print(it) }
            println()
        }
    }
}