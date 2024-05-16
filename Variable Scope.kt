
var nameGlobal:String?=null//global

fun main(args: Array<String>) {
   var name = "ali"//local var
    nameGlobal="ahmed"
    print(nameGlobal)
    myName()
}
fun myName(){
    var name = "gamal" // local
    nameGlobal="mohamed"
    println(nameGlobal)
}