package it.iacovelli.helper

class RuffleHelper {

    companion object {

        /**
         * This helper method is used to check if there is another number of the same dozen
         */
        @JvmStatic
        fun validateNumberRow(number: Int, row: List<Int>): Boolean {
            val d = number.div(10)
            for (n in row) {
                if (d == n.div(10)) return false
            }
            return true
        }

    }

}