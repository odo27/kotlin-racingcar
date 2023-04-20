package racingcar.domain

class RacingGame(val cars: Cars) {

    fun play() = cars.moveAll()
}
