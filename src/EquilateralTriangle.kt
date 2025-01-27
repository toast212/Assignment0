import kotlin.math.sqrt

class EquilateralTriangle(name: String) : Triangle(name) {
    fun setDimensions(side: Int) {
        super.setDimensions(side, side, side)
    }

}