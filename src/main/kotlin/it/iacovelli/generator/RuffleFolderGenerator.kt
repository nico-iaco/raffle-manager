package it.iacovelli.generator

import it.iacovelli.model.RuffleFolder
import it.iacovelli.model.RuffleFolderRow
import java.lang.IllegalArgumentException
import kotlin.random.Random

class RuffleFolderGenerator(from: Int, to: Int) {

    private val numberList: MutableList<Int> = ArrayList()

    private var range: IntRange

    init {
        if (to < from) {
            throw IllegalArgumentException("Range di valori errati")
        }
        range = IntRange(from, to)
        initialize()
    }
    
    fun generateRuffleFolder(folderNumber: Int) : RuffleFolder {
        val folder = RuffleFolder()
        folder.id = folderNumber
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

    fun initialize() {
        numberList.clear()
        numberList.addAll(range)
    }

}
