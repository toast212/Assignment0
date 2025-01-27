import kotlin.math.sqrt

class EquilateralTriangle(name: String) : Triangle(name) {
    private var side: Int = 0

    fun setDimensions(side: Int) {
    this.side = side
    }

    override fun printDimensions() {
        print("Side: $side")
    }

    override fun getArea(): Double {
        var s: Double = 0.5 * (side * 3)
        return sqrt(s * (s-side) * (s-side) * (s-side))
    }
}