package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarTest {

    @Test
    fun `이름으로 생성하면 position은 0이다`() {
        val car = Car(Name("odo"))
        assertThat(car.name).isEqualTo(Name("odo"))
        assertThat(car.position).isEqualTo(Position(0))
    }

    @Test
    fun `position을 설정해 생성할 수 있다`() {
        val car = Car(Name("odo"), Position(5))
        assertThat(car.name).isEqualTo(Name("odo"))
        assertThat(car.position).isEqualTo(Position(5))
    }

    @Test
    fun `move 메서드를 실행하면 같은 이름을 가진 position이 1 증가된 car를 반환한다`() {
        val car = Car(Name("odo"), Position(5))
        val movedCar = car.move()
        assertThat(movedCar.name).isEqualTo(Name("odo"))
        assertThat(movedCar.position).isEqualTo(Position(6))
    }
}
