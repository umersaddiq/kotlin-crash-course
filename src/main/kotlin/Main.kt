fun main() {
    /// Variables
    println()
    println("Hello World");
    println("Hello From the Kotlin Side")

//    var x: Int = 1
    var x = 120
    println("The value of X is : $x");
    x = 42
    println("The value of X is now : $x");

    /// Constants

//    val a: Int = 3
    val a = 3
    println("The Value of A is : $a")

    var long = 3L
    println("The value of long is : $long")

    val wholeNumber: Int = 3
    val bigNumber = 3L
    val preciseDecimal = 3.33
    val decimal = 3.33f
    val iLoveVegetables = false
    val iLovePizza = true

    /// Operators

    println()
    var firstNumber = 12
    var secondNumber = 2

    println("Sum : ${firstNumber + secondNumber}")
    println("Subtract : ${firstNumber - secondNumber}")
    println("Multiply : ${firstNumber * secondNumber}")
    println("Divide : ${firstNumber / secondNumber}")
    println("Reminder : ${firstNumber % secondNumber}")
    firstNumber = 3
    secondNumber = 4
    println("Division after update : ${firstNumber.toFloat() / (secondNumber.toFloat())}")

    /// Logical Operators

    println()
    val amIAnAdult = true
    val amIAProgrammer = false
    println("And Result : ${amIAnAdult && amIAProgrammer}")
    println("Or Result : ${amIAnAdult || amIAProgrammer}")
    /// Comparison Operators
    println()
    println("Equality Result : ${amIAnAdult == amIAProgrammer}")
    println("Not Equal Result : ${amIAnAdult != amIAProgrammer}")
    println("Inverse Result : ${!(amIAnAdult == amIAProgrammer)}")

    /// Strings

    println()

    val message = "Hello World";
    println("The Message is : $message");
    println("The Message is : $message");

    /// If Else
    println()

    val sum = 1 + 20
    if (sum == 2) {
        println("The value of sum is : 2")
    } else if (sum == 3) {
        println("The value of sum is : 3")
    } else {
        println("The value of sum is : Something else")
    }

    val value = if (sum == 2) 2 else 3
    println("The value of the value is : $value")

    /// Null Value
    /// The DataTypes are not nullable by default

    val nullIntValue: Int? = null
    println("The value of nullIntValue is : ${nullIntValue?.toFloat()}")

    print("Enter First Number : ");
    val numberOne = readLine();
    print("\nEnter Second Number : ");
    val numberTwo = readLine();

//    val result = numberOne?.toInt() ?? 0 + numberTwo?.toInt()
//    val result = numberOne!!.toInt() + numberTwo!!.toInt() /// Not a recommended way
//    val result = (numberOne?.toInt() ?: 0) + (numberTwo?.toInt() ?: 0) /// Recommended way
    val result = (numberOne?.toIntOrNull() ?: 0) + (numberTwo?.toIntOrNull()
        ?: 0) /// Recommended way I case you enter ABC in Input
    println("The Result Is : $result")


    /// Lists


    val _shopping = listOf<String>("Lamborghini", "House", "Rolex"); /// Immutable List

    println("\nShopping List : $_shopping");

    println("First Item : ${_shopping.first()}");
    println("Last Item : ${_shopping.last()}");
    println("Middle Item : ${_shopping[1]}")
    println("Total Items in Shopping list : ${_shopping.count()} - ${_shopping.size}")

    val _mutableShopping = mutableListOf<String>("Lamborghini", "House", "Rolex"); /// Mutable List
    _mutableShopping.add("New Item");
    println("\nChangeable Shopping List : $_mutableShopping");
    _mutableShopping.removeAt(_mutableShopping.count() - 1);
    println("Changeable Shopping List : $_mutableShopping");
    println();
    var counter = 0;
//    while (counter < _shopping.count()) {
    while (counter < _shopping.size) {
        println("Value at $counter is ${_shopping[counter]}");
        counter++;

    }


    /// ForEach Loop

    println("\nForEach Loop")
    _shopping.forEach { item ->
        println(item);
    }

    /// For Loop

    println("\nFor Loop")
    for (item in _shopping) {
        println(item)
    }

    for (i in 1..100) {
        println(i)
    }


    print("Enter the value of N : ")
    val n = (readlnOrNull() ?: "0").toIntOrNull()
    when (n) {
        in 1..2 -> println("N is in range of 1 to 2")
        in 3..10 -> println("N is in range of 3 to 10")
        else -> {
            println("N value is Greater than 10")
        }
    }

    /// Functions

    printOneTo();
    println("isEvenNumber : ${isEvenNumber(2)}");
    println("isEvenNumber : ${isEvenNumberWithDefaultValue()}");
    println("isEvenNumber : ${isEvenNumberWithDefaultValue(num = 12)}");
    println("isOdd : ${32.isOdd()}")

    /// https://www.youtube.com/watch?v=5flXf8nuq60&ab_channel=TraversyMedia 54:55
}

/// Default Value to function parameter
fun isEvenNumberWithDefaultValue(num: Int = 69): Boolean {
    return num % 2 == 0;
}

fun isEvenNumber(num: Int): Boolean {
    return num % 2 == 0;
}

fun printOneTo() {
    for (i in 1..10) {
        println(i);
    }
}

/// Extension Functions

fun Int.isOdd(): Boolean {
    return this % 2 == 1;
}
