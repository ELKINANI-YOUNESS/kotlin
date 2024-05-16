fun main(args: Array<String>) {

    var myArrayList = ArrayList<String>()
    myArrayList.add("Ali")
    myArrayList.add("Gamal")
    myArrayList.set(0,"ahmed")
    myArrayList.remove("Gamal")
    myArrayList.removeAt(0)
    
   // print(myArrayList.get(0))
    for (element in myArrayList){
    //    println(element)
    }
    for (index in 0..myArrayList.size-1){
        println(myArrayList[index])
    }
}