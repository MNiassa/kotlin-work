// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(1997, 8, 23)
    var person1 = Person("Neymar", date)
    println("Name: ${person1.name}, DOB: ${person1.birth}")
}