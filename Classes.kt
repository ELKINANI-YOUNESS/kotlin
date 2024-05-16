class home(){
    var type:String?=null
    var price:Double?=null
    var yearBuilt:Int?=null
    var owner:String?=null

    fun myfun(type1:String,price1:Double,yearBuilt1:Int,owner1:String){

        println(type1+price1+yearBuilt1+owner1)
    }

}

fun main(args: Array<String>) {
    home().myfun("3 bed",12000.9,1975,"Ali")
}