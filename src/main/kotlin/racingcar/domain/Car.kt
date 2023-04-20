package racingcar.domain

class Car(val name: Name, val position: Position = Position()) {

    fun move(): Car = Car(name, position.increase())
}
