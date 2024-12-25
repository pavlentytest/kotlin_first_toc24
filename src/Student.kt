open class Student(var name: String, var age: Int) {
    var lastname: String = ""
        get() = this.name
        set(value) {
            field = value
        }
}
class Teacher : Student("TTT",12) {

}