import java.util.Scanner

fun main() {
    println("Welcome to the program! Initializing shapes.")
    var mySquare: Shape = Square("Square")
    var myCircle: Shape = Circle("Circle")
    var myTriangle: Shape = Triangle("Triangle")
    var myEquilateralTriangle: Shape = EquilateralTriangle("Equilateral Triangle")
    val reader = Scanner(System.`in`)

    println("Enter square length: ")
    var length:Int = reader.nextInt()
    println("Enter square height: ")
    var height:Int = reader.nextInt()

    //Set the square dimensions
    (mySquare as Square).setDimensions(length, height)

    println("Enter circle radius: ")
    var radius:Int = reader.nextInt()

    //Set the circle dimensions
    (myCircle as Circle).setDimensions(radius)

    println("Enter triangle side 1: ")
    var side1:Int = reader.nextInt()
    println("Enter triangle side 2: ")
    var side2 = reader.nextInt()
    println("Enter triangle side 3: ")
    var side3 = reader.nextInt()

    //Set the triangle dimensions
    (myTriangle as Triangle).setDimensions(side1, side2, side3)

    println("Enter equilateral triangle size: ")
    var size:Int = reader.nextInt()

    //Set the equilateral triangle dimensions
    (myEquilateralTriangle as EquilateralTriangle).setDimensions(size)

    print("${mySquare.name} ")
    mySquare.printDimensions()
    print(" Area: ${mySquare.getArea()} \n")

    print("${myCircle.name} ")
    myCircle.printDimensions()
    print(" Area: ${myCircle.getArea()} \n")

    print("${myTriangle.name} ")
    myTriangle.printDimensions()
    print(" Area: ${myTriangle.getArea()} \n")

    print("${myEquilateralTriangle.name} ")
    myEquilateralTriangle.printDimensions()
    print(" Area: ${myEquilateralTriangle.getArea()}")
}