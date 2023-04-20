package racingcar.domain

import kotlin.random.Random
import kotlin.random.nextInt

class RandomNumberGenerator : NumberGenerator {

    override fun generate(): Int {
        return Random.nextInt(0..9)
    }
}
