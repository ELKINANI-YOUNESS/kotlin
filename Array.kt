fun main(args: Array<String>) {
    var myArray = Array<Double>(5){2.1}
    myArray[0] = 21.3//1
    myArray[1] = 22.4//2
    myArray[2] = 23.5//3
    myArray[3] = 24.6//4
    myArray[4] = 233.2
  //  var myarray2 = arrayOf(23,45,532,34)
    //printing objects
    for (element in myArray){
   //     println(element)
    }
//  printing items inside of the array via index
    for (index in 0..myArray.size-1){
        println(myArray[index])
    }

}