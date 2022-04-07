
def f2(a: Int): Boolean =
    if (a > 7) true
    else false

def f3(s: String, n: Int): Unit = {
    repeat(n) {
        println(s)
    }
}
def f4(): Int = {
    var a = readInt("")
    var b = readInt("")
    if (a > b) a
    else b
}

def f5(s:Seq[String]):Seq[String] = 
    Seq(s(0), s(2), s(4))
    
def f6(o: Seq[Int]): Int = o.head