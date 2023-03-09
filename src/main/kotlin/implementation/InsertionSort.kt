package implementation

import SortingAlgorithm
import commons.DebugTools

class InsertionSort : SortingAlgorithm {
    override fun sortIntList(unorderedIntList: List<Int>): List<Int> {
        val sizeList = unorderedIntList.size
        if (sizeList == 0) return unorderedIntList
        val mutableListOfInt = unorderedIntList.toMutableList()

        var rightIndex = 1
        while (rightIndex < sizeList) {
            DebugTools.printIntList(mutableListOfInt)

            val temp = mutableListOfInt[rightIndex]
            var leftIndex = rightIndex - 1

            while (leftIndex >= 0 && mutableListOfInt[leftIndex] > temp) {
                DebugTools.printIntList(
                    mutableListOfInt,
                    swapped = " swapped $temp <-> ${mutableListOfInt[leftIndex]}"
                )

                mutableListOfInt[leftIndex + 1] = mutableListOfInt[leftIndex]
                leftIndex -= 1
            }
            mutableListOfInt[leftIndex + 1] = temp
            rightIndex += 1
        }
        DebugTools.printIntList(mutableListOfInt)

        return mutableListOfInt.toList()
    }

    override fun sortCharList(unorderedCharList: List<Char>): List<Char> {
        TODO("Not yet implemented")
    }

    override fun sortWordList(unorderedWordList: List<String>): List<String> {
        TODO("Not yet implemented")
    }
}
