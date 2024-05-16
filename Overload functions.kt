//Overload functions

class animal1(){

    fun printAll (name:String,age:Int){

        println(name + age)
    }
    fun printAll (name:String){
        println(name )
    }
    fun printAll (){
        println("test")
    }
}

fun main(args: Array<String>) {
    var lion = animal1()

    lion.printAll("ali",123)
}