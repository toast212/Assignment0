import kotlin.math.sqrt

open class Triangle(name: String) : Shape(name) {
    private var side1: Int = 0
    private var side2: Int = 0
    private var side3: Int = 0

    fun setDimensions(side1: Int, side2: Int, side3: Int) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    override fun printDimensions() {
        print("Side 1: $side1, Side 2: $side2, Side 3: $side3")
    }

    override fun getArea(): Double {
        var s: Double = 0.5 * (side1 + side2 + side3)
        return sqrt(s * (s-side1) * (s-side2) * (s-side3))
    }
}