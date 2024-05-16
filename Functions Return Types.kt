import home;
fun main(args: Array<String>) {

    var res = multiply(2,4)
println(res)

    println(myname("ali","gamal"))
}


fun multiply (num1:Int , num2:Int):Int{

    var result :Int = num1 * num2
    return result
}
fun myname(firstname:String ,lastname:String ):String {
    var allname = firstname + lastname
    return allname

}