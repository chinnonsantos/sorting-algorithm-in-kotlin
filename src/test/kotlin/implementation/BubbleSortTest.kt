package implementation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.random.Random

internal class BubbleSortTest {
    private val intListSize: Int = Random.nextInt(from = 2, until = 9)
    private val orderedIntList: List<Int> = List(intListSize) { it + 1 }
    private val unorderedIntList: List<Int> = orderedIntList.shuffled()
    private val bubbleSort = BubbleSort()

    @Test
    fun `When calling sortIntList with unordered list, should return ordered list`() =
        assertEquals(orderedIntList, bubbleSort.sortIntList(unorderedIntList))

    @Test
    fun `When calling sortIntList with fixed size unordered list, should return ordered list`() =
        assertEquals(listOf(1,2,3,4,5,6,7,8), bubbleSort.sortIntList(listOf(8,7,6,5,4,3,2,1)))

    @Test
    fun `When calling sortIntList with small size unordered list, should return ordered list`() =
        assertEquals(listOf(1,2), bubbleSort.sortIntList(listOf(2,1)))

    @Test
    fun `When calling sortIntList with ordered list, should return ordered list without swapping`() =
        assertEquals(orderedIntList, bubbleSort.sortIntList(orderedIntList))

    @Test
    fun `When calling sortIntList with empty list, should return empty list without swapping`() =
        assertEquals(emptyList<Int>(), bubbleSort.sortIntList(emptyList()))
}
