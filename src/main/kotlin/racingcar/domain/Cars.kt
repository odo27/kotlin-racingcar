package racingcar.domain

class Cars(val cars: MutableList<Car>, private val numberGenerator: NumberGenerator) {

    fun moveAll() = cars.forEachIndexed { index, car -> cars[index] = move(car) }

    private fun move(car: Car): Car = if (numberGenerator.generate() > MOVED_BOUND) car.move() else car

    companion object {
        private const val MOVED_BOUND = 3
    }
}
