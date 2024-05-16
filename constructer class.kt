class myhome{
    var type:String?=null
    var price:Double?=null
    var yearBuilt:Int?=null
    var owner:String?=null
constructor(type:String){
   this.type = type
   this.price = 123.32
    this.owner = "s"
    this.yearBuilt = 1986

    print(type)
}
//    init {
//        this.type = type1
//        this.price = price1
//        this.owner = owner1
//        this.yearBuilt = yearBuilt1
//    }


}

fun main(args: Array<String>) {
//    var home1 =  myhome("3 bed",12000.9,1975,"Ali")
//    var home2 = myhome("3 bed",12000.9,1975,"Gamal")
    var home3 = myhome("ali")

}