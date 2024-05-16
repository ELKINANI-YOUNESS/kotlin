//Hierarchical inheritance الوراثة الهرمية

open class A1() {
    var name = "ali"
    var age = 56
    fun printName (n:String){

        println(name)
    }
    fun printName(){

    }

}
open class B2():A1() {

}
class C3:B2(){

}

fun main(args: Array<String>) {
    var inh = C3()
    inh.name = "Gamal"
    inh.printName()
}