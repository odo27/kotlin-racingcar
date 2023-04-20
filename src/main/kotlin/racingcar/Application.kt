package racingcar

import racingcar.controller.RacingGameController
import racingcar.view.InputView
import racingcar.view.OutputView

fun main() {
    val inputView = InputView()
    val outputView = OutputView()
    val racingGameController = RacingGameController(inputView, outputView)
    racingGameController.run()
}
