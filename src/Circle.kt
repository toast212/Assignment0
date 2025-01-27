class Circle(name: String) : Shape(name) {
    private var radius: Int = 0

    fun setDimensions(radius: Int) {
        this.radius = radius
    }

    override fun printDimensions() {
        print("Radius: $radius")
    }

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}