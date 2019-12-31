package it.iacovelli.model

import com.google.common.collect.ImmutableList
import it.iacovelli.exception.TooManyNumbersIntoRowException

class RuffleFolderRow {

    //Each row can't have more than 5 number

    private val numberRow : MutableList<Int> = ArrayList()

    fun getNumberRow() : List<Int> {
        return ImmutableList.copyOf(numberRow)
    }

    fun addNumber(number: Int) {
        if (numberRow.size == 5) throw TooManyNumbersIntoRowException("Limite di numeri in questa riga raggiunto")
        numberRow.add(number)
    }

}