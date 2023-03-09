package implementation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.random.Random

internal class MergeSortTest {
    private val intListSize: Int = Random.nextInt(from = 2, until = 9)
    private val orderedIntList: List<Int> = List(intListSize) { it + 1 }
    private val unorderedIntList: List<Int> = orderedIntList.shuffled()
    private val mergeSort = MergeSort()

    @Test
    fun `When calling sortIntList with unordered list, should return ordered list`() =
        assertEquals(orderedIntList, mergeSort.sortIntList(unorderedIntList))

    @Test
    fun `When calling sortIntList with ordered list, should return ordered list without swapping`() =
        assertEquals(orderedIntList, mergeSort.sortIntList(orderedIntList))

    @Test
    fun `When calling sortIntList with empty list, should return empty list without swapping`() =
        assertEquals(emptyList<Int>(), mergeSort.sortIntList(emptyList()))
}
