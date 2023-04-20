package racingcar.domain

data class Count(val count: Int) {

    init {
        require(count >= MINIMUM_COUNT)
    }

    fun next(): Count {
        return Count(count - 1)
    }

    fun hasNext(): Boolean {
        return count >= MINIMUM_COUNT
    }

    companion object {
        private const val MINIMUM_COUNT = 1
    }
}
