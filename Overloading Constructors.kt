//Overloading Constructors التحميل الزائد لدالة البناء

class animal11(){

   var name:String?=null
    var numLegs:Int?=null
    var color:String?=null

    constructor(name: String,numLegs:Int,color:String) : this() {
        this.name = name
        this.numLegs = numLegs
        this.color = color

        println(name)
        println(numLegs)
        println(color)
    }
    constructor(name: String,color: String) :this(){
        this.name = name
        this.color = color

        println(name)
        println(color)
    }
    constructor(name: String) : this(){
        this.name = name
        println(name)

    }
}

fun main(args: Array<String>) {
var lion = animal11("ali")



}