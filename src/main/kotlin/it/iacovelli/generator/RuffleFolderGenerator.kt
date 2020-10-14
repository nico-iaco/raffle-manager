package it.iacovelli.generator

import it.iacovelli.model.RuffleFolder
import it.iacovelli.model.RuffleFolderRow
import kotlin.random.Random

/**
 * This is the service class which provide the generation of a ruffle folder
 * @param from the smallest number of the range
 * @param to the biggest number of the range
 * @throws IllegalArgumentException if from is bigger than to
 *
 * @author nico-iaco
 * @since 1.0
 */
class RuffleFolderGenerator(from: Int, to: Int) {

    private val numberList: MutableList<Int> = ArrayList()

    private var range: IntRange

    init {
        if (to < from) {
            throw IllegalArgumentException("\"to\" must be greater than \"from\"")
        }
        range = IntRange(from, to)
        initialize()
    }

    /**
     * This method generates the ruffle folder
     * @param folderNumber the id of the folder
     * @return the ruffle folder
     */
    fun generateRuffleFolder(folderNumber: Int) : RuffleFolder {
        val folder = RuffleFolder(folderNumber)
        folder.firstRow = generateRuffleFolderRow()
        folder.secondRow = generateRuffleFolderRow()
        folder.thirdRow = generateRuffleFolderRow()
        initialize()
        return folder
    }

    private fun generateRuffleFolderRow() : RuffleFolderRow {
        val row = RuffleFolderRow()
        while (row.getNumberRow().size < 5) {
            val index = Random.nextInt(0, numberList.size)
            val number = numberList.removeAt(index)
            try {
                row.addNumber(number)
            } catch (e: IllegalArgumentException) {
                numberList.add(number)
                continue
            }

        }
        row.sortRow()
        return row
    }

    /**
     * This method initializes the number list with the initial range
     */
    fun initialize() {
        numberList.clear()
        numberList.addAll(range)
    }

}
