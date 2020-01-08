package it.iacovelli.model

class RuffleFolder {

    var id : Int = 0

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