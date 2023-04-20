package racingcar.controller

import racingcar.domain.CarsFactory
import racingcar.domain.Count
import racingcar.domain.Name
import racingcar.domain.RacingGame
import racingcar.domain.RandomNumberGenerator
import racingcar.view.InputView
import racingcar.view.OutputView

class RacingGameController(private val inputView: InputView, private val outputView: OutputView) {

    fun run() {
        val names = inputView.readNames().map { Name(it) }
        val count = Count(inputView.readCount())
        val cars = CarsFactory.create(names, RandomNumberGenerator())
        val racingGame = RacingGame(cars)
        repeat(count.count) {
            racingGame.play()
            outputView.printRound(racingGame.cars)
        }
    }
}
