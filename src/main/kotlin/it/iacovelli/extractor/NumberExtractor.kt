package it.iacovelli.extractor

import java.lang.IllegalArgumentException
import kotlin.random.Random

/**
 * This is the service class to extract a number from a range
 * @param from the smallest number of the range
 * @param to the biggest number of the range
 * @throws IllegalArgumentException if from is bigger than to
 *
 * @author nico-iaco
 * @since 1.0
 */
class NumberExtractor(from: Int, to: Int) {

    private val numberList: MutableList<Int> = ArrayList()

    private var range: IntRange

    init {
        if (to < from) {
            throw IllegalArgumentException("Range di valori errati")
        }
        range = IntRange(from, to)
        initialize()
    }

    /**
     * This method extracts a number from the range and remove it from the list
     * @return the number extracted
     */
    fun getNumber() : Int {
        val index = Random.nextInt(0, numberList.size)
        val number = numberList.removeAt(index)
        return number
    }

    /**
     * This method initializes the number list with the initial range
     */
    fun initialize() {
        numberList.clear()
        numberList.addAll(range)
    }


}