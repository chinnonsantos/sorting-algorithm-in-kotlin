package implementation

import SortingAlgorithm
//import commons.DebugTools

class BubbleSort: SortingAlgorithm {
    override fun sortIntList(unorderedIntList: List<Int>): List<Int> {
        val sizeList = unorderedIntList.size
        if (sizeList == 0) return unorderedIntList
        val mutableListOfInt = unorderedIntList.toMutableList()

        for (rightFixedIndex in unorderedIntList.indices) {
            for (leftIndex in 0 until (sizeList - rightFixedIndex - 1)) {
//                DebugTools.printIntList(mutableListOfInt)

                if (mutableListOfInt[leftIndex] > mutableListOfInt[leftIndex + 1]) {
                    val temp = mutableListOfInt[leftIndex]
                    mutableListOfInt[leftIndex] = mutableListOfInt[leftIndex + 1]
                    mutableListOfInt[leftIndex + 1] = temp

//                    DebugTools.printIntList(
//                        mutableListOfInt,
//                        swapped = " swapped ${mutableListOfInt[leftIndex+1]} <-> ${mutableListOfInt[leftIndex]}" +
//                                " | last ${mutableListOfInt[(sizeList - rightFixedIndex - 1)]}"
//                    )
                }
            }
        }
//        DebugTools.printIntList(mutableListOfInt)

        return mutableListOfInt.toList()
    }

    override fun sortCharList(unorderedCharList: List<Char>): List<Char> {
        TODO("Not yet implemented")
    }

    override fun sortWordList(unorderedWordList: List<String>): List<String> {
        TODO("Not yet implemented")
    }
}
