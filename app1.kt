fun main ()
{
    val tom = Person ("Tom")
    println("Name: ${tom.name}  Age: ${tom.age}  ")
    val Bob = Employee ("Bob")
    println("Name: ${Bob.name}  Age: ${Bob.age}  ")

}

open class Person (val name: String, open var age: Int = 1)

class  Employee (name: String, override var age: Int = 18) : Person(name, age)
