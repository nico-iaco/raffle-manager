package it.iacovelli.model

class RuffleFolderRow {

    //Each row can't have more than 5 number

    private val numberRow : MutableList<Int> = Arraylist()

    fun getNumberRow() : List<Int> {
        return ImmutableList.of(numberRow)
    }

    fun addNumber(number: Int) {
        if numberRow.size == 5 throw TooManyNumbersIntoRowException("Limite di numeri in questa riga raggiunto") 
        numberRow.add(number)
    }

}