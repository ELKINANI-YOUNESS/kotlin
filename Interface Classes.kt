//Interface classes = classes that have methods without bodies
interface InputHandler{
    fun clicked()
    fun doubleClick()

}
class Phone:InputHandler{
    override fun doubleClick() {
      println("doubleClick")
    }

    override fun clicked() {
     println("clicked")
    }

}

fun main(args: Array<String>) {
    var test = Phone()
    test.clicked()
    test.doubleClick()
}

