fun main (args : Array<String>) {
    print("Enter the name of month: ")
    var month= readLine()!!.toString()
    when(month) {
        "1" -> print("january")
        "2" -> print("feb")
        "3" -> print("march")
        "4" -> print("april")
        "5" -> print("may")
        "6" -> print("jun")
        "7" -> print("july")
        "8" -> print("aug")
        "9" -> print("sep")
        "10" -> print("oct")
        "11" -> print("nov")
        "12" -> print("dec")
        else -> print("please enter proper number")
    }
}