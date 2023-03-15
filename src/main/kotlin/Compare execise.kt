fun main(args: Array<String>) {
    print("Enter You Age")
    var age:Int = readLine()!!.toInt()
    if (age >= 18){
        print("Welacome to the club")
    }
    else{
        print("Sorry we cant admit underage")
    }



}