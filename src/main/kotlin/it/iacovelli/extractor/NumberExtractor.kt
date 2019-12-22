package it.iacovelli.extractor

import java.lang.IllegalArgumentException
import kotlin.random.Random

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

    fun getNumber() : Int {
        val index = Random.nextInt(0, numberList.size)
        val number = numberList.removeAt(index)
        return number
    }

    fun initialize() {
        numberList.clear()
        numberList.addAll(range)
    }


}