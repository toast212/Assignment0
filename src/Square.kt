class Square(name: String) : Shape(name) {
    private var length: Int = 0
    private var height: Int = 0

    fun setDimensions(length: Int, height: Int) {
        this.length = length
        this.height = height
    }

    override fun printDimensions() {
        print("Length: $length, Height: $height")
    }

    override fun getArea(): Double {
        return length * height.toDouble()
    }
}