import implementation.*
import kotlin.random.Random
import kotlin.system.measureNanoTime

const val LIST_MAX_SIZE = 1_000_000

fun main() {
    val charRange: CharRange = ('A'..'Z')
    val intListSize: Int = Random.nextInt(from = 2, until = LIST_MAX_SIZE)
    val unorderedIntList: List<Int> = List(intListSize) { it + 1 }.shuffled()
    val unorderedCharList: List<Char> = charRange.toList().shuffled()
    val unorderedWordList: List<String> = List(10) {
        List(5) { charRange.toList().random() }.shuffled().joinToString("")
    }.shuffled()

    val quickSort = QuickSort()
    val insertionSort = InsertionSort()
    val selectionSort = SelectionSort()
    val bubbleSort = BubbleSort()
    val mergeSort = MergeSort()

    println("Int list size: ${unorderedIntList.size}")
    println("Int list: ${unorderedIntList.take(10)}...")
    println("Char list: $unorderedCharList")
    println("Word list: $unorderedWordList")

    println("\n### Quick Sort Algorithm (Divide And Conquer Approach) - Partitioning Method ###")
    val howSlowIsQuickSort = measureNanoTime{ quickSort.sortIntList(unorderedIntList) }
    println("took ${howSlowIsQuickSort / 1000} microseconds to execute!")

    println("\n### Insertion Sort Algorithm - Insertion Method ###")
    val howSlowIsInsertionSort = measureNanoTime{ insertionSort.sortIntList(unorderedIntList) }
    println("took ${howSlowIsInsertionSort / 1000} microseconds to execute!")

    println("\n### Selection Sort Algorithm - Selection Method ###")
    val howSlowIsSelectionSort = measureNanoTime{ selectionSort.sortIntList(unorderedIntList) }
    println("took ${howSlowIsSelectionSort / 1000} microseconds to execute!")

    println("\n### Bubble Sort Algorithm - Exchanging Method ###")
    val howSlowIsBubbleSort = measureNanoTime{ bubbleSort.sortIntList(unorderedIntList) }
    println("took ${howSlowIsBubbleSort / 1000} microseconds to execute!")

    println("\n### Merge Sort Algorithm (Divide And Conquer Approach) - Merging Method ###")
    val howSlowIsMergeSort = measureNanoTime{ mergeSort.sortIntList(unorderedIntList) }
    println("took ${howSlowIsMergeSort / 1000} microseconds to execute!")

    println("\n*** Which one is the best??? ***")
    println("\n''' It depends, they all have their best, worst, and average cases!!! '''")
}