package implementation

import LIST_MAX_SIZE
import kotlin.random.Random

internal class QuickSortTest {
    private val intListSize: Int = Random.nextInt(from = 2, until = LIST_MAX_SIZE)
    private val unorderedIntList: List<Int> = List(intListSize) { it + 1 }.shuffled()
    private val quickSort = QuickSort()
}
