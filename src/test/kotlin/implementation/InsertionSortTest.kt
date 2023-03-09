package implementation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.random.Random

internal class InsertionSortTest {
    private val intListSize: Int = Random.nextInt(from = 2, until = 9)
    private val orderedIntList: List<Int> = List(intListSize) { it + 1 }
    private val unorderedIntList: List<Int> = orderedIntList.shuffled()
    private val insertionSort = InsertionSort()

    @Test
    fun `When calling sortIntList with random size unordered list, should return ordered list`() =
        assertEquals(orderedIntList, insertionSort.sortIntList(unorderedIntList))

    @Test
    fun `When calling sortIntList with fixed size unordered list, should return ordered list`() =
        assertEquals(listOf(1,2,3,4,5,6,7,8), insertionSort.sortIntList(listOf(8,7,6,5,4,3,2,1)))

    @Test
    fun `When calling sortIntList with small size unordered list, should return ordered list`() =
        assertEquals(listOf(1,2), insertionSort.sortIntList(listOf(2,1)))

    @Test
    fun `When calling sortIntList with ordered list, should return ordered list without swapping`() =
        assertEquals(orderedIntList, insertionSort.sortIntList(orderedIntList))

    @Test
    fun `When calling sortIntList with empty list, should return empty list without swapping`() =
        assertEquals(emptyList<Int>(), insertionSort.sortIntList(emptyList()))
}
