package racingcar.view

import racingcar.domain.Car
import racingcar.domain.Cars
import racingcar.domain.Position

class OutputView {

    fun printRound(cars: Cars) = cars.cars.forEach { printCar(it) }

    private fun printCar(car: Car) = println("${car.name.name} : ${toDash(car.position)}")

    private fun toDash(position: Position): String = DASH.repeat(position.position)

    companion object {
        private const val DASH = "-"
    }
}
