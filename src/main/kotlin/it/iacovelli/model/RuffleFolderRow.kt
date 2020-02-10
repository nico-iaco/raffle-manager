package it.iacovelli.model

import com.google.common.collect.ImmutableList
import it.iacovelli.exception.TooManyNumbersIntoRowException
import it.iacovelli.helper.RuffleHelper

/**
 * The model of the row of a ruffle folder
 * @see RuffleFolder
 *
 * @author nico-iaco
 * @since 1.0
 */
class RuffleFolderRow {

    //Each row can't have more than 5 number

    private val numberRow : MutableList<Int> = ArrayList()

    fun getNumberRow() : List<Int> {
        return ImmutableList.copyOf(numberRow)
    }

    fun addNumber(number: Int) {
        if (numberRow.size == 5) throw TooManyNumbersIntoRowException("Limite di numeri in questa riga raggiunto")
        if (!RuffleHelper.validateNumberRow(number, numberRow)) throw IllegalArgumentException("Numero non permesso")
        numberRow.add(number)
    }

    fun sortRow() {
        numberRow.sort()
    }

    override fun toString(): String {
        return "RuffleFolderRow(numberRow=$numberRow)"
    }


}