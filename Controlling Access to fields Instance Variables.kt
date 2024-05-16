// Controlling Access to fields Instance Variables

// public == default
// private == will not be visible outside this class
// protected = same as private + visible in subclasses

open class animal(){
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

}

open class lion():animal(){
    var numEyes:Int?=null
    var age:Int?=null
    constructor(numEyes:Int,age:Int): this(){
        this.numEyes = numEyes
        this.age = age
        super.name
        println(numEyes)
        println(age)
    }
}


fun main(args: Array<String>) {
var op = animal()
    op.name

}