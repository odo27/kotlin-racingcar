package racingcar.domain

data class Position(val position: Int = 0) {

    init {
        require(position >= MINIMUM_POSITION)
    }

    fun increase(): Position {
        return Position(position + 1)
    }

    companion object {
        private const val MINIMUM_POSITION = 0
    }
}
