fun main() {


    val student = Student("Ivan",20)
    student.age  // getter
    student.name //getter
    student.lastname = "Petrov"

    val a: Int
    a = 100
    //a = 200
    val b: Int = 1000
    println("$a $b")
    println("Hello ${(a + 100) * 2}")
    //val (x1,y1,z1,p1) = readln().split(" ").map { it.toInt() }

    val result = mult(2, 3)
    if (a > 100) {
        println(">100")
    } else {
        println("< 100")
    }
    when (a) {
        100 -> {
            println("100")
        }

        else -> {
            println("not 100")
        }
    }
    when {
        a > 100 -> println("100")
        a == 2 -> {
            println("2")
        }

        else -> {
            println("not 100")
        }
    }
    val res = when (a) {
        1 -> 8
        else -> 100
    }
    repeat(5) {
        // it
    }
    val numbers = 1..<10
    when (b) {
        in numbers -> {
            println("in $b")
        }

        !in numbers -> {
            println("not in $b")
        }
    }
    for (i in numbers) {
        println(i)
    }
    val array: Array<Int> = arrayOf(1, 3, 4, 6, 7)
    for (i in array.indices) {
        println(array[i])
    }

    var abc: String? = "dfgadfadfg"
    //   abc = null
    println(abc?.length)

    if (abc != null) {
        println(abc.length)
    } else {
        println(0)
    }

    println(abc?.length ?: "Что-то адекватное!")

    // лямбда выражением
    var f1: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    // анонимная функция
    val f2: (Int, Int) -> Int = fun(x: Int, y: Int) = x * y

    val res1 = f1(2, 3) // 5
    val res2 = f2(2, 3) // 6

    val res3 = superfunc(4,5) {
        x: Int, y: Int -> 100*x+200*y-5
    }
    println(res3(3,4)) // 100*(3+4) = 700
}
fun sum(a: Int, b: Int) : Int {
    return a + b
}
fun mult(a: Int, b: Int) = a*b

fun superfunc(a: Int = 3, b: Int = 4, c: (Int, Int) -> Int): (Int, Int) -> Int {
    when (a) {
        3 -> return c
        4 -> return { x: Int, y: Int -> 100*(x + y) }
        else -> return { x: Int, y: Int -> 100*(x - y) }
    }
}

