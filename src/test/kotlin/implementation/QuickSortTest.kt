package implementation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.random.Random

internal class QuickSortTest {
    private val intListSize: Int = Random.nextInt(from = 2, until = 9)
    private val orderedIntList: List<Int> = List(intListSize) { it + 1 }
    private val unorderedIntList: List<Int> = orderedIntList.shuffled()
    private val quickSort = QuickSort()

    @Test
    fun `When calling sortIntList with unordered list, should return ordered list`() =
        assertEquals(orderedIntList, quickSort.sortIntList(unorderedIntList))

    @Test
    fun `When calling sortIntList with ordered list, should return ordered list without swapping`() =
        assertEquals(orderedIntList, quickSort.sortIntList(orderedIntList))

    @Test
    fun `When calling sortIntList with empty list, should return empty list without swapping`() =
        assertEquals(emptyList<Int>(), quickSort.sortIntList(emptyList()))
}
