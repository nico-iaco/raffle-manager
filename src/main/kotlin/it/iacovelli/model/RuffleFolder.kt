package it.iacovelli.model

/**
 * This is the model of the ruffle folder
 * @param id the number of the folder
 *
 * @author nico-iaco
 * @since 1.0
 */
class RuffleFolder(var id: Int) {

    lateinit var firstRow: RuffleFolderRow

    lateinit var secondRow: RuffleFolderRow

    lateinit var thirdRow: RuffleFolderRow

    override fun toString(): String {
        return "RuffleFolder(id=$id, firstRow=$firstRow, secondRow=$secondRow, thirdRow=$thirdRow)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RuffleFolder

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }


}