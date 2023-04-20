package racingcar.domain

class CarsFactory {

    companion object {
        fun create(names: List<Name>, numberGenerator: NumberGenerator): Cars {
            return Cars(names.map { Car(it) }.toMutableList(), numberGenerator)
        }
    }
}
