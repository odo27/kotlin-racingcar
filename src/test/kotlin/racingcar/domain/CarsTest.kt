package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarsTest {

    @Test
    fun `move 메서드는 모든 차들을 이동시킨다`() {
        val cars = Cars(
            mutableListOf(
                Car(Name("1"), Position(3)),
                Car(Name("2"), Position(4)),
                Car(Name("3"), Position(5))
            ), TestNumberGenerator(mutableListOf(false, true, true))
        )
        cars.moveAll()
        assertThat(cars.cars[0].name).isEqualTo(Name("1"))
        assertThat(cars.cars[0].position).isEqualTo(Position(3))
        assertThat(cars.cars[1].name).isEqualTo(Name("2"))
        assertThat(cars.cars[1].position).isEqualTo(Position(5))
        assertThat(cars.cars[2].name).isEqualTo(Name("3"))
        assertThat(cars.cars[2].position).isEqualTo(Position(6))
    }
}
