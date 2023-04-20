package racingcar.domain

class TestNumberGenerator(private val numbers: MutableList<Boolean>) : NumberGenerator {

    override fun generate(): Int {
        if (numbers.removeAt(0)) {
            return 4
        }
        return 3
    }
}
