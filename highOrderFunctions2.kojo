/*Напишите слеующие функции высшего порядка
1)
def map(s:Seq[Int], f: Int => Int) : Seq[Int] = {
    //var res = 
    for(..)
    res
}
2)def foreach(s: Seq[Int], f: Int => Int) : Unit = {}
3)def fillter(s: Seq[Int], f: Int => Boolean) : Seq[Int] = {}
4)def reduce(s: Seq[Int], f: (Int, Int) => Int) : Int = {}
5)def exists(s:Seq[Int], f: Int => Boolean) : Boolean = {}
 */
//пример - поиск первого элемента подходящего под уcловие
def findFirst(s: Seq[Int], f: Int => Boolean): Option[Int] = {
    var res: Option[Int] = None
    for(x <- s){
        if(res == None && f(x)) 
            res = Some(x)
    } 
    res
}
//пример - проверяем подходит ли первый элемент под условие
def isFirst(s:Seq[Int] , f: Int => Boolean):Boolean ={
    if(f(s(0))) true else false //можно сократить до f(s(0))
    
}
//используется так
println(isFirst(Seq(1, 2, 3, 4), x => x == 1))
println(isFirst(Seq(1, 2, 3, 4), x => x == 2))
//Дополнительно!
//Можно обобщить функцию для любого типа А, использую генерик параметр [A]
def isFirstA[A](s:Seq[A] , f: A => Boolean):Boolean ={
    if(f(s(0))) true else false    
}
 
isFirstA[String](Seq("a", "b"), s => s.size > 0)
isFirstA[Int](Seq(1, 2 , 3), x => x != 2)
 
